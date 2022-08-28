package gg.innit.singularity.impl.k8s;

import gg.innit.singularity.Singularity;
import gg.innit.singularity.impl.k8s.adapter.V1GameServerAdapter;
import gg.innit.singularity.impl.k8s.models.V1GameServer;
import gg.innit.singularity.impl.k8s.models.V1GameServerList;
import gg.innit.singularity.resource.GameServer;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public final class KubernetesSingularity implements Singularity {
    public static final String API_GROUP = "singularity.innit.gg";
    public static final String API_VERSION = "v1";

    public static final String ENV_GAMESERVER_NAMESPACE = "SINGULARITY_GAMESERVER_NAMESPACE";
    public static final String ENV_GAMESERVER_NAME = "SINGULARITY_GAMESERVER_NAME";

    private final ApiClient client = Config.defaultClient();

    private final GenericKubernetesApi<V1GameServer, V1GameServerList> gameServerClient = new GenericKubernetesApi<>(
        V1GameServer.class, V1GameServerList.class, API_GROUP, API_VERSION, "gameservers", client);

    public KubernetesSingularity() throws IOException {
    }

    public GenericKubernetesApi<V1GameServer, V1GameServerList> getGameServerClient() {
        return this.gameServerClient;
    }

    @Override
    public CompletableFuture<@Nullable GameServer> getCurrentGameServer() {
        String namespace = System.getenv(ENV_GAMESERVER_NAMESPACE);
        String name = System.getenv(ENV_GAMESERVER_NAME);
        if (namespace == null || name == null) return CompletableFuture.completedFuture(null);

        // TODO: Is there a way to make this truly async?
        return CompletableFuture.supplyAsync(() -> {
            try {
                V1GameServer gs = this.gameServerClient.get(namespace, name).throwsApiException().getObject();
                return new V1GameServerAdapter(gs, this.gameServerClient);
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        });
    }
}
