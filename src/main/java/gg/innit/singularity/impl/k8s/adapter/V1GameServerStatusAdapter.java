package gg.innit.singularity.impl.k8s.adapter;

import gg.innit.singularity.impl.k8s.models.V1GameServerState;
import gg.innit.singularity.impl.k8s.models.V1GameServerStatus;
import gg.innit.singularity.resource.GameServerStatus;
import org.jetbrains.annotations.NotNull;

public final class V1GameServerStatusAdapter implements GameServerStatus {
    private final V1GameServerStatus status;
    private final State state;

    public V1GameServerStatusAdapter(V1GameServerStatus status) {
        this.status = status;
        this.state = fromModelState(status.getState());
    }

    @Override
    public @NotNull State state() {
        return this.state;
    }

    private static State fromModelState(V1GameServerState state) {
        switch (state) {
            case CREATING:
                return State.CREATING;
            case STARTING:
                return State.STARTING;
            case SCHEDULED:
                return State.SCHEDULED;
            case REQUEST_READY:
                return State.REQUEST_READY;
            case READY:
                return State.READY;
            case ALLOCATED:
                return State.ALLOCATED;
            case DRAIN:
                return State.DRAIN;
            case SHUTDOWN:
                return State.SHUTDOWN;
            case ERROR:
                return State.ERROR;
            default:
                return State.UNKNOWN;
        }
    }

    private static V1GameServerState toModelState(State state) {
        switch (state) {
            case CREATING:
                return V1GameServerState.CREATING;
            case STARTING:
                return V1GameServerState.STARTING;
            case SCHEDULED:
                return V1GameServerState.SCHEDULED;
            case REQUEST_READY:
                return V1GameServerState.REQUEST_READY;
            case READY:
                return V1GameServerState.READY;
            case ALLOCATED:
                return V1GameServerState.ALLOCATED;
            case DRAIN:
                return V1GameServerState.DRAIN;
            case SHUTDOWN:
                return V1GameServerState.SHUTDOWN;
            case ERROR:
                return V1GameServerState.ERROR;
            default:
                return V1GameServerState.UNKNOWN;
        }
    }
}
