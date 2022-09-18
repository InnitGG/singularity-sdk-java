package gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"nodeAffinity","podAffinity","podAntiAffinity"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Affinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Describes node affinity scheduling rules for the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes node affinity scheduling rules for the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.NodeAffinity nodeAffinity;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.PodAffinity podAffinity;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.PodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAntiAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.PodAntiAffinity podAntiAffinity;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }
}

