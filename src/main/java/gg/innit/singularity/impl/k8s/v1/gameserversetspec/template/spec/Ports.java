package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"containerPort","name","portPolicy"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Ports implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("containerPort")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String containerPort;

    public String getContainerPort() {
        return containerPort;
    }

    public void setContainerPort(String containerPort) {
        this.containerPort = containerPort;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * PortPolicy determines how Singularity should expose the game server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portPolicy")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PortPolicy determines how Singularity should expose the game server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String portPolicy;

    public String getPortPolicy() {
        return portPolicy;
    }

    public void setPortPolicy(String portPolicy) {
        this.portPolicy = portPolicy;
    }
}

