package gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"args","command","env","envFrom","image","imagePullPolicy","lifecycle","livenessProbe","name","ports","readinessProbe","resources","securityContext","startupProbe","stdin","stdinOnce","terminationMessagePath","terminationMessagePolicy","tty","volumeDevices","volumeMounts","workingDir"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class InitContainers implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Arguments to the entrypoint. The container image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     */
    @com.fasterxml.jackson.annotation.JsonProperty("args")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Arguments to the entrypoint. The container image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> args;

    public java.util.List<String> getArgs() {
        return args;
    }

    public void setArgs(java.util.List<String> args) {
        this.args = args;
    }

    /**
     * Entrypoint array. Not executed within a shell. The container image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     */
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Entrypoint array. Not executed within a shell. The container image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> command;

    public java.util.List<String> getCommand() {
        return command;
    }

    public void setCommand(java.util.List<String> command) {
        this.command = command;
    }

    /**
     * List of environment variables to set in the container. Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of environment variables to set in the container. Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Env> env;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Env> env) {
        this.env = env;
    }

    /**
     * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("envFrom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.EnvFrom> envFrom;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.EnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.EnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    /**
     * Container image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Container image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String imagePullPolicy;

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    /**
     * Actions that the management system should take in response to container lifecycle events. Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycle")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Actions that the management system should take in response to container lifecycle events. Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Lifecycle lifecycle;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Lifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.LivenessProbe livenessProbe;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network. Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Ports> ports;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Ports> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Ports> ports) {
        this.ports = ports;
    }

    /**
     * Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.ReadinessProbe readinessProbe;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * Compute Resources required by this container. Cannot be updated. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Compute Resources required by this container. Cannot be updated. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Resources resources;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Resources getResources() {
        return resources;
    }

    public void setResources(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.Resources resources) {
        this.resources = resources;
    }

    /**
     * SecurityContext defines the security options the container should be run with. If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext. More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SecurityContext defines the security options the container should be run with. If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext. More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.SecurityContext securityContext;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load data or warm a cache, than during steady-state operation. This cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startupProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load data or warm a cache, than during steady-state operation. This cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.StartupProbe startupProbe;

    public gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.StartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.StartupProbe startupProbe) {
        this.startupProbe = startupProbe;
    }

    /**
     * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stdin")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean stdin;

    public Boolean getStdin() {
        return stdin;
    }

    public void setStdin(Boolean stdin) {
        this.stdin = stdin;
    }

    /**
     * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stdinOnce")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean stdinOnce;

    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    /**
     * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("terminationMessagePath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String terminationMessagePath;

    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    public void setTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    /**
     * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("terminationMessagePolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String terminationMessagePolicy;

    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    /**
     * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tty")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean tty;

    public Boolean getTty() {
        return tty;
    }

    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    /**
     * volumeDevices is the list of block devices to be used by the container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeDevices")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("volumeDevices is the list of block devices to be used by the container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.VolumeDevices> volumeDevices;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.VolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.VolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    /**
     * Pod volumes to mount into the container's filesystem. Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMounts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod volumes to mount into the container's filesystem. Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.VolumeMounts> volumeMounts;

    public java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.VolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(java.util.List<gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec.initcontainers.VolumeMounts> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    /**
     * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workingDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String workingDir;

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }
}

