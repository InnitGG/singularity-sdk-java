package gg.innit.singularity.impl.k8s.adapter;

import gg.innit.singularity.resource.Metadata;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Objects;

public final class V1ObjectMetaAdapter implements Metadata {
    private final V1ObjectMeta meta;

    public V1ObjectMetaAdapter(V1ObjectMeta meta) {
        this.meta = meta;
    }

    @Override
    public @NotNull String namespace() {
        return Objects.requireNonNull(this.meta.getNamespace());
    }

    @Override
    public @NotNull String name() {
        return Objects.requireNonNull(this.meta.getName());
    }

    @Override
    public @NotNull Map<String, String> labels() {
        return Objects.requireNonNull(this.meta.getLabels());
    }
}
