
package aiss.model.besoccer;

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
    "nick",
    "name",
    "last_name",
    "alias",
    "role",
    "year",
    "squadNumber",
    "num",
    "pos",
    "idplayer",
    "goals",
    "reds",
    "yellows",
    "CountryCode",
    "image"
})
public class Player {

    @JsonProperty("id")
    private String id;
    @JsonProperty("nick")
    private String nick;
    @JsonProperty("name")
    private String name;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("role")
    private String role;
    @JsonProperty("year")
    private String year;
    @JsonProperty("squadNumber")
    private String squadNumber;
    @JsonProperty("num")
    private String num;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("idplayer")
    private String idplayer;
    @JsonProperty("goals")
    private String goals;
    @JsonProperty("reds")
    private String reds;
    @JsonProperty("yellows")
    private String yellows;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("image")
    private String image;
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

    @JsonProperty("nick")
    public String getNick() {
        return nick;
    }

    @JsonProperty("nick")
    public void setNick(String nick) {
        this.nick = nick;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("squadNumber")
    public String getSquadNumber() {
        return squadNumber;
    }

    @JsonProperty("squadNumber")
    public void setSquadNumber(String squadNumber) {
        this.squadNumber = squadNumber;
    }

    @JsonProperty("num")
    public String getNum() {
        return num;
    }

    @JsonProperty("num")
    public void setNum(String num) {
        this.num = num;
    }

    @JsonProperty("pos")
    public String getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(String pos) {
        this.pos = pos;
    }

    @JsonProperty("idplayer")
    public String getIdplayer() {
        return idplayer;
    }

    @JsonProperty("idplayer")
    public void setIdplayer(String idplayer) {
        this.idplayer = idplayer;
    }

    @JsonProperty("goals")
    public String getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(String goals) {
        this.goals = goals;
    }

    @JsonProperty("reds")
    public String getReds() {
        return reds;
    }

    @JsonProperty("reds")
    public void setReds(String reds) {
        this.reds = reds;
    }

    @JsonProperty("yellows")
    public String getYellows() {
        return yellows;
    }

    @JsonProperty("yellows")
    public void setYellows(String yellows) {
        this.yellows = yellows;
    }

    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
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
