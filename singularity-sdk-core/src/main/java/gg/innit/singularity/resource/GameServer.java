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
