package gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allocatedInstances","instances","readyInstances","timeout"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class DrainStrategy implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("allocatedInstances")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer allocatedInstances;

    public Integer getAllocatedInstances() {
        return allocatedInstances;
    }

    public void setAllocatedInstances(Integer allocatedInstances) {
        this.allocatedInstances = allocatedInstances;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instances")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer instances;

    public Integer getInstances() {
        return instances;
    }

    public void setInstances(Integer instances) {
        this.instances = instances;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readyInstances")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer readyInstances;

    public Integer getReadyInstances() {
        return readyInstances;
    }

    public void setReadyInstances(Integer readyInstances) {
        this.readyInstances = readyInstances;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer timeout;

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}

