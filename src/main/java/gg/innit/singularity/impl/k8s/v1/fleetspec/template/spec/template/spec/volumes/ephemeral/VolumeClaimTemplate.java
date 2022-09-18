package gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes.ephemeral;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class VolumeClaimTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.Metadata metadata;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.Spec spec;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.Spec getSpec() {
        return spec;
    }

    public void setSpec(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.Spec spec) {
        this.spec = spec;
    }
}

