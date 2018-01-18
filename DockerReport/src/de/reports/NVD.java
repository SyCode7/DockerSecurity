package de.reports;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CVSSv2"
})
public class NVD implements Serializable
{

    @JsonProperty("CVSSv2")
    private CVSSv2 cVSSv2;
    private final static long serialVersionUID = -1615373364139683168L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NVD() {
    }

    /**
     * 
     * @param cVSSv2
     */
    public NVD(CVSSv2 cVSSv2) {
        super();
        this.cVSSv2 = cVSSv2;
    }

    @JsonProperty("CVSSv2")
    public CVSSv2 getCVSSv2() {
        return cVSSv2;
    }

    @JsonProperty("CVSSv2")
    public void setCVSSv2(CVSSv2 cVSSv2) {
        this.cVSSv2 = cVSSv2;
    }

}
