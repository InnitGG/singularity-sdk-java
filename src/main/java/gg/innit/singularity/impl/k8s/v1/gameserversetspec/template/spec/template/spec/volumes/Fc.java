package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"fsType","lun","readOnly","targetWWNs","wwids"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Fc implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. TODO: how do we prevent errors in the filesystem from compromising the machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. TODO: how do we prevent errors in the filesystem from compromising the machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType;

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * lun is Optional: FC target lun number
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lun")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("lun is Optional: FC target lun number")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer lun;

    public Integer getLun() {
        return lun;
    }

    public void setLun(Integer lun) {
        this.lun = lun;
    }

    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * targetWWNs is Optional: FC target worldwide names (WWNs)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetWWNs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("targetWWNs is Optional: FC target worldwide names (WWNs)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> targetWWNs;

    public java.util.List<String> getTargetWWNs() {
        return targetWWNs;
    }

    public void setTargetWWNs(java.util.List<String> targetWWNs) {
        this.targetWWNs = targetWWNs;
    }

    /**
     * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("wwids")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> wwids;

    public java.util.List<String> getWwids() {
        return wwids;
    }

    public void setWwids(java.util.List<String> wwids) {
        this.wwids = wwids;
    }
}

