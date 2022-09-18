package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"chapAuthDiscovery","chapAuthSession","fsType","initiatorName","iqn","iscsiInterface","lun","portals","readOnly","secretRef","targetPortal"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Iscsi implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("chapAuthDiscovery")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean chapAuthDiscovery;

    public Boolean getChapAuthDiscovery() {
        return chapAuthDiscovery;
    }

    public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
        this.chapAuthDiscovery = chapAuthDiscovery;
    }

    /**
     * chapAuthSession defines whether support iSCSI Session CHAP authentication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("chapAuthSession")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("chapAuthSession defines whether support iSCSI Session CHAP authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean chapAuthSession;

    public Boolean getChapAuthSession() {
        return chapAuthSession;
    }

    public void setChapAuthSession(Boolean chapAuthSession) {
        this.chapAuthSession = chapAuthSession;
    }

    /**
     * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi TODO: how do we prevent errors in the filesystem from compromising the machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi TODO: how do we prevent errors in the filesystem from compromising the machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fsType;

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initiatorName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String initiatorName;

    public String getInitiatorName() {
        return initiatorName;
    }

    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    /**
     * iqn is the target iSCSI Qualified Name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iqn")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("iqn is the target iSCSI Qualified Name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String iqn;

    public String getIqn() {
        return iqn;
    }

    public void setIqn(String iqn) {
        this.iqn = iqn;
    }

    /**
     * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iscsiInterface")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String iscsiInterface;

    public String getIscsiInterface() {
        return iscsiInterface;
    }

    public void setIscsiInterface(String iscsiInterface) {
        this.iscsiInterface = iscsiInterface;
    }

    /**
     * lun represents iSCSI Target Lun number.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lun")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("lun represents iSCSI Target Lun number.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer lun;

    public Integer getLun() {
        return lun;
    }

    public void setLun(Integer lun) {
        this.lun = lun;
    }

    /**
     * portals is the iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portals")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("portals is the iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> portals;

    public java.util.List<String> getPortals() {
        return portals;
    }

    public void setPortals(java.util.List<String> portals) {
        this.portals = portals;
    }

    /**
     * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean readOnly;

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * secretRef is the CHAP Secret for iSCSI target and initiator authentication
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secretRef is the CHAP Secret for iSCSI target and initiator authentication")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.iscsi.SecretRef secretRef;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.iscsi.SecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.iscsi.SecretRef secretRef) {
        this.secretRef = secretRef;
    }

    /**
     * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetPortal")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String targetPortal;

    public String getTargetPortal() {
        return targetPortal;
    }

    public void setTargetPortal(String targetPortal) {
        this.targetPortal = targetPortal;
    }
}

