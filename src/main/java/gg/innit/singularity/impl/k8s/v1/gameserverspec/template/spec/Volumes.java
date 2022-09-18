package gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"awsElasticBlockStore","azureDisk","azureFile","cephfs","cinder","configMap","csi","downwardAPI","emptyDir","ephemeral","fc","flexVolume","flocker","gcePersistentDisk","gitRepo","glusterfs","hostPath","iscsi","name","nfs","persistentVolumeClaim","photonPersistentDisk","portworxVolume","projected","quobyte","rbd","scaleIO","secret","storageos","vsphereVolume"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Volumes implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     */
    @com.fasterxml.jackson.annotation.JsonProperty("awsElasticBlockStore")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.AwsElasticBlockStore awsElasticBlockStore;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.AwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.AwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    /**
     * azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("azureDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.AzureDisk azureDisk;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.AzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.AzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    /**
     * azureFile represents an Azure File Service mount on the host and bind mount to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("azureFile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("azureFile represents an Azure File Service mount on the host and bind mount to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.AzureFile azureFile;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.AzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.AzureFile azureFile) {
        this.azureFile = azureFile;
    }

    /**
     * cephFS represents a Ceph FS mount on the host that shares a pod's lifetime
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cephfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Cephfs cephfs;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Cephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Cephfs cephfs) {
        this.cephfs = cephfs;
    }

    /**
     * cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cinder")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Cinder cinder;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Cinder getCinder() {
        return cinder;
    }

    public void setCinder(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Cinder cinder) {
        this.cinder = cinder;
    }

    /**
     * configMap represents a configMap that should populate this volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("configMap represents a configMap that should populate this volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.ConfigMap configMap;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.ConfigMap configMap) {
        this.configMap = configMap;
    }

    /**
     * csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Csi csi;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Csi getCsi() {
        return csi;
    }

    public void setCsi(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Csi csi) {
        this.csi = csi;
    }

    /**
     * downwardAPI represents downward API about the pod that should populate this volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("downwardAPI represents downward API about the pod that should populate this volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.DownwardAPI downwardAPI;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * emptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emptyDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("emptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.EmptyDir emptyDir;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.EmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.EmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    /**
     * ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.
     *  Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through a PersistentVolumeClaim (see EphemeralVolumeSource for more information on the connection between this volume type and PersistentVolumeClaim).
     *  Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.
     *  Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.
     *  A pod can use both types of ephemeral volumes and persistent volumes at the same time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ephemeral")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed. \n Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through a PersistentVolumeClaim (see EphemeralVolumeSource for more information on the connection between this volume type and PersistentVolumeClaim). \n Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod. \n Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information. \n A pod can use both types of ephemeral volumes and persistent volumes at the same time.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Ephemeral ephemeral;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Ephemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Ephemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    /**
     * fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Fc fc;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Fc getFc() {
        return fc;
    }

    public void setFc(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Fc fc) {
        this.fc = fc;
    }

    /**
     * flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flexVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.FlexVolume flexVolume;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.FlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.FlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    /**
     * flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flocker")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Flocker flocker;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Flocker getFlocker() {
        return flocker;
    }

    public void setFlocker(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Flocker flocker) {
        this.flocker = flocker;
    }

    /**
     * gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gcePersistentDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.GcePersistentDisk gcePersistentDisk;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.GcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.GcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    /**
     * gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gitRepo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.GitRepo gitRepo;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.GitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.GitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    /**
     * glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("glusterfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Glusterfs glusterfs;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Glusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Glusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    /**
     * hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath --- TODO(jonesdl) We need to restrict who can use host directory mounts and who can/can not mount host directories as read/write.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.HostPath hostPath;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.HostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.HostPath hostPath) {
        this.hostPath = hostPath;
    }

    /**
     * iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iscsi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Iscsi iscsi;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Iscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Iscsi iscsi) {
        this.iscsi = iscsi;
    }

    /**
     * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Nfs nfs;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Nfs getNfs() {
        return nfs;
    }

    public void setNfs(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Nfs nfs) {
        this.nfs = nfs;
    }

    /**
     * persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.PersistentVolumeClaim persistentVolumeClaim;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    /**
     * photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("photonPersistentDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.PhotonPersistentDisk photonPersistentDisk;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.PhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.PhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    /**
     * portworxVolume represents a portworx volume attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portworxVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("portworxVolume represents a portworx volume attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.PortworxVolume portworxVolume;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.PortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.PortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    /**
     * projected items for all in one resources secrets, configmaps, and downward API
     */
    @com.fasterxml.jackson.annotation.JsonProperty("projected")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("projected items for all in one resources secrets, configmaps, and downward API")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Projected projected;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Projected getProjected() {
        return projected;
    }

    public void setProjected(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Projected projected) {
        this.projected = projected;
    }

    /**
     * quobyte represents a Quobyte mount on the host that shares a pod's lifetime
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quobyte")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("quobyte represents a Quobyte mount on the host that shares a pod's lifetime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Quobyte quobyte;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Quobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Quobyte quobyte) {
        this.quobyte = quobyte;
    }

    /**
     * rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rbd")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Rbd rbd;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Rbd getRbd() {
        return rbd;
    }

    public void setRbd(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Rbd rbd) {
        this.rbd = rbd;
    }

    /**
     * scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scaleIO")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.ScaleIO scaleIO;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.ScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.ScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    /**
     * secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Secret secret;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Secret getSecret() {
        return secret;
    }

    public void setSecret(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Secret secret) {
        this.secret = secret;
    }

    /**
     * storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageos")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Storageos storageos;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Storageos getStorageos() {
        return storageos;
    }

    public void setStorageos(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.Storageos storageos) {
        this.storageos = storageos;
    }

    /**
     * vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.VsphereVolume vsphereVolume;

    public gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.VsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.volumes.VsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }
}

