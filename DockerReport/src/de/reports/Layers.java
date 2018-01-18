package de.reports;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Layer"
})
public class Layers implements Serializable
{

    @JsonProperty("Layer")
    private Layer layer;
    private final static long serialVersionUID = -7902907880549474821L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Layers() {
    }

    /**
     * 
     * @param layer
     */
    public Layers(Layer layer) {
        super();
        this.layer = layer;
    }

    @JsonProperty("Layer")
    public Layer getLayer() {
        return layer;
    }

    @JsonProperty("Layer")
    public void setLayer(Layer layer) {
        this.layer = layer;
    }

}
