package gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"activeDeadlineSeconds","affinity","automountServiceAccountToken","containers","dnsConfig","dnsPolicy","enableServiceLinks","ephemeralContainers","hostAliases","hostIPC","hostNetwork","hostPID","hostname","imagePullSecrets","initContainers","nodeName","nodeSelector","os","overhead","preemptionPolicy","priority","priorityClassName","readinessGates","restartPolicy","runtimeClassName","schedulerName","securityContext","serviceAccount","serviceAccountName","setHostnameAsFQDN","shareProcessNamespace","subdomain","terminationGracePeriodSeconds","tolerations","topologySpreadConstraints","volumes"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Spec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activeDeadlineSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long activeDeadlineSeconds;

    public Long getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    /**
     * If specified, the pod's scheduling constraints
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the pod's scheduling constraints")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Affinity affinity;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("automountServiceAccountToken")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean automountServiceAccountToken;

    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    /**
     * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containers")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Containers> containers;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Containers> getContainers() {
        return containers;
    }

    public void setContainers(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Containers> containers) {
        this.containers = containers;
    }

    /**
     * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.DnsConfig dnsConfig;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.DnsConfig getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String dnsPolicy;

    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    /**
     * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableServiceLinks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableServiceLinks;

    public Boolean getEnableServiceLinks() {
        return enableServiceLinks;
    }

    public void setEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
    }

    /**
     * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource. This field is beta-level and available on clusters that haven't disabled the EphemeralContainers feature gate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ephemeralContainers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource. This field is beta-level and available on clusters that haven't disabled the EphemeralContainers feature gate.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.EphemeralContainers> ephemeralContainers;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.EphemeralContainers> getEphemeralContainers() {
        return ephemeralContainers;
    }

    public void setEphemeralContainers(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.EphemeralContainers> ephemeralContainers) {
        this.ephemeralContainers = ephemeralContainers;
    }

    /**
     * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostAliases")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.HostAliases> hostAliases;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.HostAliases> getHostAliases() {
        return hostAliases;
    }

    public void setHostAliases(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.HostAliases> hostAliases) {
        this.hostAliases = hostAliases;
    }

    /**
     * Use the host's ipc namespace. Optional: Default to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostIPC")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use the host's ipc namespace. Optional: Default to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hostIPC;

    public Boolean getHostIPC() {
        return hostIPC;
    }

    public void setHostIPC(Boolean hostIPC) {
        this.hostIPC = hostIPC;
    }

    /**
     * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostNetwork")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hostNetwork;

    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    /**
     * Use the host's pid namespace. Optional: Default to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostPID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use the host's pid namespace. Optional: Default to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean hostPID;

    public Boolean getHostPID() {
        return hostPID;
    }

    public void setHostPID(Boolean hostPID) {
        this.hostPID = hostPID;
    }

    /**
     * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullSecrets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.ImagePullSecrets> imagePullSecrets;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.ImagePullSecrets> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.ImagePullSecrets> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    /**
     * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initContainers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.InitContainers> initContainers;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.InitContainers> getInitContainers() {
        return initContainers;
    }

    public void setInitContainers(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.InitContainers> initContainers) {
        this.initContainers = initContainers;
    }

    /**
     * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nodeName;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> nodeSelector;

    public java.util.Map<java.lang.String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(java.util.Map<java.lang.String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    /**
     * Specifies the OS of the containers in the pod. Some pod and container fields are restricted if this is set.
     *  If the OS field is set to linux, the following fields must be unset: -securityContext.windowsOptions
     *  If the OS field is set to windows, following fields must be unset: - spec.hostPID - spec.hostIPC - spec.securityContext.seLinuxOptions - spec.securityContext.seccompProfile - spec.securityContext.fsGroup - spec.securityContext.fsGroupChangePolicy - spec.securityContext.sysctls - spec.shareProcessNamespace - spec.securityContext.runAsUser - spec.securityContext.runAsGroup - spec.securityContext.supplementalGroups - spec.containers[*].securityContext.seLinuxOptions - spec.containers[*].securityContext.seccompProfile - spec.containers[*].securityContext.capabilities - spec.containers[*].securityContext.readOnlyRootFilesystem - spec.containers[*].securityContext.privileged - spec.containers[*].securityContext.allowPrivilegeEscalation - spec.containers[*].securityContext.procMount - spec.containers[*].securityContext.runAsUser - spec.containers[*].securityContext.runAsGroup This is a beta field and requires the IdentifyPodOS feature
     */
    @com.fasterxml.jackson.annotation.JsonProperty("os")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the OS of the containers in the pod. Some pod and container fields are restricted if this is set. \n If the OS field is set to linux, the following fields must be unset: -securityContext.windowsOptions \n If the OS field is set to windows, following fields must be unset: - spec.hostPID - spec.hostIPC - spec.securityContext.seLinuxOptions - spec.securityContext.seccompProfile - spec.securityContext.fsGroup - spec.securityContext.fsGroupChangePolicy - spec.securityContext.sysctls - spec.shareProcessNamespace - spec.securityContext.runAsUser - spec.securityContext.runAsGroup - spec.securityContext.supplementalGroups - spec.containers[*].securityContext.seLinuxOptions - spec.containers[*].securityContext.seccompProfile - spec.containers[*].securityContext.capabilities - spec.containers[*].securityContext.readOnlyRootFilesystem - spec.containers[*].securityContext.privileged - spec.containers[*].securityContext.allowPrivilegeEscalation - spec.containers[*].securityContext.procMount - spec.containers[*].securityContext.runAsUser - spec.containers[*].securityContext.runAsGroup This is a beta field and requires the IdentifyPodOS feature")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Os os;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Os getOs() {
        return os;
    }

    public void setOs(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Os os) {
        this.os = os;
    }

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overhead")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> overhead;

    public java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> getOverhead() {
        return overhead;
    }

    public void setOverhead(java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> overhead) {
        this.overhead = overhead;
    }

    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preemptionPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String preemptionPolicy;

    public String getPreemptionPolicy() {
        return preemptionPolicy;
    }

    public void setPreemptionPolicy(String preemptionPolicy) {
        this.preemptionPolicy = preemptionPolicy;
    }

    /**
     * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer priority;

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * If specified, indicates the pod's priority. "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priorityClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, indicates the pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String priorityClassName;

    public String getPriorityClassName() {
        return priorityClassName;
    }

    public void setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    /**
     * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to "True" More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessGates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to \"True\" More info: https://git.k8s.io/enhancements/keps/sig-network/580-pod-readiness-gates")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.ReadinessGates> readinessGates;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.ReadinessGates> getReadinessGates() {
        return readinessGates;
    }

    public void setReadinessGates(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.ReadinessGates> readinessGates) {
        this.readinessGates = readinessGates;
    }

    /**
     * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restartPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String restartPolicy;

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    /**
     * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \"legacy\" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/585-runtime-class")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String runtimeClassName;

    public String getRuntimeClassName() {
        return runtimeClassName;
    }

    public void setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
    }

    /**
     * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulerName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String schedulerName;

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    /**
     * SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.SecurityContext securityContext;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceAccount;

    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceAccountName;

    public String getServiceAccountName() {
        return serviceAccountName;
    }

    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    /**
     * If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Services\\Tcpip\\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("setHostnameAsFQDN")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If true the pod's hostname will be configured as the pod's FQDN, rather than the leaf name (the default). In Linux containers, this means setting the FQDN in the hostname field of the kernel (the nodename field of struct utsname). In Windows containers, this means setting the registry value of hostname for the registry key HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Services\\Tcpip\\Parameters to FQDN. If a pod does not have FQDN, this has no effect. Default to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean setHostnameAsFQDN;

    public Boolean getSetHostnameAsFQDN() {
        return setHostnameAsFQDN;
    }

    public void setSetHostnameAsFQDN(Boolean setHostnameAsFQDN) {
        this.setHostnameAsFQDN = setHostnameAsFQDN;
    }

    /**
     * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shareProcessNamespace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean shareProcessNamespace;

    public Boolean getShareProcessNamespace() {
        return shareProcessNamespace;
    }

    public void setShareProcessNamespace(Boolean shareProcessNamespace) {
        this.shareProcessNamespace = shareProcessNamespace;
    }

    /**
     * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at all.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subdomain")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the fully qualified Pod hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the pod will not have a domainname at all.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subdomain;

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("terminationGracePeriodSeconds")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long terminationGracePeriodSeconds;

    public Long getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    /**
     * If specified, the pod's tolerations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tolerations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If specified, the pod's tolerations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Tolerations> tolerations;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Tolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Tolerations> tolerations) {
        this.tolerations = tolerations;
    }

    /**
     * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topologySpreadConstraints")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. All topologySpreadConstraints are ANDed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.TopologySpreadConstraints> topologySpreadConstraints;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.TopologySpreadConstraints> getTopologySpreadConstraints() {
        return topologySpreadConstraints;
    }

    public void setTopologySpreadConstraints(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.TopologySpreadConstraints> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
    }

    /**
     * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Volumes> volumes;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Volumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.Volumes> volumes) {
        this.volumes = volumes;
    }
}

