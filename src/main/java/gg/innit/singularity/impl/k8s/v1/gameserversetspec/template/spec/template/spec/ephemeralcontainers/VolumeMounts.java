package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.ephemeralcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"mountPath","mountPropagation","name","readOnly","subPath","subPathExpr"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class VolumeMounts implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Path within the container at which the volume should be mounted.  Must not contain ':'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mountPath")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path within the container at which the volume should be mounted.  Must not contain ':'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String mountPath;

    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    /**
     * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mountPropagation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String mountPropagation;

    public String getMountPropagation() {
        return mountPropagation;
    }

    public void setMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
    }

    /**
     * This must match the Name of a Volume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This must match the Name of a Volume.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Path within the volume from which the container's volume should be mounted. Defaults to \"\" (volume's root).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subPath;

    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    /**
     * Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subPathExpr")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to \"\" (volume's root). SubPathExpr and SubPath are mutually exclusive.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subPathExpr;

    public String getSubPathExpr() {
        return subPathExpr;
    }

    public void setSubPathExpr(String subPathExpr) {
        this.subPathExpr = subPathExpr;
    }
}

