package gg.innit.singularity.impl.k8s.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"allocatedInstances","allocatedReplicas","instances","readyInstances","readyReplicas","replicas"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class FleetStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

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

    @com.fasterxml.jackson.annotation.JsonProperty("allocatedReplicas")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer allocatedReplicas;

    public Integer getAllocatedReplicas() {
        return allocatedReplicas;
    }

    public void setAllocatedReplicas(Integer allocatedReplicas) {
        this.allocatedReplicas = allocatedReplicas;
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

    @com.fasterxml.jackson.annotation.JsonProperty("readyReplicas")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer readyReplicas;

    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    public void setReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }
}

