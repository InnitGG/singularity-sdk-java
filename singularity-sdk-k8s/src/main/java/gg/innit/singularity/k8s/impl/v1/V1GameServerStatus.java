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

package gg.innit.singularity.k8s.impl.v1;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import gg.innit.singularity.resource.GameServerStatus;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1GameServerStatus implements GameServerStatus {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public @NotNull GameServerStatus.State state() {
        switch (this.state) {
            case CREATING:
                return GameServerStatus.State.CREATING;
            case STARTING:
                return GameServerStatus.State.STARTING;
            case SCHEDULED:
                return GameServerStatus.State.SCHEDULED;
            case REQUEST_READY:
                return GameServerStatus.State.REQUEST_READY;
            case READY:
                return GameServerStatus.State.READY;
            case ALLOCATED:
                return GameServerStatus.State.ALLOCATED;
            case DRAIN:
                return GameServerStatus.State.DRAIN;
            case SHUTDOWN:
                return GameServerStatus.State.SHUTDOWN;
            case ERROR:
                return GameServerStatus.State.ERROR;
            default:
                return GameServerStatus.State.UNKNOWN;
        }
    }

    enum State {
        @JsonProperty("")
        UNKNOWN,
        @JsonProperty("Creating")
        CREATING,
        @JsonProperty("Starting")
        STARTING,
        @JsonProperty("Scheduled")
        SCHEDULED,
        @JsonProperty("RequestReady")
        REQUEST_READY,
        @JsonProperty("Ready")
        READY,
        @JsonProperty("Allocated")
        ALLOCATED,
        @JsonProperty("Drain")
        DRAIN,
        @JsonProperty("Shutdown")
        SHUTDOWN,
        @JsonProperty("Error")
        ERROR
    }
}