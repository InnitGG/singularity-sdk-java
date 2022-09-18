package gg.innit.singularity.impl.k8s.v1.gameserverspec.template.spec.ephemeralcontainers.livenessprobe;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"port","service"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Grpc implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Port number of the gRPC service. Number must be in the range 1 to 65535.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @javax.validation.constraints.NotNull()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port number of the gRPC service. Number must be in the range 1 to 65535.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     *  If this is not specified, the default behavior is defined by gRPC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md). \n If this is not specified, the default behavior is defined by gRPC.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String service;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}

