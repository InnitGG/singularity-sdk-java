package gg.innit.singularity.k8s.impl;

import gg.innit.singularity.k8s.SingularityKubernetes;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;

import java.util.concurrent.CompletableFuture;

public final class SingularityKubernetesImpl implements SingularityKubernetes {
    public static final String API_GROUP = "singularity.innit.gg";
    public static final String API_VERSION = "v1";

    public static final String ENV_GAMESERVER_NAMESPACE = "SINGULARITY_GAMESERVER_NAMESPACE";
    public static final String ENV_GAMESERVER_NAME = "SINGULARITY_GAMESERVER_NAME";

    private final KubernetesClient client = new KubernetesClientBuilder().build();
    //private final MixedOperation<GameServer, KubernetesResourceList<GameServer>, Resource<GameServer>> gameServers =
    //    client.resources(GameServer.class);

    @Override
    public CompletableFuture<gg.innit.singularity.resource.GameServer> getCurrentGameServer() {
        String namespace = System.getenv(ENV_GAMESERVER_NAMESPACE);
        String name = System.getenv(ENV_GAMESERVER_NAME);
        if (namespace == null || name == null) return CompletableFuture.completedFuture(null);


        throw new UnsupportedOperationException("Not implemented.");
        // TODO: Is there a way to make this truly async?
        //return CompletableFuture.supplyAsync(() -> {
        //    GameServer gs = gameServers
        //        .inNamespace(ENV_GAMESERVER_NAMESPACE)
        //        .withName(ENV_GAMESERVER_NAME)
        //        .get();
        //    return new GameServerAdapter(gs, gameServers);
        //});
    }
}
