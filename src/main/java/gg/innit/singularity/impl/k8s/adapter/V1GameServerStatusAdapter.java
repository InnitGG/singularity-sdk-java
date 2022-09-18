package gg.innit.singularity.impl.k8s.adapter;

import gg.innit.singularity.resource.GameServerStatus;
import org.jetbrains.annotations.NotNull;

public final class V1GameServerStatusAdapter implements GameServerStatus {
    private final gg.innit.singularity.impl.k8s.v1.GameServerStatus status;
    private final State state;

    public V1GameServerStatusAdapter(gg.innit.singularity.impl.k8s.v1.GameServerStatus status) {
        this.status = status;
        this.state = fromModelState(status.getState());
    }

    @Override
    public @NotNull State state() {
        return this.state;
    }

    private static State fromModelState(String state) {
        switch (state) {
            case "Creating":
                return State.CREATING;
            case "Starting":
                return State.STARTING;
            case "Scheduled":
                return State.SCHEDULED;
            case "RequestReady":
                return State.REQUEST_READY;
            case "Ready":
                return State.READY;
            case "Allocated":
                return State.ALLOCATED;
            case "Drain":
                return State.DRAIN;
            case "Shutdown":
                return State.SHUTDOWN;
            case "Error":
                return State.ERROR;
            default:
                return State.UNKNOWN;
        }
    }

    private static String toModelState(State state) {
        switch (state) {
            case CREATING:
                return "Creating";
            case STARTING:
                return "Starting";
            case SCHEDULED:
                return "Scheduled";
            case REQUEST_READY:
                return "RequestReady";
            case READY:
                return "Ready";
            case ALLOCATED:
                return "Allocated";
            case DRAIN:
                return "Drain";
            case SHUTDOWN:
                return "Shutdown";
            case ERROR:
                return "Error";
            default:
                return "Unknown";
        }
    }
}
