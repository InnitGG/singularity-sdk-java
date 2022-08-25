package gg.innit.singularity.impl.k8s;

import gg.innit.singularity.Singularity;
import gg.innit.singularity.resource.GameServer;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.Config;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public final class KubernetesSingularity implements Singularity {
    private final ApiClient client;

    public KubernetesSingularity() throws IOException {
        this.client = Config.defaultClient();
    }

    @Override
    public @Nullable GameServer getCurrentGameServer() {
        return null;
    }
}
