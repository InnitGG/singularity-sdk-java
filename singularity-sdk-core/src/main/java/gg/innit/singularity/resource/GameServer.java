package gg.innit.singularity.resource;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public interface GameServer {
    // -- Resource properties -- //

    /**
     * @return the metadata of this {@link GameServer}
     */
    @NotNull Metadata meta();

    /**
     * @return the spec of this {@link GameServer}
     */
    @NotNull GameServerSpec spec();

    /**
     * @return the status of this {@link GameServer}
     */
    @NotNull GameServerStatus status();

    // -- Helper functions -- //

    /**
     * @return a collection of {@link GameServerInstance} associated with this {@link GameServer}.
     */
    @Contract(pure = true)
    @NotNull CompletableFuture<Collection<@NotNull GameServerInstance>> getInstances();

    /**
     * Sets a label for this {@link GameServer}.
     *
     * @param key   the key of the label
     * @param value the value of the label
     */
    @Contract(pure = true)
    @NotNull CompletableFuture<Void> setLabel(@NotNull String key, @NotNull String value);

    /**
     * Requests the {@link GameServerStatus.State#READY} state for this {@link GameServer}.
     */
    @Contract(pure = true)
    @NotNull CompletableFuture<Void> requestReady();
}
