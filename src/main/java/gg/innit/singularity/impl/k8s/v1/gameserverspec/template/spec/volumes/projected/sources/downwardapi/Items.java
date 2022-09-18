package gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.projected.sources.downwardapi;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fieldRef","mode","path","resourceFieldRef"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Items implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.projected.sources.downwardapi.items.FieldRef fieldRef;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.projected.sources.downwardapi.items.FieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.projected.sources.downwardapi.items.FieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    /**
     * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer mode;

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    /**
     * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceFieldRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.projected.sources.downwardapi.items.ResourceFieldRef resourceFieldRef;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.projected.sources.downwardapi.items.ResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.projected.sources.downwardapi.items.ResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }
}

