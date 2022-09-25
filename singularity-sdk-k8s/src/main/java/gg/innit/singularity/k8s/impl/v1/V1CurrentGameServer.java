package gg.innit.singularity.k8s.impl.v1;

import gg.innit.singularity.CurrentGameServer;
import gg.innit.singularity.resource.GameServer;
import gg.innit.singularity.resource.GameServerStatus;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.client.dsl.Resource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public final class V1CurrentGameServer implements CurrentGameServer {
    private final V1SingularityKubernetesImpl impl;
    private final String namespace;
    private final String name;
    private final Resource<V1GameServer> resource;

    public V1CurrentGameServer(V1SingularityKubernetesImpl impl, String namespace, String name) {
        this.impl = impl;
        this.namespace = namespace;
        this.name = name;
        this.resource = impl.gameServers().inNamespace(namespace).withName(name);
    }

    @Override
    public CompletableFuture<@NotNull GameServer> get() {
        return CompletableFuture.supplyAsync(this.resource::get);
    }

    @Override
    public CompletableFuture<@Nullable GameServer> requestReady() {
        return this.setState(GameServerStatus.State.REQUEST_READY);
    }

    private CompletableFuture<@Nullable GameServer> setState(GameServerStatus.State state) {
        ObjectMeta meta = new ObjectMetaBuilder()
            .withNamespace(this.namespace)
            .withName(this.name)
            .build();
        V1GameServerStatus status = new V1GameServerStatus();
        status.setState(this.mapState(state));
        V1GameServer gs = new V1GameServer();
        gs.setMetadata(meta);
        gs.setStatus(status);

        return CompletableFuture.supplyAsync(() -> this.impl.gameServers().resource(gs).patchStatus());
    }

    private V1GameServerStatus.State mapState(GameServerStatus.State state) {
        switch (state) {
            case CREATING:
                return V1GameServerStatus.State.CREATING;
            case STARTING:
                return V1GameServerStatus.State.STARTING;
            case SCHEDULED:
                return V1GameServerStatus.State.SCHEDULED;
            case REQUEST_READY:
                return V1GameServerStatus.State.REQUEST_READY;
            case READY:
                return V1GameServerStatus.State.READY;
            case ALLOCATED:
                return V1GameServerStatus.State.ALLOCATED;
            case DRAIN:
                return V1GameServerStatus.State.DRAIN;
            case SHUTDOWN:
                return V1GameServerStatus.State.SHUTDOWN;
            case ERROR:
                return V1GameServerStatus.State.ERROR;
            default:
                return V1GameServerStatus.State.UNKNOWN;
        }
    }
}
