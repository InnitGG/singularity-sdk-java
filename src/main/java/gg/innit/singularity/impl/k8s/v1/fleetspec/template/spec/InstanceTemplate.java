package gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class InstanceTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.instancetemplate.Metadata metadata;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.instancetemplate.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.instancetemplate.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * GameServerInstanceSpec defines the desired state of GameServerInstance
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GameServerInstanceSpec defines the desired state of GameServerInstance")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.instancetemplate.Spec spec;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.instancetemplate.Spec getSpec() {
        return spec;
    }

    public void setSpec(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.instancetemplate.Spec spec) {
        this.spec = spec;
    }
}

