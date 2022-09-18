package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.Metadata metadata;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Specification of the desired behavior of the pod. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specification of the desired behavior of the pod. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.Spec spec;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.Spec getSpec() {
        return spec;
    }

    public void setSpec(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.Spec spec) {
        this.spec = spec;
    }
}

