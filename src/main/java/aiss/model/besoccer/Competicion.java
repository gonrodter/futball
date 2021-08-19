
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
    "table",
    "info",
    "legends"
})
public class Competicion {

    @JsonProperty("table")
    private List<Table> table = null;
    @JsonProperty("info")
    private Info info;
    @JsonProperty("legends")
    private List<Legend> legends = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("table")
    public List<Table> getTable() {
        return table;
    }

    @JsonProperty("table")
    public void setTable(List<Table> table) {
        this.table = table;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("legends")
    public List<Legend> getLegends() {
        return legends;
    }

    @JsonProperty("legends")
    public void setLegends(List<Legend> legends) {
        this.legends = legends;
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
