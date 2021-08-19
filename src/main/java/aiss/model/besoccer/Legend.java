
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
    "group",
    "legend",
    "penalty"
})
public class Legend {

    @JsonProperty("group")
    private String group;
    @JsonProperty("legend")
    private List<Legend_> legend = null;
    @JsonProperty("penalty")
    private List<Object> penalty = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    @JsonProperty("legend")
    public List<Legend_> getLegend() {
        return legend;
    }

    @JsonProperty("legend")
    public void setLegend(List<Legend_> legend) {
        this.legend = legend;
    }

    @JsonProperty("penalty")
    public List<Object> getPenalty() {
        return penalty;
    }

    @JsonProperty("penalty")
    public void setPenalty(List<Object> penalty) {
        this.penalty = penalty;
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
