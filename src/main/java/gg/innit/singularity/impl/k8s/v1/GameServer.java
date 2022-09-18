package gg.innit.singularity.impl.k8s.v1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("singularity.innit.gg")
public class GameServer extends io.fabric8.kubernetes.client.CustomResource<gg.innit.singularity.impl.k8s.v1.GameServerSpec, gg.innit.singularity.impl.k8s.v1.GameServerStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

