
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
    "idEvent",
    "idSoccerXML",
    "idAPIfootball",
    "strEvent",
    "strEventAlternate",
    "strFilename",
    "strSport",
    "idLeague",
    "strLeague",
    "strSeason",
    "strDescriptionEN",
    "strHomeTeam",
    "strAwayTeam",
    "intHomeScore",
    "intRound",
    "intAwayScore",
    "intSpectators",
    "strHomeGoalDetails",
    "strHomeRedCards",
    "strHomeYellowCards",
    "strHomeLineupGoalkeeper",
    "strHomeLineupDefense",
    "strHomeLineupMidfield",
    "strHomeLineupForward",
    "strHomeLineupSubstitutes",
    "strHomeFormation",
    "strAwayRedCards",
    "strAwayYellowCards",
    "strAwayGoalDetails",
    "strAwayLineupGoalkeeper",
    "strAwayLineupDefense",
    "strAwayLineupMidfield",
    "strAwayLineupForward",
    "strAwayLineupSubstitutes",
    "strAwayFormation",
    "intHomeShots",
    "intAwayShots",
    "dateEvent",
    "dateEventLocal",
    "strDate",
    "strTime",
    "strTimeLocal",
    "strTVStation",
    "idHomeTeam",
    "idAwayTeam",
    "strResult",
    "strCircuit",
    "strCountry",
    "strCity",
    "strPoster",
    "strFanart",
    "strThumb",
    "strBanner",
    "strMap",
    "strTweet1",
    "strTweet2",
    "strTweet3",
    "strVideo",
    "strPostponed",
    "strLocked"
})
public class Event {

    @JsonProperty("idEvent")
    private String idEvent;
    @JsonProperty("idSoccerXML")
    private String idSoccerXML;
    @JsonProperty("idAPIfootball")
    private Object idAPIfootball;
    @JsonProperty("strEvent")
    private String strEvent;
    @JsonProperty("strEventAlternate")
    private String strEventAlternate;
    @JsonProperty("strFilename")
    private String strFilename;
    @JsonProperty("strSport")
    private String strSport;
    @JsonProperty("idLeague")
    private String idLeague;
    @JsonProperty("strLeague")
    private String strLeague;
    @JsonProperty("strSeason")
    private String strSeason;
    @JsonProperty("strDescriptionEN")
    private Object strDescriptionEN;
    @JsonProperty("strHomeTeam")
    private String strHomeTeam;
    @JsonProperty("strAwayTeam")
    private String strAwayTeam;
    @JsonProperty("intHomeScore")
    private String intHomeScore;
    @JsonProperty("intRound")
    private String intRound;
    @JsonProperty("intAwayScore")
    private String intAwayScore;
    @JsonProperty("intSpectators")
    private String intSpectators;
    @JsonProperty("strHomeGoalDetails")
    private String strHomeGoalDetails;
    @JsonProperty("strHomeRedCards")
    private String strHomeRedCards;
    @JsonProperty("strHomeYellowCards")
    private String strHomeYellowCards;
    @JsonProperty("strHomeLineupGoalkeeper")
    private String strHomeLineupGoalkeeper;
    @JsonProperty("strHomeLineupDefense")
    private String strHomeLineupDefense;
    @JsonProperty("strHomeLineupMidfield")
    private String strHomeLineupMidfield;
    @JsonProperty("strHomeLineupForward")
    private String strHomeLineupForward;
    @JsonProperty("strHomeLineupSubstitutes")
    private String strHomeLineupSubstitutes;
    @JsonProperty("strHomeFormation")
    private String strHomeFormation;
    @JsonProperty("strAwayRedCards")
    private String strAwayRedCards;
    @JsonProperty("strAwayYellowCards")
    private String strAwayYellowCards;
    @JsonProperty("strAwayGoalDetails")
    private String strAwayGoalDetails;
    @JsonProperty("strAwayLineupGoalkeeper")
    private String strAwayLineupGoalkeeper;
    @JsonProperty("strAwayLineupDefense")
    private String strAwayLineupDefense;
    @JsonProperty("strAwayLineupMidfield")
    private String strAwayLineupMidfield;
    @JsonProperty("strAwayLineupForward")
    private String strAwayLineupForward;
    @JsonProperty("strAwayLineupSubstitutes")
    private String strAwayLineupSubstitutes;
    @JsonProperty("strAwayFormation")
    private String strAwayFormation;
    @JsonProperty("intHomeShots")
    private String intHomeShots;
    @JsonProperty("intAwayShots")
    private String intAwayShots;
    @JsonProperty("dateEvent")
    private String dateEvent;
    @JsonProperty("dateEventLocal")
    private Object dateEventLocal;
    @JsonProperty("strDate")
    private String strDate;
    @JsonProperty("strTime")
    private String strTime;
    @JsonProperty("strTimeLocal")
    private Object strTimeLocal;
    @JsonProperty("strTVStation")
    private Object strTVStation;
    @JsonProperty("idHomeTeam")
    private String idHomeTeam;
    @JsonProperty("idAwayTeam")
    private String idAwayTeam;
    @JsonProperty("strResult")
    private Object strResult;
    @JsonProperty("strCircuit")
    private Object strCircuit;
    @JsonProperty("strCountry")
    private Object strCountry;
    @JsonProperty("strCity")
    private Object strCity;
    @JsonProperty("strPoster")
    private Object strPoster;
    @JsonProperty("strFanart")
    private Object strFanart;
    @JsonProperty("strThumb")
    private Object strThumb;
    @JsonProperty("strBanner")
    private Object strBanner;
    @JsonProperty("strMap")
    private Object strMap;
    @JsonProperty("strTweet1")
    private Object strTweet1;
    @JsonProperty("strTweet2")
    private Object strTweet2;
    @JsonProperty("strTweet3")
    private Object strTweet3;
    @JsonProperty("strVideo")
    private Object strVideo;
    @JsonProperty("strPostponed")
    private String strPostponed;
    @JsonProperty("strLocked")
    private String strLocked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idEvent")
    public String getIdEvent() {
        return idEvent;
    }

    @JsonProperty("idEvent")
    public void setIdEvent(String idEvent) {
        this.idEvent = idEvent;
    }

    @JsonProperty("idSoccerXML")
    public String getIdSoccerXML() {
        return idSoccerXML;
    }

    @JsonProperty("idSoccerXML")
    public void setIdSoccerXML(String idSoccerXML) {
        this.idSoccerXML = idSoccerXML;
    }

    @JsonProperty("idAPIfootball")
    public Object getIdAPIfootball() {
        return idAPIfootball;
    }

    @JsonProperty("idAPIfootball")
    public void setIdAPIfootball(Object idAPIfootball) {
        this.idAPIfootball = idAPIfootball;
    }

    @JsonProperty("strEvent")
    public String getStrEvent() {
        return strEvent;
    }

    @JsonProperty("strEvent")
    public void setStrEvent(String strEvent) {
        this.strEvent = strEvent;
    }

    @JsonProperty("strEventAlternate")
    public String getStrEventAlternate() {
        return strEventAlternate;
    }

    @JsonProperty("strEventAlternate")
    public void setStrEventAlternate(String strEventAlternate) {
        this.strEventAlternate = strEventAlternate;
    }

    @JsonProperty("strFilename")
    public String getStrFilename() {
        return strFilename;
    }

    @JsonProperty("strFilename")
    public void setStrFilename(String strFilename) {
        this.strFilename = strFilename;
    }

    @JsonProperty("strSport")
    public String getStrSport() {
        return strSport;
    }

    @JsonProperty("strSport")
    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    @JsonProperty("idLeague")
    public String getIdLeague() {
        return idLeague;
    }

    @JsonProperty("idLeague")
    public void setIdLeague(String idLeague) {
        this.idLeague = idLeague;
    }

    @JsonProperty("strLeague")
    public String getStrLeague() {
        return strLeague;
    }

    @JsonProperty("strLeague")
    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }

    @JsonProperty("strSeason")
    public String getStrSeason() {
        return strSeason;
    }

    @JsonProperty("strSeason")
    public void setStrSeason(String strSeason) {
        this.strSeason = strSeason;
    }

    @JsonProperty("strDescriptionEN")
    public Object getStrDescriptionEN() {
        return strDescriptionEN;
    }

    @JsonProperty("strDescriptionEN")
    public void setStrDescriptionEN(Object strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    @JsonProperty("strHomeTeam")
    public String getStrHomeTeam() {
        return strHomeTeam;
    }

    @JsonProperty("strHomeTeam")
    public void setStrHomeTeam(String strHomeTeam) {
        this.strHomeTeam = strHomeTeam;
    }

    @JsonProperty("strAwayTeam")
    public String getStrAwayTeam() {
        return strAwayTeam;
    }

    @JsonProperty("strAwayTeam")
    public void setStrAwayTeam(String strAwayTeam) {
        this.strAwayTeam = strAwayTeam;
    }

    @JsonProperty("intHomeScore")
    public String getIntHomeScore() {
        return intHomeScore;
    }

    @JsonProperty("intHomeScore")
    public void setIntHomeScore(String intHomeScore) {
        this.intHomeScore = intHomeScore;
    }

    @JsonProperty("intRound")
    public String getIntRound() {
        return intRound;
    }

    @JsonProperty("intRound")
    public void setIntRound(String intRound) {
        this.intRound = intRound;
    }

    @JsonProperty("intAwayScore")
    public String getIntAwayScore() {
        return intAwayScore;
    }

    @JsonProperty("intAwayScore")
    public void setIntAwayScore(String intAwayScore) {
        this.intAwayScore = intAwayScore;
    }

    @JsonProperty("intSpectators")
    public String getIntSpectators() {
        return intSpectators;
    }

    @JsonProperty("intSpectators")
    public void setIntSpectators(String intSpectators) {
        this.intSpectators = intSpectators;
    }

    @JsonProperty("strHomeGoalDetails")
    public String getStrHomeGoalDetails() {
        return strHomeGoalDetails;
    }

    @JsonProperty("strHomeGoalDetails")
    public void setStrHomeGoalDetails(String strHomeGoalDetails) {
        this.strHomeGoalDetails = strHomeGoalDetails;
    }

    @JsonProperty("strHomeRedCards")
    public String getStrHomeRedCards() {
        return strHomeRedCards;
    }

    @JsonProperty("strHomeRedCards")
    public void setStrHomeRedCards(String strHomeRedCards) {
        this.strHomeRedCards = strHomeRedCards;
    }

    @JsonProperty("strHomeYellowCards")
    public String getStrHomeYellowCards() {
        return strHomeYellowCards;
    }

    @JsonProperty("strHomeYellowCards")
    public void setStrHomeYellowCards(String strHomeYellowCards) {
        this.strHomeYellowCards = strHomeYellowCards;
    }

    @JsonProperty("strHomeLineupGoalkeeper")
    public String getStrHomeLineupGoalkeeper() {
        return strHomeLineupGoalkeeper;
    }

    @JsonProperty("strHomeLineupGoalkeeper")
    public void setStrHomeLineupGoalkeeper(String strHomeLineupGoalkeeper) {
        this.strHomeLineupGoalkeeper = strHomeLineupGoalkeeper;
    }

    @JsonProperty("strHomeLineupDefense")
    public String getStrHomeLineupDefense() {
        return strHomeLineupDefense;
    }

    @JsonProperty("strHomeLineupDefense")
    public void setStrHomeLineupDefense(String strHomeLineupDefense) {
        this.strHomeLineupDefense = strHomeLineupDefense;
    }

    @JsonProperty("strHomeLineupMidfield")
    public String getStrHomeLineupMidfield() {
        return strHomeLineupMidfield;
    }

    @JsonProperty("strHomeLineupMidfield")
    public void setStrHomeLineupMidfield(String strHomeLineupMidfield) {
        this.strHomeLineupMidfield = strHomeLineupMidfield;
    }

    @JsonProperty("strHomeLineupForward")
    public String getStrHomeLineupForward() {
        return strHomeLineupForward;
    }

    @JsonProperty("strHomeLineupForward")
    public void setStrHomeLineupForward(String strHomeLineupForward) {
        this.strHomeLineupForward = strHomeLineupForward;
    }

    @JsonProperty("strHomeLineupSubstitutes")
    public String getStrHomeLineupSubstitutes() {
        return strHomeLineupSubstitutes;
    }

    @JsonProperty("strHomeLineupSubstitutes")
    public void setStrHomeLineupSubstitutes(String strHomeLineupSubstitutes) {
        this.strHomeLineupSubstitutes = strHomeLineupSubstitutes;
    }

    @JsonProperty("strHomeFormation")
    public String getStrHomeFormation() {
        return strHomeFormation;
    }

    @JsonProperty("strHomeFormation")
    public void setStrHomeFormation(String strHomeFormation) {
        this.strHomeFormation = strHomeFormation;
    }

    @JsonProperty("strAwayRedCards")
    public String getStrAwayRedCards() {
        return strAwayRedCards;
    }

    @JsonProperty("strAwayRedCards")
    public void setStrAwayRedCards(String strAwayRedCards) {
        this.strAwayRedCards = strAwayRedCards;
    }

    @JsonProperty("strAwayYellowCards")
    public String getStrAwayYellowCards() {
        return strAwayYellowCards;
    }

    @JsonProperty("strAwayYellowCards")
    public void setStrAwayYellowCards(String strAwayYellowCards) {
        this.strAwayYellowCards = strAwayYellowCards;
    }

    @JsonProperty("strAwayGoalDetails")
    public String getStrAwayGoalDetails() {
        return strAwayGoalDetails;
    }

    @JsonProperty("strAwayGoalDetails")
    public void setStrAwayGoalDetails(String strAwayGoalDetails) {
        this.strAwayGoalDetails = strAwayGoalDetails;
    }

    @JsonProperty("strAwayLineupGoalkeeper")
    public String getStrAwayLineupGoalkeeper() {
        return strAwayLineupGoalkeeper;
    }

    @JsonProperty("strAwayLineupGoalkeeper")
    public void setStrAwayLineupGoalkeeper(String strAwayLineupGoalkeeper) {
        this.strAwayLineupGoalkeeper = strAwayLineupGoalkeeper;
    }

    @JsonProperty("strAwayLineupDefense")
    public String getStrAwayLineupDefense() {
        return strAwayLineupDefense;
    }

    @JsonProperty("strAwayLineupDefense")
    public void setStrAwayLineupDefense(String strAwayLineupDefense) {
        this.strAwayLineupDefense = strAwayLineupDefense;
    }

    @JsonProperty("strAwayLineupMidfield")
    public String getStrAwayLineupMidfield() {
        return strAwayLineupMidfield;
    }

    @JsonProperty("strAwayLineupMidfield")
    public void setStrAwayLineupMidfield(String strAwayLineupMidfield) {
        this.strAwayLineupMidfield = strAwayLineupMidfield;
    }

    @JsonProperty("strAwayLineupForward")
    public String getStrAwayLineupForward() {
        return strAwayLineupForward;
    }

    @JsonProperty("strAwayLineupForward")
    public void setStrAwayLineupForward(String strAwayLineupForward) {
        this.strAwayLineupForward = strAwayLineupForward;
    }

    @JsonProperty("strAwayLineupSubstitutes")
    public String getStrAwayLineupSubstitutes() {
        return strAwayLineupSubstitutes;
    }

    @JsonProperty("strAwayLineupSubstitutes")
    public void setStrAwayLineupSubstitutes(String strAwayLineupSubstitutes) {
        this.strAwayLineupSubstitutes = strAwayLineupSubstitutes;
    }

    @JsonProperty("strAwayFormation")
    public String getStrAwayFormation() {
        return strAwayFormation;
    }

    @JsonProperty("strAwayFormation")
    public void setStrAwayFormation(String strAwayFormation) {
        this.strAwayFormation = strAwayFormation;
    }

    @JsonProperty("intHomeShots")
    public String getIntHomeShots() {
        return intHomeShots;
    }

    @JsonProperty("intHomeShots")
    public void setIntHomeShots(String intHomeShots) {
        this.intHomeShots = intHomeShots;
    }

    @JsonProperty("intAwayShots")
    public String getIntAwayShots() {
        return intAwayShots;
    }

    @JsonProperty("intAwayShots")
    public void setIntAwayShots(String intAwayShots) {
        this.intAwayShots = intAwayShots;
    }

    @JsonProperty("dateEvent")
    public String getDateEvent() {
        return dateEvent;
    }

    @JsonProperty("dateEvent")
    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    @JsonProperty("dateEventLocal")
    public Object getDateEventLocal() {
        return dateEventLocal;
    }

    @JsonProperty("dateEventLocal")
    public void setDateEventLocal(Object dateEventLocal) {
        this.dateEventLocal = dateEventLocal;
    }

    @JsonProperty("strDate")
    public String getStrDate() {
        return strDate;
    }

    @JsonProperty("strDate")
    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    @JsonProperty("strTime")
    public String getStrTime() {
        return strTime;
    }

    @JsonProperty("strTime")
    public void setStrTime(String strTime) {
        this.strTime = strTime;
    }

    @JsonProperty("strTimeLocal")
    public Object getStrTimeLocal() {
        return strTimeLocal;
    }

    @JsonProperty("strTimeLocal")
    public void setStrTimeLocal(Object strTimeLocal) {
        this.strTimeLocal = strTimeLocal;
    }

    @JsonProperty("strTVStation")
    public Object getStrTVStation() {
        return strTVStation;
    }

    @JsonProperty("strTVStation")
    public void setStrTVStation(Object strTVStation) {
        this.strTVStation = strTVStation;
    }

    @JsonProperty("idHomeTeam")
    public String getIdHomeTeam() {
        return idHomeTeam;
    }

    @JsonProperty("idHomeTeam")
    public void setIdHomeTeam(String idHomeTeam) {
        this.idHomeTeam = idHomeTeam;
    }

    @JsonProperty("idAwayTeam")
    public String getIdAwayTeam() {
        return idAwayTeam;
    }

    @JsonProperty("idAwayTeam")
    public void setIdAwayTeam(String idAwayTeam) {
        this.idAwayTeam = idAwayTeam;
    }

    @JsonProperty("strResult")
    public Object getStrResult() {
        return strResult;
    }

    @JsonProperty("strResult")
    public void setStrResult(Object strResult) {
        this.strResult = strResult;
    }

    @JsonProperty("strCircuit")
    public Object getStrCircuit() {
        return strCircuit;
    }

    @JsonProperty("strCircuit")
    public void setStrCircuit(Object strCircuit) {
        this.strCircuit = strCircuit;
    }

    @JsonProperty("strCountry")
    public Object getStrCountry() {
        return strCountry;
    }

    @JsonProperty("strCountry")
    public void setStrCountry(Object strCountry) {
        this.strCountry = strCountry;
    }

    @JsonProperty("strCity")
    public Object getStrCity() {
        return strCity;
    }

    @JsonProperty("strCity")
    public void setStrCity(Object strCity) {
        this.strCity = strCity;
    }

    @JsonProperty("strPoster")
    public Object getStrPoster() {
        return strPoster;
    }

    @JsonProperty("strPoster")
    public void setStrPoster(Object strPoster) {
        this.strPoster = strPoster;
    }

    @JsonProperty("strFanart")
    public Object getStrFanart() {
        return strFanart;
    }

    @JsonProperty("strFanart")
    public void setStrFanart(Object strFanart) {
        this.strFanart = strFanart;
    }

    @JsonProperty("strThumb")
    public Object getStrThumb() {
        return strThumb;
    }

    @JsonProperty("strThumb")
    public void setStrThumb(Object strThumb) {
        this.strThumb = strThumb;
    }

    @JsonProperty("strBanner")
    public Object getStrBanner() {
        return strBanner;
    }

    @JsonProperty("strBanner")
    public void setStrBanner(Object strBanner) {
        this.strBanner = strBanner;
    }

    @JsonProperty("strMap")
    public Object getStrMap() {
        return strMap;
    }

    @JsonProperty("strMap")
    public void setStrMap(Object strMap) {
        this.strMap = strMap;
    }

    @JsonProperty("strTweet1")
    public Object getStrTweet1() {
        return strTweet1;
    }

    @JsonProperty("strTweet1")
    public void setStrTweet1(Object strTweet1) {
        this.strTweet1 = strTweet1;
    }

    @JsonProperty("strTweet2")
    public Object getStrTweet2() {
        return strTweet2;
    }

    @JsonProperty("strTweet2")
    public void setStrTweet2(Object strTweet2) {
        this.strTweet2 = strTweet2;
    }

    @JsonProperty("strTweet3")
    public Object getStrTweet3() {
        return strTweet3;
    }

    @JsonProperty("strTweet3")
    public void setStrTweet3(Object strTweet3) {
        this.strTweet3 = strTweet3;
    }

    @JsonProperty("strVideo")
    public Object getStrVideo() {
        return strVideo;
    }

    @JsonProperty("strVideo")
    public void setStrVideo(Object strVideo) {
        this.strVideo = strVideo;
    }

    @JsonProperty("strPostponed")
    public String getStrPostponed() {
        return strPostponed;
    }

    @JsonProperty("strPostponed")
    public void setStrPostponed(String strPostponed) {
        this.strPostponed = strPostponed;
    }

    @JsonProperty("strLocked")
    public String getStrLocked() {
        return strLocked;
    }

    @JsonProperty("strLocked")
    public void setStrLocked(String strLocked) {
        this.strLocked = strLocked;
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
