package gg.innit.singularity;

import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import gg.innit.singularity.resource.GameServer;

public interface Singularity {
    /**
     * @return the current {@link GameServer}.
     */
    CompletableFuture<@Nullable GameServer> getCurrentGameServer();
}
