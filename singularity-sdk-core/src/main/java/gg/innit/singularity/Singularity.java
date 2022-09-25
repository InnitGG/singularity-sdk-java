package gg.innit.singularity;

import gg.innit.singularity.resource.GameServer;
import org.jetbrains.annotations.Nullable;

public interface Singularity extends AutoCloseable {
    /**
     * Returns {@literal null} if there is no {@link GameServer} associated with the process.
     *
     * @return the APIs representing the current {@link GameServer}.
     */
    @Nullable CurrentGameServer current();
}
