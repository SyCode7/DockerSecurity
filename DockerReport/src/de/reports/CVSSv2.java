
package de.reports;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Score",
    "Vectors"
})
public class CVSSv2 implements Serializable
{

    @JsonProperty("Score")
    private Float score;
    @JsonProperty("Vectors")
    private String vectors;
    private final static long serialVersionUID = 3183299583068050612L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CVSSv2() {
    }

    /**
     * 
     * @param vectors
     * @param score
     */
    public CVSSv2(Float score, String vectors) {
        super();
        this.score = score;
        this.vectors = vectors;
    }

    @JsonProperty("Score")
    public Float getScore() {
        return score;
    }

    @JsonProperty("Score")
    public void setScore(Float score) {
        this.score = score;
    }

    @JsonProperty("Vectors")
    public String getVectors() {
        return vectors;
    }

    @JsonProperty("Vectors")
    public void setVectors(String vectors) {
        this.vectors = vectors;
    }

}
