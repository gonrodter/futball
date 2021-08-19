
package aiss.model.besoccer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "match",
    "twolegged",
    "linked_matches"
})
public class Partidos {

    @JsonProperty("match")
    private List<Match> match = null;
    @JsonProperty("twolegged")
    private Integer twolegged;
    @JsonProperty("linked_matches")
    private Integer linkedMatches;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("match")
    public List<Match> getMatch() {
        return match;
    }

    @JsonProperty("match")
    public void setMatch(List<Match> match) {
        this.match = match;
    }

    @JsonProperty("twolegged")
    public Integer getTwolegged() {
        return twolegged;
    }

    @JsonProperty("twolegged")
    public void setTwolegged(Integer twolegged) {
        this.twolegged = twolegged;
    }

    @JsonProperty("linked_matches")
    public Integer getLinkedMatches() {
        return linkedMatches;
    }

    @JsonProperty("linked_matches")
    public void setLinkedMatches(Integer linkedMatches) {
        this.linkedMatches = linkedMatches;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
