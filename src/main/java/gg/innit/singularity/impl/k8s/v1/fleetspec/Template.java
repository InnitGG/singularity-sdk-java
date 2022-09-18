package gg.innit.singularity.impl.k8s.v1.fleetspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.Metadata metadata;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(gg.innit.singularity.impl.k8s.v1.fleetspec.template.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * GameServerSpec defines the desired state of GameServer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GameServerSpec defines the desired state of GameServer")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.Spec spec;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.Spec getSpec() {
        return spec;
    }

    public void setSpec(gg.innit.singularity.impl.k8s.v1.fleetspec.template.Spec spec) {
        this.spec = spec;
    }
}

