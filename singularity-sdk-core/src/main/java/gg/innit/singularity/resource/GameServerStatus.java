package gg.innit.singularity.resource;

import org.jetbrains.annotations.NotNull;

public interface GameServerStatus {
    /**
     * @return the {@link GameServerStatus}'s current {@link State}.
     */
    @NotNull State state();

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
