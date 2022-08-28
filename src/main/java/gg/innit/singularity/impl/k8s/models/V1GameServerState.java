package gg.innit.singularity.impl.k8s.models;

import com.google.gson.annotations.SerializedName;

public enum V1GameServerState {
    @SerializedName("")
    UNKNOWN,
    @SerializedName("Creating")
    CREATING,
    @SerializedName("Starting")
    STARTING,
    @SerializedName("Scheduled")
    SCHEDULED,
    @SerializedName("RequestReady")
    REQUEST_READY,
    @SerializedName("Ready")
    READY,
    @SerializedName("Allocated")
    ALLOCATED,
    @SerializedName("Drain")
    DRAIN,
    @SerializedName("Shutdown")
    SHUTDOWN,
    @SerializedName("Error")
    ERROR;
}
