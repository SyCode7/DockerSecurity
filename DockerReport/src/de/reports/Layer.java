package de.reports;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "NamespaceName",
    "ParentName",
    "IndexedByVersion",
    "Features"
})
public class Layer implements Serializable
{

    @JsonProperty("Name")
    private String name;
    @JsonProperty("NamespaceName")
    private String namespaceName;
    @JsonProperty("ParentName")
    private String parentName;
    @JsonProperty("IndexedByVersion")
    private Long indexedByVersion;
    @JsonProperty("Features")
    private List<Feature> features = null;
    private final static long serialVersionUID = 9029331114754447246L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Layer() {
    }

    /**
     * 
     * @param namespaceName
     * @param name
     * @param features
     * @param indexedByVersion
     * @param parentName
     */
    public Layer(String name, String namespaceName, String parentName, Long indexedByVersion, List<Feature> features) {
        super();
        this.name = name;
        this.namespaceName = namespaceName;
        this.parentName = parentName;
        this.indexedByVersion = indexedByVersion;
        this.features = features;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("NamespaceName")
    public String getNamespaceName() {
        return namespaceName;
    }

    @JsonProperty("NamespaceName")
    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    @JsonProperty("ParentName")
    public String getParentName() {
        return parentName;
    }

    @JsonProperty("ParentName")
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @JsonProperty("IndexedByVersion")
    public Long getIndexedByVersion() {
        return indexedByVersion;
    }

    @JsonProperty("IndexedByVersion")
    public void setIndexedByVersion(Long indexedByVersion) {
        this.indexedByVersion = indexedByVersion;
    }

    @JsonProperty("Features")
    public List<Feature> getFeatures() {
        return features;
    }

    @JsonProperty("Features")
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

}
