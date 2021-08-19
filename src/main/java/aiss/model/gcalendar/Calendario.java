
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
    "kind",
    "etag",
    "id",
    "summary",
    "description",
    "location",
    "timeZone",
    "conferenceProperties"
})
public class Calendario {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("id")
    private Boolean id;
    @JsonProperty("summary")
    private Boolean summary;
    @JsonProperty("description")
    private Boolean description;
    @JsonProperty("location")
    private Boolean location;
    @JsonProperty("timeZone")
    private Boolean timeZone;
    @JsonProperty("conferenceProperties")
    private ConferenceProperties conferenceProperties;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("etag")
    public String getEtag() {
        return etag;
    }

    @JsonProperty("etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    @JsonProperty("id")
    public Boolean getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Boolean id) {
        this.id = id;
    }

    @JsonProperty("summary")
    public Boolean getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Boolean summary) {
        this.summary = summary;
    }

    @JsonProperty("description")
    public Boolean getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Boolean description) {
        this.description = description;
    }

    @JsonProperty("location")
    public Boolean getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Boolean location) {
        this.location = location;
    }

    @JsonProperty("timeZone")
    public Boolean getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(Boolean timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("conferenceProperties")
    public ConferenceProperties getConferenceProperties() {
        return conferenceProperties;
    }

    @JsonProperty("conferenceProperties")
    public void setConferenceProperties(ConferenceProperties conferenceProperties) {
        this.conferenceProperties = conferenceProperties;
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
