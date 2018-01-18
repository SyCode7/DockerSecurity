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
    "Version",
    "AddedBy",
    "Vulnerabilities"
})
public class Feature implements Serializable
{

    @JsonProperty("Name")
    private String name;
    @JsonProperty("NamespaceName")
    private String namespaceName;
    @JsonProperty("Version")
    private String version;
    @JsonProperty("AddedBy")
    private String addedBy;
    @JsonProperty("Vulnerabilities")
    private List<Vulnerability> vulnerabilities = null;
    private final static long serialVersionUID = 8007130613278605751L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Feature() {
    }

    /**
     * 
     * @param namespaceName
     * @param name
     * @param vulnerabilities
     * @param addedBy
     * @param version
     */
    public Feature(String name, String namespaceName, String version, String addedBy, List<Vulnerability> vulnerabilities) {
        super();
        this.name = name;
        this.namespaceName = namespaceName;
        this.version = version;
        this.addedBy = addedBy;
        this.vulnerabilities = vulnerabilities;
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

    @JsonProperty("Version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("AddedBy")
    public String getAddedBy() {
        return addedBy;
    }

    @JsonProperty("AddedBy")
    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    @JsonProperty("Vulnerabilities")
    public List<Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    @JsonProperty("Vulnerabilities")
    public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }
    


}
