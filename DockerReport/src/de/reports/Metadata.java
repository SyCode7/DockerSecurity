package de.reports;


import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NVD"
})
public class Metadata implements Serializable
{

    @JsonProperty("NVD")
    private NVD nVD;
    private final static long serialVersionUID = -6251820693599309486L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metadata() {
    }

    /**
     * 
     * @param nVD
     */
    public Metadata(NVD nVD) {
        super();
        this.nVD = nVD;
    }

    @JsonProperty("NVD")
    public NVD getNVD() {
        return nVD;
    }

    @JsonProperty("NVD")
    public void setNVD(NVD nVD) {
        this.nVD = nVD;
    }

}
