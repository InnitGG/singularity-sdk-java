package gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fsType","gateway","protectionDomain","readOnly","secretRef","sslEnabled","storageMode","storagePool","system","volumeName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class ScaleIO implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Default is \"xfs\".")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType;

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * gateway is the host address of the ScaleIO API Gateway.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gateway")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("gateway is the host address of the ScaleIO API Gateway.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String gateway;

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionDomain")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String protectionDomain;

    public String getProtectionDomain() {
        return protectionDomain;
    }

    public void setProtectionDomain(String protectionDomain) {
        this.protectionDomain = protectionDomain;
    }

    /**
     * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * secretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes.scaleio.SecretRef secretRef;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes.scaleio.SecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.volumes.scaleio.SecretRef secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * sslEnabled Flag enable/disable SSL communication with Gateway, default false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("sslEnabled Flag enable/disable SSL communication with Gateway, default false")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean sslEnabled;

    public Boolean getSslEnabled() {
        return sslEnabled;
    }

    public void setSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    /**
     * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storageMode;

    public String getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(String storageMode) {
        this.storageMode = storageMode;
    }

    /**
     * storagePool is the ScaleIO Storage Pool associated with the protection domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storagePool")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storagePool is the ScaleIO Storage Pool associated with the protection domain.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storagePool;

    public String getStoragePool() {
        return storagePool;
    }

    public void setStoragePool(String storagePool) {
        this.storagePool = storagePool;
    }

    /**
     * system is the name of the storage system as configured in ScaleIO.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("system is the name of the storage system as configured in ScaleIO.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String system;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeName;

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }
}

