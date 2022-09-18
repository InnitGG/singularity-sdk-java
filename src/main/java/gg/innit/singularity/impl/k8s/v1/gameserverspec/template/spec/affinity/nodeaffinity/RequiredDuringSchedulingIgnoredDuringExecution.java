package gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.nodeaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"nodeSelectorTerms"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class RequiredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Required. A list of node selector terms. The terms are ORed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelectorTerms")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Required. A list of node selector terms. The terms are ORed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> nodeSelectorTerms;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(java.util.List<gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }
}

