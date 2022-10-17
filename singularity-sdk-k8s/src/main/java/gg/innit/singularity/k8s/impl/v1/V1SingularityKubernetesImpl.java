package gg.innit.singularity.k8s.impl.v1;

import gg.innit.singularity.CurrentGameServer;
import gg.innit.singularity.k8s.SingularityKubernetes;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class V1SingularityKubernetesImpl implements SingularityKubernetes {
    public static final String API_GROUP = "singularity.innit.gg";
    public static final String API_VERSION = "v1";

    public static final String ENV_GAMESERVER_NAMESPACE = "SINGULARITY_GAMESERVER_NAMESPACE";
    public static final String ENV_GAMESERVER_NAME = "SINGULARITY_GAMESERVER_NAME";

    private final KubernetesClient client;
    private final MixedOperation<V1GameServer, KubernetesResourceList<V1GameServer>, Resource<V1GameServer>> gameServers;
    private final CurrentGameServer currentGameServer;

    public V1SingularityKubernetesImpl() {
        this(new KubernetesClientBuilder().build());
    }

    public V1SingularityKubernetesImpl(KubernetesClient client) {
        this.client = client;
        this.gameServers = client.resources(V1GameServer.class);

        String namespace = System.getenv(ENV_GAMESERVER_NAMESPACE);
        String name = System.getenv(ENV_GAMESERVER_NAME);
        if (namespace != null && name != null) {
            this.currentGameServer = new V1CurrentGameServer(this, namespace, name);
        } else {
            this.currentGameServer = null;
        }
    }

    @Override
    public @Nullable CurrentGameServer current() {
        return this.currentGameServer;
    }

    public KubernetesClient client() {
        return client;
    }

    public MixedOperation<V1GameServer, KubernetesResourceList<V1GameServer>, Resource<V1GameServer>> gameServers() {
        return gameServers;
    }

    @Override
    public void close() {
        this.client.close();
    }
}
