package gg.innit.singularity.resource.listener;

import org.jetbrains.annotations.NotNull;

import gg.innit.singularity.resource.GameServer;

public interface GameServerListener {
    void onStateChange(@NotNull GameServer gameServer, @NotNull GameServer.State newState);
}
