package gg.innit.singularity.k8s.impl.v1;

import gg.innit.singularity.k8s.impl.adapter.ObjectMetaAdapter;
import gg.innit.singularity.resource.GameServer;
import gg.innit.singularity.resource.GameServerSpec;
import gg.innit.singularity.resource.GameServerStatus;
import gg.innit.singularity.resource.Metadata;
import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Kind;
import io.fabric8.kubernetes.model.annotation.Version;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
@Group(V1SingularityKubernetesImpl.API_GROUP)
@Version(V1SingularityKubernetesImpl.API_VERSION)
@Kind("GameServer")
public class V1GameServer extends CustomResource<V1GameServerSpec, V1GameServerStatus> implements Namespaced, GameServer {
    @Override
    public @NotNull Metadata meta() {
        return new ObjectMetaAdapter(this.getMetadata());
    }

    @Override
    public @NotNull GameServerSpec spec() {
        return this.getSpec();
    }

    @Override
    public @NotNull GameServerStatus status() {
        return this.getStatus();
    }
}
