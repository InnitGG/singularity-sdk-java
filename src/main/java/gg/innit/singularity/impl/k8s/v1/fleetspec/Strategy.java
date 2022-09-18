package gg.innit.singularity.impl.k8s.v1.fleetspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"rollingUpdate","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Strategy implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate. --- TODO: Update this to follow our convention for oneOf, whatever we decide it to be.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rollingUpdate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate. --- TODO: Update this to follow our convention for oneOf, whatever we decide it to be.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.strategy.RollingUpdate rollingUpdate;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.strategy.RollingUpdate getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(gg.innit.singularity.impl.k8s.v1.fleetspec.strategy.RollingUpdate rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
    }

    /**
     * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Type of deployment. Can be \"Recreate\" or \"RollingUpdate\". Default is RollingUpdate.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

