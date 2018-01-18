package de.reports;


import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Registry",
    "ImageName",
    "Tag",
    "Layers"
})
public class ScanReport implements Serializable
{

    @JsonProperty("Registry")
    private String registry;
    @JsonProperty("ImageName")
    private String imageName;
    @JsonProperty("Tag")
    private String tag;
    @JsonProperty("Layers")
    private List<Layers> layers = null;
    private final static long serialVersionUID = 5137878186756658753L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ScanReport() {
    }

    /**
     * 
     * @param imageName
     * @param tag
     * @param layers
     * @param registry
     */
    public ScanReport(String registry, String imageName, String tag, List<Layers> layers) {
        super();
        this.registry = registry;
        this.imageName = imageName;
        this.tag = tag;
        this.layers = layers;
    }

    @JsonProperty("Registry")
    public String getRegistry() {
        return registry;
    }

    @JsonProperty("Registry")
    public void setRegistry(String registry) {
        this.registry = registry;
    }

    @JsonProperty("ImageName")
    public String getImageName() {
        return imageName;
    }

    @JsonProperty("ImageName")
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @JsonProperty("Tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("Tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("Layers")
    public List<Layers> getLayers() {
        return layers;
    }

    @JsonProperty("Layers")
    public void setLayers(List<Layers> layers) {
        this.layers = layers;
    }

}
