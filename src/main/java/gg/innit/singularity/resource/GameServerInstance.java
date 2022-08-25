package gg.innit.singularity.resource;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public interface GameServerInstance {
    /**
     * @return the {@link GameServerInstance}'s specifications.
     */
    @NotNull GameServerInstanceSpec getSpec();

    /**
     * @return the {@link GameServerInstance}'s current {@link State}.
     */
    @NotNull State getState();

    /**
     * Sets the state of the current server.
     *
     * @param state the desired server state.
     */
    @NotNull CompletableFuture<Void> setState(@NotNull State state);

    /**
     * Tracks a player to be connected to this server.
     *
     * @param player the player to add.
     */
    CompletableFuture<Void> addPlayer(@NotNull Player player);

    /**
     * Removes a tracked player that was connected to this server.
     *
     * @param player the player to remove.
     */
    CompletableFuture<Void> removePlayer(@NotNull Player player);

    enum State {
        NOT_READY("NotReady"),
        READY("Ready"),
        ALLOCATED("Allocated");

        private final String name;

        State(String name) {
            this.name = name;
        }

        public @NotNull String getName() {
            return name;
        }
    }
}
