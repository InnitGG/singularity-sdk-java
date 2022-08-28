package gg.innit.singularity.impl.k8s.models;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ListMeta;

import java.util.List;

public final class V1GameServerList implements KubernetesListObject {
    @Override
    public V1ListMeta getMetadata() {
        return null;
    }

    @Override
    public List<V1GameServer> getItems() {
        return null;
    }

    @Override
    public String getApiVersion() {
        return null;
    }

    @Override
    public String getKind() {
        return null;
    }
}
