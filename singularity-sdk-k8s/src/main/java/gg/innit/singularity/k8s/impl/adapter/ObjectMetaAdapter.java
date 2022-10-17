package gg.innit.singularity.k8s.impl.adapter;

import gg.innit.singularity.resource.Metadata;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Objects;

@ApiStatus.Internal
public final class ObjectMetaAdapter implements Metadata {
    private final ObjectMeta meta;

    public ObjectMetaAdapter(ObjectMeta meta) {
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
