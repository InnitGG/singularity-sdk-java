package gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fsType","storagePolicyID","storagePolicyName","volumePath"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class VsphereVolume implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType;

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storagePolicyID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storagePolicyID;

    public String getStoragePolicyID() {
        return storagePolicyID;
    }

    public void setStoragePolicyID(String storagePolicyID) {
        this.storagePolicyID = storagePolicyID;
    }

    /**
     * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storagePolicyName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storagePolicyName is the storage Policy Based Management (SPBM) profile name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storagePolicyName;

    public String getStoragePolicyName() {
        return storagePolicyName;
    }

    public void setStoragePolicyName(String storagePolicyName) {
        this.storagePolicyName = storagePolicyName;
    }

    /**
     * volumePath is the path that identifies vSphere volume vmdk
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumePath")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("volumePath is the path that identifies vSphere volume vmdk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumePath;

    public String getVolumePath() {
        return volumePath;
    }

    public void setVolumePath(String volumePath) {
        this.volumePath = volumePath;
    }
}

