package gg.innit.singularity.impl.k8s.v1.fleetspec.template.spec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"hostnames","ip"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class HostAliases implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Hostnames for the above IP address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hostnames for the above IP address.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> hostnames;

    public java.util.List<String> getHostnames() {
        return hostnames;
    }

    public void setHostnames(java.util.List<String> hostnames) {
        this.hostnames = hostnames;
    }

    /**
     * IP address of the host file entry.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ip")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("IP address of the host file entry.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}

