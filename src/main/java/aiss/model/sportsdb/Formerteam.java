
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
    "idFormerTeam",
    "strSport",
    "strPlayer",
    "strFormerTeam",
    "strMoveType",
    "strTeamBadge",
    "strJoined",
    "strDeparted"
})
public class Formerteam {

    @JsonProperty("id")
    private String id;
    @JsonProperty("idPlayer")
    private String idPlayer;
    @JsonProperty("idFormerTeam")
    private String idFormerTeam;
    @JsonProperty("strSport")
    private String strSport;
    @JsonProperty("strPlayer")
    private String strPlayer;
    @JsonProperty("strFormerTeam")
    private String strFormerTeam;
    @JsonProperty("strMoveType")
    private String strMoveType;
    @JsonProperty("strTeamBadge")
    private String strTeamBadge;
    @JsonProperty("strJoined")
    private String strJoined;
    @JsonProperty("strDeparted")
    private String strDeparted;
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

    @JsonProperty("idFormerTeam")
    public String getIdFormerTeam() {
        return idFormerTeam;
    }

    @JsonProperty("idFormerTeam")
    public void setIdFormerTeam(String idFormerTeam) {
        this.idFormerTeam = idFormerTeam;
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

    @JsonProperty("strFormerTeam")
    public String getStrFormerTeam() {
        return strFormerTeam;
    }

    @JsonProperty("strFormerTeam")
    public void setStrFormerTeam(String strFormerTeam) {
        this.strFormerTeam = strFormerTeam;
    }

    @JsonProperty("strMoveType")
    public String getStrMoveType() {
        return strMoveType;
    }

    @JsonProperty("strMoveType")
    public void setStrMoveType(String strMoveType) {
        this.strMoveType = strMoveType;
    }

    @JsonProperty("strTeamBadge")
    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    @JsonProperty("strTeamBadge")
    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }

    @JsonProperty("strJoined")
    public String getStrJoined() {
        return strJoined;
    }

    @JsonProperty("strJoined")
    public void setStrJoined(String strJoined) {
        this.strJoined = strJoined;
    }

    @JsonProperty("strDeparted")
    public String getStrDeparted() {
        return strDeparted;
    }

    @JsonProperty("strDeparted")
    public void setStrDeparted(String strDeparted) {
        this.strDeparted = strDeparted;
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
