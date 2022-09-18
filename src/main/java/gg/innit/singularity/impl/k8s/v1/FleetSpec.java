package gg.innit.singularity.impl.k8s.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"replicas","scheduling","strategy","template"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class FleetSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

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

    /**
     * SchedulingStrategy determines how Singularity should schedule Pods across the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduling")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SchedulingStrategy determines how Singularity should schedule Pods across the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scheduling;

    public String getScheduling() {
        return scheduling;
    }

    public void setScheduling(String scheduling) {
        this.scheduling = scheduling;
    }

    /**
     * DeploymentStrategy describes how to replace existing pods with new ones.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("strategy")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DeploymentStrategy describes how to replace existing pods with new ones.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.Strategy strategy;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(gg.innit.singularity.impl.k8s.v1.fleetspec.Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * GameServerTemplate is the template for the GameServers API
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GameServerTemplate is the template for the GameServers API")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.Template template;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.Template getTemplate() {
        return template;
    }

    public void setTemplate(gg.innit.singularity.impl.k8s.v1.fleetspec.Template template) {
        this.template = template;
    }
}

