package gg.innit.singularity.impl.k8s.models;

public final class V1GameServerStatus {
    private V1GameServerState state;

    public V1GameServerState getState() {
        return state;
    }

    public void setState(V1GameServerState state) {
        this.state = state;
    }
}
