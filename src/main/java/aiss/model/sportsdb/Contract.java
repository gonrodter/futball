
package aiss.model.sportsdb;

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
    "id",
    "idPlayer",
    "idTeam",
    "strSport",
    "strPlayer",
    "strTeam",
    "strTeamBadge",
    "strYearStart",
    "strYearEnd",
    "strWage"
})
public class Contract {

    @JsonProperty("id")
    private String id;
    @JsonProperty("idPlayer")
    private String idPlayer;
    @JsonProperty("idTeam")
    private String idTeam;
    @JsonProperty("strSport")
    private String strSport;
    @JsonProperty("strPlayer")
    private String strPlayer;
    @JsonProperty("strTeam")
    private String strTeam;
    @JsonProperty("strTeamBadge")
    private String strTeamBadge;
    @JsonProperty("strYearStart")
    private String strYearStart;
    @JsonProperty("strYearEnd")
    private String strYearEnd;
    @JsonProperty("strWage")
    private String strWage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("idPlayer")
    public String getIdPlayer() {
        return idPlayer;
    }

    @JsonProperty("idPlayer")
    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

    @JsonProperty("idTeam")
    public String getIdTeam() {
        return idTeam;
    }

    @JsonProperty("idTeam")
    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    @JsonProperty("strSport")
    public String getStrSport() {
        return strSport;
    }

    @JsonProperty("strSport")
    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    @JsonProperty("strPlayer")
    public String getStrPlayer() {
        return strPlayer;
    }

    @JsonProperty("strPlayer")
    public void setStrPlayer(String strPlayer) {
        this.strPlayer = strPlayer;
    }

    @JsonProperty("strTeam")
    public String getStrTeam() {
        return strTeam;
    }

    @JsonProperty("strTeam")
    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    @JsonProperty("strTeamBadge")
    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    @JsonProperty("strTeamBadge")
    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }

    @JsonProperty("strYearStart")
    public String getStrYearStart() {
        return strYearStart;
    }

    @JsonProperty("strYearStart")
    public void setStrYearStart(String strYearStart) {
        this.strYearStart = strYearStart;
    }

    @JsonProperty("strYearEnd")
    public String getStrYearEnd() {
        return strYearEnd;
    }

    @JsonProperty("strYearEnd")
    public void setStrYearEnd(String strYearEnd) {
        this.strYearEnd = strYearEnd;
    }

    @JsonProperty("strWage")
    public String getStrWage() {
        return strWage;
    }

    @JsonProperty("strWage")
    public void setStrWage(String strWage) {
        this.strWage = strWage;
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
