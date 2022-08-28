package gg.innit.singularity.impl.k8s.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ObjectMeta;

public final class V1GameServer implements KubernetesObject {
    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("kind")
    private String kind;

    @SerializedName("metadata")
    private V1ObjectMeta metadata;

    @SerializedName("spec")
    private V1GameServerSpec spec;

    @SerializedName("status")
    private V1GameServerStatus status;

    @Override
    public String getApiVersion() {
        return apiVersion;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public V1ObjectMeta getMetadata() {
        return metadata;
    }

    public V1GameServerSpec getSpec() {
        return spec;
    }

    public V1GameServerStatus getStatus() {
        return status;
    }

    public void setMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public void setSpec(V1GameServerSpec spec) {
        this.spec = spec;
    }

    public void setStatus(V1GameServerStatus status) {
        this.status = status;
    }
}
