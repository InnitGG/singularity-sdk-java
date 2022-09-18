package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"conditionType"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class ReadinessGates implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * ConditionType refers to a condition in the pod's condition list with matching type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionType")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConditionType refers to a condition in the pod's condition list with matching type.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String conditionType;

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }
}

