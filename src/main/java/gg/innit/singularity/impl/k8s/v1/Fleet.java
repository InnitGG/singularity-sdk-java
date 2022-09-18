package gg.innit.singularity.impl.k8s.v1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("singularity.innit.gg")
public class Fleet extends io.fabric8.kubernetes.client.CustomResource<gg.innit.singularity.impl.k8s.v1.FleetSpec, gg.innit.singularity.impl.k8s.v1.FleetStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

