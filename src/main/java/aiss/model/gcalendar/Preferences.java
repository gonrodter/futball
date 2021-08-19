
package aiss.model.gcalendar;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AIzaSyBwrmbzgXZxYeRieaTko6p-00wShTxYH2g"
})
public class Preferences {

    @JsonProperty("AIzaSyBwrmbzgXZxYeRieaTko6p-00wShTxYH2g")
    private String aIzaSyBwrmbzgXZxYeRieaTko6p00wShTxYH2g;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AIzaSyBwrmbzgXZxYeRieaTko6p-00wShTxYH2g")
    public String getAIzaSyBwrmbzgXZxYeRieaTko6p00wShTxYH2g() {
        return aIzaSyBwrmbzgXZxYeRieaTko6p00wShTxYH2g;
    }

    @JsonProperty("AIzaSyBwrmbzgXZxYeRieaTko6p-00wShTxYH2g")
    public void setAIzaSyBwrmbzgXZxYeRieaTko6p00wShTxYH2g(String aIzaSyBwrmbzgXZxYeRieaTko6p00wShTxYH2g) {
        this.aIzaSyBwrmbzgXZxYeRieaTko6p00wShTxYH2g = aIzaSyBwrmbzgXZxYeRieaTko6p00wShTxYH2g;
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
