package gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.initcontainers.securitycontext;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"add","drop"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Capabilities implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Added capabilities
     */
    @com.fasterxml.jackson.annotation.JsonProperty("add")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Added capabilities")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> add;

    public java.util.List<String> getAdd() {
        return add;
    }

    public void setAdd(java.util.List<String> add) {
        this.add = add;
    }

    /**
     * Removed capabilities
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drop")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Removed capabilities")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> drop;

    public java.util.List<String> getDrop() {
        return drop;
    }

    public void setDrop(java.util.List<String> drop) {
        this.drop = drop;
    }
}

