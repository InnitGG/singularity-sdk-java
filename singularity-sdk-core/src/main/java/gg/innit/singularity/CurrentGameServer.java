/*
 *     Singularity is an open-source game server orchestration framework
 *     Copyright (C) 2022 Innit Incorporated
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
