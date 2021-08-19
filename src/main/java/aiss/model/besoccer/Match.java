
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
    "id",
    "year",
    "group",
    "total_group",
    "round",
    "local",
    "visitor",
    "league_id",
    "team1",
    "team2",
    "conference",
    "dteam1",
    "dteam2",
    "numc",
    "no_hour",
    "local_abbr",
    "visitor_abbr",
    "isVideo",
    "numVideos",
    "competition_name",
    "competition_id",
    "type",
    "type_id",
    "playoffs",
    "group_code",
    "total_rounds",
    "coef",
    "cflag_local",
    "cflag_visitor",
    "local_shield",
    "visitor_shield",
    "extraTxt",
    "schedule",
    "date",
    "hour",
    "minute",
    "local_goals",
    "visitor_goals",
    "result",
    "live_minute",
    "status",
    "channels",
    "winner",
    "penaltis1",
    "penaltis2",
    "prorroga"
})
public class Match {

    @JsonProperty("id")
    private String id;
    @JsonProperty("year")
    private String year;
    @JsonProperty("group")
    private String group;
    @JsonProperty("total_group")
    private String totalGroup;
    @JsonProperty("round")
    private String round;
    @JsonProperty("local")
    private String local;
    @JsonProperty("visitor")
    private String visitor;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("team1")
    private String team1;
    @JsonProperty("team2")
    private String team2;
    @JsonProperty("conference")
    private String conference;
    @JsonProperty("dteam1")
    private String dteam1;
    @JsonProperty("dteam2")
    private String dteam2;
    @JsonProperty("numc")
    private String numc;
    @JsonProperty("no_hour")
    private Boolean noHour;
    @JsonProperty("local_abbr")
    private String localAbbr;
    @JsonProperty("visitor_abbr")
    private String visitorAbbr;
    @JsonProperty("isVideo")
    private Integer isVideo;
    @JsonProperty("numVideos")
    private String numVideos;
    @JsonProperty("competition_name")
    private String competitionName;
    @JsonProperty("competition_id")
    private String competitionId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("type_id")
    private String typeId;
    @JsonProperty("playoffs")
    private Boolean playoffs;
    @JsonProperty("group_code")
    private String groupCode;
    @JsonProperty("total_rounds")
    private String totalRounds;
    @JsonProperty("coef")
    private String coef;
    @JsonProperty("cflag_local")
    private String cflagLocal;
    @JsonProperty("cflag_visitor")
    private String cflagVisitor;
    @JsonProperty("local_shield")
    private String localShield;
    @JsonProperty("visitor_shield")
    private String visitorShield;
    @JsonProperty("extraTxt")
    private String extraTxt;
    @JsonProperty("schedule")
    private String schedule;
    @JsonProperty("date")
    private String date;
    @JsonProperty("hour")
    private String hour;
    @JsonProperty("minute")
    private String minute;
    @JsonProperty("local_goals")
    private String localGoals;
    @JsonProperty("visitor_goals")
    private String visitorGoals;
    @JsonProperty("result")
    private String result;
    @JsonProperty("live_minute")
    private String liveMinute;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("channels")
    private List<Channel> channels = null;
    @JsonProperty("winner")
    private String winner;
    @JsonProperty("penaltis1")
    private Integer penaltis1;
    @JsonProperty("penaltis2")
    private Integer penaltis2;
    @JsonProperty("prorroga")
    private Boolean prorroga;
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

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    @JsonProperty("total_group")
    public String getTotalGroup() {
        return totalGroup;
    }

    @JsonProperty("total_group")
    public void setTotalGroup(String totalGroup) {
        this.totalGroup = totalGroup;
    }

    @JsonProperty("round")
    public String getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(String round) {
        this.round = round;
    }

    @JsonProperty("local")
    public String getLocal() {
        return local;
    }

    @JsonProperty("local")
    public void setLocal(String local) {
        this.local = local;
    }

    @JsonProperty("visitor")
    public String getVisitor() {
        return visitor;
    }

    @JsonProperty("visitor")
    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    @JsonProperty("league_id")
    public String getLeagueId() {
        return leagueId;
    }

    @JsonProperty("league_id")
    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("team1")
    public String getTeam1() {
        return team1;
    }

    @JsonProperty("team1")
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    @JsonProperty("team2")
    public String getTeam2() {
        return team2;
    }

    @JsonProperty("team2")
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    @JsonProperty("conference")
    public String getConference() {
        return conference;
    }

    @JsonProperty("conference")
    public void setConference(String conference) {
        this.conference = conference;
    }

    @JsonProperty("dteam1")
    public String getDteam1() {
        return dteam1;
    }

    @JsonProperty("dteam1")
    public void setDteam1(String dteam1) {
        this.dteam1 = dteam1;
    }

    @JsonProperty("dteam2")
    public String getDteam2() {
        return dteam2;
    }

    @JsonProperty("dteam2")
    public void setDteam2(String dteam2) {
        this.dteam2 = dteam2;
    }

    @JsonProperty("numc")
    public String getNumc() {
        return numc;
    }

    @JsonProperty("numc")
    public void setNumc(String numc) {
        this.numc = numc;
    }

    @JsonProperty("no_hour")
    public Boolean getNoHour() {
        return noHour;
    }

    @JsonProperty("no_hour")
    public void setNoHour(Boolean noHour) {
        this.noHour = noHour;
    }

    @JsonProperty("local_abbr")
    public String getLocalAbbr() {
        return localAbbr;
    }

    @JsonProperty("local_abbr")
    public void setLocalAbbr(String localAbbr) {
        this.localAbbr = localAbbr;
    }

    @JsonProperty("visitor_abbr")
    public String getVisitorAbbr() {
        return visitorAbbr;
    }

    @JsonProperty("visitor_abbr")
    public void setVisitorAbbr(String visitorAbbr) {
        this.visitorAbbr = visitorAbbr;
    }

    @JsonProperty("isVideo")
    public Integer getIsVideo() {
        return isVideo;
    }

    @JsonProperty("isVideo")
    public void setIsVideo(Integer isVideo) {
        this.isVideo = isVideo;
    }

    @JsonProperty("numVideos")
    public String getNumVideos() {
        return numVideos;
    }

    @JsonProperty("numVideos")
    public void setNumVideos(String numVideos) {
        this.numVideos = numVideos;
    }

    @JsonProperty("competition_name")
    public String getCompetitionName() {
        return competitionName;
    }

    @JsonProperty("competition_name")
    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    @JsonProperty("competition_id")
    public String getCompetitionId() {
        return competitionId;
    }

    @JsonProperty("competition_id")
    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("type_id")
    public String getTypeId() {
        return typeId;
    }

    @JsonProperty("type_id")
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @JsonProperty("playoffs")
    public Boolean getPlayoffs() {
        return playoffs;
    }

    @JsonProperty("playoffs")
    public void setPlayoffs(Boolean playoffs) {
        this.playoffs = playoffs;
    }

    @JsonProperty("group_code")
    public String getGroupCode() {
        return groupCode;
    }

    @JsonProperty("group_code")
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    @JsonProperty("total_rounds")
    public String getTotalRounds() {
        return totalRounds;
    }

    @JsonProperty("total_rounds")
    public void setTotalRounds(String totalRounds) {
        this.totalRounds = totalRounds;
    }

    @JsonProperty("coef")
    public String getCoef() {
        return coef;
    }

    @JsonProperty("coef")
    public void setCoef(String coef) {
        this.coef = coef;
    }

    @JsonProperty("cflag_local")
    public String getCflagLocal() {
        return cflagLocal;
    }

    @JsonProperty("cflag_local")
    public void setCflagLocal(String cflagLocal) {
        this.cflagLocal = cflagLocal;
    }

    @JsonProperty("cflag_visitor")
    public String getCflagVisitor() {
        return cflagVisitor;
    }

    @JsonProperty("cflag_visitor")
    public void setCflagVisitor(String cflagVisitor) {
        this.cflagVisitor = cflagVisitor;
    }

    @JsonProperty("local_shield")
    public String getLocalShield() {
        return localShield;
    }

    @JsonProperty("local_shield")
    public void setLocalShield(String localShield) {
        this.localShield = localShield;
    }

    @JsonProperty("visitor_shield")
    public String getVisitorShield() {
        return visitorShield;
    }

    @JsonProperty("visitor_shield")
    public void setVisitorShield(String visitorShield) {
        this.visitorShield = visitorShield;
    }

    @JsonProperty("extraTxt")
    public String getExtraTxt() {
        return extraTxt;
    }

    @JsonProperty("extraTxt")
    public void setExtraTxt(String extraTxt) {
        this.extraTxt = extraTxt;
    }

    @JsonProperty("schedule")
    public String getSchedule() {
        return schedule;
    }

    @JsonProperty("schedule")
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("hour")
    public String getHour() {
        return hour;
    }

    @JsonProperty("hour")
    public void setHour(String hour) {
        this.hour = hour;
    }

    @JsonProperty("minute")
    public String getMinute() {
        return minute;
    }

    @JsonProperty("minute")
    public void setMinute(String minute) {
        this.minute = minute;
    }

    @JsonProperty("local_goals")
    public String getLocalGoals() {
        return localGoals;
    }

    @JsonProperty("local_goals")
    public void setLocalGoals(String localGoals) {
        this.localGoals = localGoals;
    }

    @JsonProperty("visitor_goals")
    public String getVisitorGoals() {
        return visitorGoals;
    }

    @JsonProperty("visitor_goals")
    public void setVisitorGoals(String visitorGoals) {
        this.visitorGoals = visitorGoals;
    }

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    @JsonProperty("live_minute")
    public String getLiveMinute() {
        return liveMinute;
    }

    @JsonProperty("live_minute")
    public void setLiveMinute(String liveMinute) {
        this.liveMinute = liveMinute;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("channels")
    public List<Channel> getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    @JsonProperty("winner")
    public String getWinner() {
        return winner;
    }

    @JsonProperty("winner")
    public void setWinner(String winner) {
        this.winner = winner;
    }

    @JsonProperty("penaltis1")
    public Integer getPenaltis1() {
        return penaltis1;
    }

    @JsonProperty("penaltis1")
    public void setPenaltis1(Integer penaltis1) {
        this.penaltis1 = penaltis1;
    }

    @JsonProperty("penaltis2")
    public Integer getPenaltis2() {
        return penaltis2;
    }

    @JsonProperty("penaltis2")
    public void setPenaltis2(Integer penaltis2) {
        this.penaltis2 = penaltis2;
    }

    @JsonProperty("prorroga")
    public Boolean getProrroga() {
        return prorroga;
    }

    @JsonProperty("prorroga")
    public void setProrroga(Boolean prorroga) {
        this.prorroga = prorroga;
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
