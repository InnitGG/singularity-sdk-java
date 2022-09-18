package gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"driver","fsType","nodePublishSecretRef","readOnly","volumeAttributes"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Csi implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("driver")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String driver;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * fsType to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fsType to mount. Ex. \"ext4\", \"xfs\", \"ntfs\". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType;

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodePublishSecretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("nodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.csi.NodePublishSecretRef nodePublishSecretRef;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.csi.NodePublishSecretRef getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.csi.NodePublishSecretRef nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    /**
     * readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeAttributes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> volumeAttributes;

    public java.util.Map<java.lang.String, String> getVolumeAttributes() {
        return volumeAttributes;
    }

    public void setVolumeAttributes(java.util.Map<java.lang.String, String> volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
    }
}

