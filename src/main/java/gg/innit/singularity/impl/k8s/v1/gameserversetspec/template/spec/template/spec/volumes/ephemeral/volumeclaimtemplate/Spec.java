package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"accessModes","dataSource","dataSourceRef","resources","selector","storageClassName","volumeMode","volumeName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Spec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessModes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> accessModes;

    public java.util.List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(java.util.List<String> accessModes) {
        this.accessModes = accessModes;
    }

    /**
     * dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the AnyVolumeDataSource feature gate is enabled, this field will always have the same contents as the DataSourceRef field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataSource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the AnyVolumeDataSource feature gate is enabled, this field will always have the same contents as the DataSourceRef field.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSource dataSource;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any local object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the DataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, both fields (DataSource and DataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. There are two important differences between DataSource and DataSourceRef: * While DataSource only allows two specific types of objects, DataSourceRef allows any non-core object, as well as PersistentVolumeClaim objects. * While DataSource ignores disallowed values (dropping them), DataSourceRef preserves all values, and generates an error if a disallowed value is specified. (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any local object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the DataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, both fields (DataSource and DataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. There are two important differences between DataSource and DataSourceRef: * While DataSource only allows two specific types of objects, DataSourceRef allows any non-core object, as well as PersistentVolumeClaim objects. * While DataSource ignores disallowed values (dropping them), DataSourceRef preserves all values, and generates an error if a disallowed value is specified. (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSourceRef dataSourceRef;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSourceRef getDataSourceRef() {
        return dataSourceRef;
    }

    public void setDataSourceRef(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.DataSourceRef dataSourceRef) {
        this.dataSourceRef = dataSourceRef;
    }

    /**
     * resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.Resources resources;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.Resources getResources() {
        return resources;
    }

    public void setResources(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.Resources resources) {
        this.resources = resources;
    }

    /**
     * selector is a label query over volumes to consider for binding.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("selector is a label query over volumes to consider for binding.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.Selector selector;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.Selector getSelector() {
        return selector;
    }

    public void setSelector(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes.ephemeral.volumeclaimtemplate.spec.Selector selector) {
        this.selector = selector;
    }

    /**
     * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storageClassName;

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
    }

    /**
     * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeMode;

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
    }

    /**
     * volumeName is the binding reference to the PersistentVolume backing this claim.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("volumeName is the binding reference to the PersistentVolume backing this claim.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeName;

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }
}

