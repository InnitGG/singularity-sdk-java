package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.containers.lifecycle;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"exec","httpGet","tcpSocket"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class PreStop implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Exec specifies the action to take.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exec")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Exec specifies the action to take.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.containers.lifecycle.prestop.Exec exec;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.containers.lifecycle.prestop.Exec getExec() {
        return exec;
    }

    public void setExec(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.containers.lifecycle.prestop.Exec exec) {
        this.exec = exec;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpGet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("HTTPGet specifies the http request to perform.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.containers.lifecycle.prestop.HttpGet httpGet;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.containers.lifecycle.prestop.HttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.containers.lifecycle.prestop.HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tcpSocket")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.containers.lifecycle.prestop.TcpSocket tcpSocket;

    public gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.containers.lifecycle.prestop.TcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.containers.lifecycle.prestop.TcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }
}

