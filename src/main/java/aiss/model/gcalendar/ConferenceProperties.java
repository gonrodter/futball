
package aiss.model.gcalendar;

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
    "allowedConferenceSolutionTypes"
})
public class ConferenceProperties {

    @JsonProperty("allowedConferenceSolutionTypes")
    private List<Boolean> allowedConferenceSolutionTypes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("allowedConferenceSolutionTypes")
    public List<Boolean> getAllowedConferenceSolutionTypes() {
        return allowedConferenceSolutionTypes;
    }

    @JsonProperty("allowedConferenceSolutionTypes")
    public void setAllowedConferenceSolutionTypes(List<Boolean> allowedConferenceSolutionTypes) {
        this.allowedConferenceSolutionTypes = allowedConferenceSolutionTypes;
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
