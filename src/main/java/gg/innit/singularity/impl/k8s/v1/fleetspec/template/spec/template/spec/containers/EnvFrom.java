package gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.containers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configMapRef","prefix","secretRef"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class EnvFrom implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The ConfigMap to select from
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMapRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The ConfigMap to select from")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.containers.envfrom.ConfigMapRef configMapRef;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.containers.envfrom.ConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.containers.envfrom.ConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    /**
     * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String prefix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * The Secret to select from
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Secret to select from")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.containers.envfrom.SecretRef secretRef;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.containers.envfrom.SecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.containers.envfrom.SecretRef secretRef) {
        this.secretRef = secretRef;
    }
}

