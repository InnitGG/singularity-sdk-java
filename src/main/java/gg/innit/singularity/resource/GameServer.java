package gg.innit.singularity.resource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface GameServer {
    /**
     * @return the current {@link State} of the {@link GameServer}.
     */
    @NotNull State getState();

    /**
     * @return the labels associated with this {@link GameServer}.
     */
    @Nullable Map<String, String> getLabels();

    /**
     * @return a collection of {@link GameServerInstance} associated with this {@link GameServer}.
     */
    @NotNull Collection<@NotNull GameServerInstance> getInstances();

    /**
     * Sets the state of the current server.
     *
     * @param state the desired server state.
     */
    @NotNull CompletableFuture<Void> setState(@NotNull State state);

    /**
     * Sets a label for this {@link GameServer}.
     *
     * @param key   the key of the label
     * @param value the value of the label
     */
    @NotNull CompletableFuture<Void> setLabel(String key, String value);

    /**
     * Requests the {@link State#READY} state for this {@link GameServer}.
     */
    default @NotNull CompletableFuture<Void> requestReady() {
        return setState(State.REQUEST_READY);
    }

    enum State {
        UNKNOWN(""),
        CREATING("Creating"),
        STARTING("Starting"),
        SCHEDULED("Scheduled"),
        REQUEST_READY("RequestReady"),
        READY("Ready"),
        ALLOCATED("Allocated"),
        DRAIN("Drain"),
        SHUTDOWN("Shutdown"),
        ERROR("Error");

        private final String name;

        State(String name) {
            this.name = name;
        }

        public @NotNull String getName() {
            return name;
        }
    }
}
