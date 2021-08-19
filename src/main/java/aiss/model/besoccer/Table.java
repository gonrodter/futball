
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
    "group",
    "group_name",
    "conference",
    "team",
    "points",
    "wins",
    "draws",
    "losses",
    "shield",
    "cflag",
    "basealias",
    "gf",
    "ga",
    "avg",
    "matchs_coef",
    "points_coef",
    "coef",
    "mark",
    "class_mark",
    "round",
    "pos",
    "countrycode",
    "abbr",
    "form",
    "direction"
})
public class Table {

    @JsonProperty("id")
    private String id;
    @JsonProperty("group")
    private String group;
    @JsonProperty("group_name")
    private String groupName;
    @JsonProperty("conference")
    private String conference;
    @JsonProperty("team")
    private String team;
    @JsonProperty("points")
    private String points;
    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("draws")
    private Integer draws;
    @JsonProperty("losses")
    private Integer losses;
    @JsonProperty("shield")
    private String shield;
    @JsonProperty("cflag")
    private String cflag;
    @JsonProperty("basealias")
    private String basealias;
    @JsonProperty("gf")
    private String gf;
    @JsonProperty("ga")
    private String ga;
    @JsonProperty("avg")
    private Integer avg;
    @JsonProperty("matchs_coef")
    private String matchsCoef;
    @JsonProperty("points_coef")
    private String pointsCoef;
    @JsonProperty("coef")
    private String coef;
    @JsonProperty("mark")
    private Integer mark;
    @JsonProperty("class_mark")
    private String classMark;
    @JsonProperty("round")
    private String round;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("countrycode")
    private String countrycode;
    @JsonProperty("abbr")
    private String abbr;
    @JsonProperty("form")
    private String form;
    @JsonProperty("direction")
    private String direction;
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

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    @JsonProperty("group_name")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("group_name")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("conference")
    public String getConference() {
        return conference;
    }

    @JsonProperty("conference")
    public void setConference(String conference) {
        this.conference = conference;
    }

    @JsonProperty("team")
    public String getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(String team) {
        this.team = team;
    }

    @JsonProperty("points")
    public String getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(String points) {
        this.points = points;
    }

    @JsonProperty("wins")
    public Integer getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @JsonProperty("draws")
    public Integer getDraws() {
        return draws;
    }

    @JsonProperty("draws")
    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    @JsonProperty("losses")
    public Integer getLosses() {
        return losses;
    }

    @JsonProperty("losses")
    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    @JsonProperty("shield")
    public String getShield() {
        return shield;
    }

    @JsonProperty("shield")
    public void setShield(String shield) {
        this.shield = shield;
    }

    @JsonProperty("cflag")
    public String getCflag() {
        return cflag;
    }

    @JsonProperty("cflag")
    public void setCflag(String cflag) {
        this.cflag = cflag;
    }

    @JsonProperty("basealias")
    public String getBasealias() {
        return basealias;
    }

    @JsonProperty("basealias")
    public void setBasealias(String basealias) {
        this.basealias = basealias;
    }

    @JsonProperty("gf")
    public String getGf() {
        return gf;
    }

    @JsonProperty("gf")
    public void setGf(String gf) {
        this.gf = gf;
    }

    @JsonProperty("ga")
    public String getGa() {
        return ga;
    }

    @JsonProperty("ga")
    public void setGa(String ga) {
        this.ga = ga;
    }

    @JsonProperty("avg")
    public Integer getAvg() {
        return avg;
    }

    @JsonProperty("avg")
    public void setAvg(Integer avg) {
        this.avg = avg;
    }

    @JsonProperty("matchs_coef")
    public String getMatchsCoef() {
        return matchsCoef;
    }

    @JsonProperty("matchs_coef")
    public void setMatchsCoef(String matchsCoef) {
        this.matchsCoef = matchsCoef;
    }

    @JsonProperty("points_coef")
    public String getPointsCoef() {
        return pointsCoef;
    }

    @JsonProperty("points_coef")
    public void setPointsCoef(String pointsCoef) {
        this.pointsCoef = pointsCoef;
    }

    @JsonProperty("coef")
    public String getCoef() {
        return coef;
    }

    @JsonProperty("coef")
    public void setCoef(String coef) {
        this.coef = coef;
    }

    @JsonProperty("mark")
    public Integer getMark() {
        return mark;
    }

    @JsonProperty("mark")
    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @JsonProperty("class_mark")
    public String getClassMark() {
        return classMark;
    }

    @JsonProperty("class_mark")
    public void setClassMark(String classMark) {
        this.classMark = classMark;
    }

    @JsonProperty("round")
    public String getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(String round) {
        this.round = round;
    }

    @JsonProperty("pos")
    public String getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(String pos) {
        this.pos = pos;
    }

    @JsonProperty("countrycode")
    public String getCountrycode() {
        return countrycode;
    }

    @JsonProperty("countrycode")
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @JsonProperty("abbr")
    public String getAbbr() {
        return abbr;
    }

    @JsonProperty("abbr")
    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
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
