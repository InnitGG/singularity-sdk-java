package gg.innit.singularity.impl.k8s.v1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"state"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class GameServerInstanceStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum State {

        @com.fasterxml.jackson.annotation.JsonProperty("NotReady")
        NOTREADY("NotReady"), @com.fasterxml.jackson.annotation.JsonProperty("Ready")
        READY("Ready"), @com.fasterxml.jackson.annotation.JsonProperty("Allocated")
        ALLOCATED("Allocated");

        java.lang.String value;

        State(java.lang.String value) {
            this.value = value;
        }
    }

    @com.fasterxml.jackson.annotation.JsonProperty("state")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

