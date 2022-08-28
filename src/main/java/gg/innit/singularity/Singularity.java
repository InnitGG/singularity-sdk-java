package gg.innit.singularity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import gg.innit.singularity.impl.k8s.KubernetesSingularity;
import gg.innit.singularity.resource.GameServer;

public interface Singularity {
    /**
     * @return the current {@link GameServer}.
     */
    CompletableFuture<@Nullable GameServer> getCurrentGameServer();

    /**
     * @return an instance of Kubernetes implementation using in-cluster config.
     */
    static @NotNull Singularity kubernetes() throws IOException {
        return new KubernetesSingularity();
    }
}
