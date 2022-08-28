package gg.innit.singularity.impl.k8s.adapter;

import gg.innit.singularity.impl.k8s.models.V1GameServer;
import gg.innit.singularity.impl.k8s.models.V1GameServerList;
import gg.innit.singularity.impl.k8s.models.V1GameServerState;
import gg.innit.singularity.impl.k8s.models.V1GameServerStatus;
import gg.innit.singularity.resource.GameServer;
import gg.innit.singularity.resource.GameServerInstance;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public final class V1GameServerAdapter implements GameServer {
    private final V1GameServer model;
    private final GenericKubernetesApi<V1GameServer, V1GameServerList> client;

    public V1GameServerAdapter(V1GameServer model, GenericKubernetesApi<V1GameServer, V1GameServerList> client) {
        this.model = model;
        this.client = client;
    }

    @Override
    public @NotNull State getState() {
        return V1GameServerAdapter.fromModelState(this.model.getStatus().getState());
    }

    @Override
    public @Nullable Map<String, String> getLabels() {
        return this.model.getMetadata().getLabels();
    }

    @Override
    public @NotNull Collection<@NotNull GameServerInstance> getInstances() {
        return Collections.emptyList();
    }

    @Override
    public @NotNull CompletableFuture<Void> setState(@NotNull State state) {
        V1GameServerStatus status = this.model.getStatus();
        status.setState(toModelState(state));

        // TODO: Is there a way to make this truly async?
        return CompletableFuture.runAsync(() -> {
            try {
                this.client.updateStatus(this.model, ignored -> status).throwsApiException();
            } catch (ApiException e) {
                throw new CompletionException(e);
            }
        });
    }

    @Override
    public @NotNull CompletableFuture<Void> setLabel(String key, String value) {
        this.model.getMetadata().putLabelsItem(key, value);

        // TODO: Is there a way to make this truly async?
        return CompletableFuture.runAsync(() -> {
            try {
                this.client.update(this.model).throwsApiException();
            } catch (ApiException e) {
                throw new CompletionException(e);
            }
        });
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
