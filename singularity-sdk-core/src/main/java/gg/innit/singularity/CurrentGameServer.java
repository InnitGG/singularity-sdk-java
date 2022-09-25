package gg.innit.singularity;

import gg.innit.singularity.resource.GameServer;
import gg.innit.singularity.resource.GameServerStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * This represents the {@link GameServer} associated with the current process.
 */
public interface CurrentGameServer {
    /**
     * Requests the current {@link GameServer} resource from the server.
     *
     * @return the current {@link GameServer} resource.
     */
    CompletableFuture<@NotNull GameServer> get();

    /**
     * Requests the {@link GameServerStatus.State#READY} state for the current {@link GameServer}.
     * Note that this will internally set the state to {@link GameServerStatus.State#REQUEST_READY}.
     *
     * @return the updated {@link GameServer} object.
     */
    CompletableFuture<@Nullable GameServer> requestReady();
}
