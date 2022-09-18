package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fsType","readOnly","secretRef","volumeID"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Cinder implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType;

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * secretRef is optional: points to a secret object containing parameters used to connect to OpenStack.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secretRef is optional: points to a secret object containing parameters used to connect to OpenStack.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.cinder.SecretRef secretRef;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.cinder.SecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.cinder.SecretRef secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeID")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeID;

    public String getVolumeID() {
        return volumeID;
    }

    public void setVolumeID(String volumeID) {
        this.volumeID = volumeID;
    }
}

