package gg.innit.singularity.impl.k8s.v1.gameserversetspec.template.spec.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"datasetName","datasetUUID"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
public class Flocker implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datasetName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String datasetName;

    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datasetUUID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String datasetUUID;

    public String getDatasetUUID() {
        return datasetUUID;
    }

    public void setDatasetUUID(String datasetUUID) {
        this.datasetUUID = datasetUUID;
    }
}

