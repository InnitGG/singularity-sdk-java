package gg.innit.singularity.resource;

import org.jetbrains.annotations.NotNull;

public interface GameServer {
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
}
