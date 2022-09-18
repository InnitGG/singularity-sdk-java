package gg.innit.singularity.impl.k8s.adapter;

import gg.innit.singularity.impl.k8s.v1.GameServer;
import gg.innit.singularity.resource.GameServerInstance;
import gg.innit.singularity.resource.GameServerSpec;
import gg.innit.singularity.resource.GameServerStatus;
import gg.innit.singularity.resource.Metadata;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.dsl.base.PatchContext;
import io.fabric8.kubernetes.client.dsl.base.PatchType;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public final class GameServerAdapter implements gg.innit.singularity.resource.GameServer {
    private final GameServer model;
    private final ObjectMetaAdapter meta;
    private final V1GameServerSpecAdapter spec;
    private final V1GameServerStatusAdapter status;
    private final MixedOperation<GameServer, KubernetesResourceList<GameServer>, Resource<GameServer>> client;

    public GameServerAdapter(GameServer model, MixedOperation<GameServer, KubernetesResourceList<GameServer>, Resource<GameServer>> client) {
        this.model = model;
        this.meta = new ObjectMetaAdapter(model.getMetadata());
        this.spec = new V1GameServerSpecAdapter(model.getSpec());
        this.status = new V1GameServerStatusAdapter(model.getStatus());
        this.client = client;
    }

    @Override
    public @NotNull Metadata meta() {
        return this.meta;
    }

    @Override
    public @NotNull GameServerSpec spec() {
        return this.spec;
    }

    @Override
    public @NotNull GameServerStatus status() {
        return this.status;
    }

    @Override
    public @NotNull CompletableFuture<Collection<@NotNull GameServerInstance>> getInstances() {
        // TODO
        return CompletableFuture.completedFuture(Collections.emptyList());
    }

    @Override
    public @NotNull CompletableFuture<Void> setLabel(@NotNull String key, @NotNull String value) {
        return CompletableFuture.runAsync(() -> {
            this.model.getMetadata().getLabels().put(key, value);
            this.client.inNamespace(this.meta.namespace()).withName(this.meta.name()).patch(PatchContext.of(PatchType.JSON), this.model);
        }).exceptionally(throwable -> {
            throw new CompletionException(throwable);
        });
    }

    @Override
    public @NotNull CompletableFuture<Void> requestReady() {
        JsonObject labels = new JsonObject();
        labels.addProperty(key, value);

        JsonObject metadataPatch = new JsonObject();
        metadataPatch.add("labels", labels);

        JsonObject patch = new JsonObject();
        patch.add("metadata", metadataPatch);

        ObjectMeta meta = this.model.getMetadata();

        // TODO: Is there a way to make this truly async?
        return CompletableFuture.runAsync(() -> {
            try {
                this.client.
                this.client.patch(meta.getNamespace(), meta.getName(),
                        V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH, new V1Patch(patch.toString()))
                    .throwsApiException();
            } catch (ApiException e) {
                throw new CompletionException(e);
            }
        });
    }

}
