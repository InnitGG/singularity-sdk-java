package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"drainStrategy","instanceTemplate","instances","ports","scheduling","template","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Spec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("drainStrategy")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.DrainStrategy drainStrategy;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.DrainStrategy getDrainStrategy() {
        return drainStrategy;
    }

    public void setDrainStrategy(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.DrainStrategy drainStrategy) {
        this.drainStrategy = drainStrategy;
    }

    /**
     * GameServerInstanceTemplate is the template for the GameServerInstances API
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceTemplate")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("GameServerInstanceTemplate is the template for the GameServerInstances API")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.InstanceTemplate instanceTemplate;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.InstanceTemplate getInstanceTemplate() {
        return instanceTemplate;
    }

    public void setInstanceTemplate(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.InstanceTemplate instanceTemplate) {
        this.instanceTemplate = instanceTemplate;
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

    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.Ports> ports;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.Ports> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.Ports> ports) {
        this.ports = ports;
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
     * PodTemplateSpec describes the data a pod should have when created from a template
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PodTemplateSpec describes the data a pod should have when created from a template")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.Template template;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.Template getTemplate() {
        return template;
    }

    public void setTemplate(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.Template template) {
        this.template = template;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

