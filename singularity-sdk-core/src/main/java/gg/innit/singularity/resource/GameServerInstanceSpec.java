package gg.innit.singularity.resource;

import org.jetbrains.annotations.NotNull;

/**
 * The specification for {@link GameServer}.
 */
public interface GameServerInstanceSpec {
    /**
     * @return the capacity of this {@link GameServerInstance}.
     */
    int getCapacity();

    /**
     * @return the map of this {@link GameServerInstance}.
     */
    @NotNull String getMap();
}
