
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
    "idLeague",
    "idSoccerXML",
    "idAPIfootball",
    "strSport",
    "strLeague",
    "strLeagueAlternate",
    "strDivision",
    "idCup",
    "strCurrentSeason",
    "intFormedYear",
    "dateFirstEvent",
    "strGender",
    "strCountry",
    "strWebsite",
    "strFacebook",
    "strTwitter",
    "strYoutube",
    "strRSS",
    "strDescriptionEN",
    "strDescriptionDE",
    "strDescriptionFR",
    "strDescriptionIT",
    "strDescriptionCN",
    "strDescriptionJP",
    "strDescriptionRU",
    "strDescriptionES",
    "strDescriptionPT",
    "strDescriptionSE",
    "strDescriptionNL",
    "strDescriptionHU",
    "strDescriptionNO",
    "strDescriptionPL",
    "strDescriptionIL",
    "strFanart1",
    "strFanart2",
    "strFanart3",
    "strFanart4",
    "strBanner",
    "strBadge",
    "strLogo",
    "strPoster",
    "strTrophy",
    "strNaming",
    "strComplete",
    "strLocked"
})
public class League {

    @JsonProperty("idLeague")
    private String idLeague;
    @JsonProperty("idSoccerXML")
    private String idSoccerXML;
    @JsonProperty("idAPIfootball")
    private String idAPIfootball;
    @JsonProperty("strSport")
    private String strSport;
    @JsonProperty("strLeague")
    private String strLeague;
    @JsonProperty("strLeagueAlternate")
    private String strLeagueAlternate;
    @JsonProperty("strDivision")
    private String strDivision;
    @JsonProperty("idCup")
    private String idCup;
    @JsonProperty("strCurrentSeason")
    private String strCurrentSeason;
    @JsonProperty("intFormedYear")
    private String intFormedYear;
    @JsonProperty("dateFirstEvent")
    private String dateFirstEvent;
    @JsonProperty("strGender")
    private String strGender;
    @JsonProperty("strCountry")
    private String strCountry;
    @JsonProperty("strWebsite")
    private String strWebsite;
    @JsonProperty("strFacebook")
    private String strFacebook;
    @JsonProperty("strTwitter")
    private String strTwitter;
    @JsonProperty("strYoutube")
    private String strYoutube;
    @JsonProperty("strRSS")
    private String strRSS;
    @JsonProperty("strDescriptionEN")
    private String strDescriptionEN;
    @JsonProperty("strDescriptionDE")
    private Object strDescriptionDE;
    @JsonProperty("strDescriptionFR")
    private String strDescriptionFR;
    @JsonProperty("strDescriptionIT")
    private Object strDescriptionIT;
    @JsonProperty("strDescriptionCN")
    private Object strDescriptionCN;
    @JsonProperty("strDescriptionJP")
    private Object strDescriptionJP;
    @JsonProperty("strDescriptionRU")
    private Object strDescriptionRU;
    @JsonProperty("strDescriptionES")
    private Object strDescriptionES;
    @JsonProperty("strDescriptionPT")
    private Object strDescriptionPT;
    @JsonProperty("strDescriptionSE")
    private Object strDescriptionSE;
    @JsonProperty("strDescriptionNL")
    private Object strDescriptionNL;
    @JsonProperty("strDescriptionHU")
    private Object strDescriptionHU;
    @JsonProperty("strDescriptionNO")
    private Object strDescriptionNO;
    @JsonProperty("strDescriptionPL")
    private Object strDescriptionPL;
    @JsonProperty("strDescriptionIL")
    private Object strDescriptionIL;
    @JsonProperty("strFanart1")
    private String strFanart1;
    @JsonProperty("strFanart2")
    private String strFanart2;
    @JsonProperty("strFanart3")
    private String strFanart3;
    @JsonProperty("strFanart4")
    private String strFanart4;
    @JsonProperty("strBanner")
    private String strBanner;
    @JsonProperty("strBadge")
    private String strBadge;
    @JsonProperty("strLogo")
    private String strLogo;
    @JsonProperty("strPoster")
    private String strPoster;
    @JsonProperty("strTrophy")
    private String strTrophy;
    @JsonProperty("strNaming")
    private String strNaming;
    @JsonProperty("strComplete")
    private String strComplete;
    @JsonProperty("strLocked")
    private String strLocked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idLeague")
    public String getIdLeague() {
        return idLeague;
    }

    @JsonProperty("idLeague")
    public void setIdLeague(String idLeague) {
        this.idLeague = idLeague;
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
    public String getIdAPIfootball() {
        return idAPIfootball;
    }

    @JsonProperty("idAPIfootball")
    public void setIdAPIfootball(String idAPIfootball) {
        this.idAPIfootball = idAPIfootball;
    }

    @JsonProperty("strSport")
    public String getStrSport() {
        return strSport;
    }

    @JsonProperty("strSport")
    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    @JsonProperty("strLeague")
    public String getStrLeague() {
        return strLeague;
    }

    @JsonProperty("strLeague")
    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }

    @JsonProperty("strLeagueAlternate")
    public String getStrLeagueAlternate() {
        return strLeagueAlternate;
    }

    @JsonProperty("strLeagueAlternate")
    public void setStrLeagueAlternate(String strLeagueAlternate) {
        this.strLeagueAlternate = strLeagueAlternate;
    }

    @JsonProperty("strDivision")
    public String getStrDivision() {
        return strDivision;
    }

    @JsonProperty("strDivision")
    public void setStrDivision(String strDivision) {
        this.strDivision = strDivision;
    }

    @JsonProperty("idCup")
    public String getIdCup() {
        return idCup;
    }

    @JsonProperty("idCup")
    public void setIdCup(String idCup) {
        this.idCup = idCup;
    }

    @JsonProperty("strCurrentSeason")
    public String getStrCurrentSeason() {
        return strCurrentSeason;
    }

    @JsonProperty("strCurrentSeason")
    public void setStrCurrentSeason(String strCurrentSeason) {
        this.strCurrentSeason = strCurrentSeason;
    }

    @JsonProperty("intFormedYear")
    public String getIntFormedYear() {
        return intFormedYear;
    }

    @JsonProperty("intFormedYear")
    public void setIntFormedYear(String intFormedYear) {
        this.intFormedYear = intFormedYear;
    }

    @JsonProperty("dateFirstEvent")
    public String getDateFirstEvent() {
        return dateFirstEvent;
    }

    @JsonProperty("dateFirstEvent")
    public void setDateFirstEvent(String dateFirstEvent) {
        this.dateFirstEvent = dateFirstEvent;
    }

    @JsonProperty("strGender")
    public String getStrGender() {
        return strGender;
    }

    @JsonProperty("strGender")
    public void setStrGender(String strGender) {
        this.strGender = strGender;
    }

    @JsonProperty("strCountry")
    public String getStrCountry() {
        return strCountry;
    }

    @JsonProperty("strCountry")
    public void setStrCountry(String strCountry) {
        this.strCountry = strCountry;
    }

    @JsonProperty("strWebsite")
    public String getStrWebsite() {
        return strWebsite;
    }

    @JsonProperty("strWebsite")
    public void setStrWebsite(String strWebsite) {
        this.strWebsite = strWebsite;
    }

    @JsonProperty("strFacebook")
    public String getStrFacebook() {
        return strFacebook;
    }

    @JsonProperty("strFacebook")
    public void setStrFacebook(String strFacebook) {
        this.strFacebook = strFacebook;
    }

    @JsonProperty("strTwitter")
    public String getStrTwitter() {
        return strTwitter;
    }

    @JsonProperty("strTwitter")
    public void setStrTwitter(String strTwitter) {
        this.strTwitter = strTwitter;
    }

    @JsonProperty("strYoutube")
    public String getStrYoutube() {
        return strYoutube;
    }

    @JsonProperty("strYoutube")
    public void setStrYoutube(String strYoutube) {
        this.strYoutube = strYoutube;
    }

    @JsonProperty("strRSS")
    public String getStrRSS() {
        return strRSS;
    }

    @JsonProperty("strRSS")
    public void setStrRSS(String strRSS) {
        this.strRSS = strRSS;
    }

    @JsonProperty("strDescriptionEN")
    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    @JsonProperty("strDescriptionEN")
    public void setStrDescriptionEN(String strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    @JsonProperty("strDescriptionDE")
    public Object getStrDescriptionDE() {
        return strDescriptionDE;
    }

    @JsonProperty("strDescriptionDE")
    public void setStrDescriptionDE(Object strDescriptionDE) {
        this.strDescriptionDE = strDescriptionDE;
    }

    @JsonProperty("strDescriptionFR")
    public String getStrDescriptionFR() {
        return strDescriptionFR;
    }

    @JsonProperty("strDescriptionFR")
    public void setStrDescriptionFR(String strDescriptionFR) {
        this.strDescriptionFR = strDescriptionFR;
    }

    @JsonProperty("strDescriptionIT")
    public Object getStrDescriptionIT() {
        return strDescriptionIT;
    }

    @JsonProperty("strDescriptionIT")
    public void setStrDescriptionIT(Object strDescriptionIT) {
        this.strDescriptionIT = strDescriptionIT;
    }

    @JsonProperty("strDescriptionCN")
    public Object getStrDescriptionCN() {
        return strDescriptionCN;
    }

    @JsonProperty("strDescriptionCN")
    public void setStrDescriptionCN(Object strDescriptionCN) {
        this.strDescriptionCN = strDescriptionCN;
    }

    @JsonProperty("strDescriptionJP")
    public Object getStrDescriptionJP() {
        return strDescriptionJP;
    }

    @JsonProperty("strDescriptionJP")
    public void setStrDescriptionJP(Object strDescriptionJP) {
        this.strDescriptionJP = strDescriptionJP;
    }

    @JsonProperty("strDescriptionRU")
    public Object getStrDescriptionRU() {
        return strDescriptionRU;
    }

    @JsonProperty("strDescriptionRU")
    public void setStrDescriptionRU(Object strDescriptionRU) {
        this.strDescriptionRU = strDescriptionRU;
    }

    @JsonProperty("strDescriptionES")
    public Object getStrDescriptionES() {
        return strDescriptionES;
    }

    @JsonProperty("strDescriptionES")
    public void setStrDescriptionES(Object strDescriptionES) {
        this.strDescriptionES = strDescriptionES;
    }

    @JsonProperty("strDescriptionPT")
    public Object getStrDescriptionPT() {
        return strDescriptionPT;
    }

    @JsonProperty("strDescriptionPT")
    public void setStrDescriptionPT(Object strDescriptionPT) {
        this.strDescriptionPT = strDescriptionPT;
    }

    @JsonProperty("strDescriptionSE")
    public Object getStrDescriptionSE() {
        return strDescriptionSE;
    }

    @JsonProperty("strDescriptionSE")
    public void setStrDescriptionSE(Object strDescriptionSE) {
        this.strDescriptionSE = strDescriptionSE;
    }

    @JsonProperty("strDescriptionNL")
    public Object getStrDescriptionNL() {
        return strDescriptionNL;
    }

    @JsonProperty("strDescriptionNL")
    public void setStrDescriptionNL(Object strDescriptionNL) {
        this.strDescriptionNL = strDescriptionNL;
    }

    @JsonProperty("strDescriptionHU")
    public Object getStrDescriptionHU() {
        return strDescriptionHU;
    }

    @JsonProperty("strDescriptionHU")
    public void setStrDescriptionHU(Object strDescriptionHU) {
        this.strDescriptionHU = strDescriptionHU;
    }

    @JsonProperty("strDescriptionNO")
    public Object getStrDescriptionNO() {
        return strDescriptionNO;
    }

    @JsonProperty("strDescriptionNO")
    public void setStrDescriptionNO(Object strDescriptionNO) {
        this.strDescriptionNO = strDescriptionNO;
    }

    @JsonProperty("strDescriptionPL")
    public Object getStrDescriptionPL() {
        return strDescriptionPL;
    }

    @JsonProperty("strDescriptionPL")
    public void setStrDescriptionPL(Object strDescriptionPL) {
        this.strDescriptionPL = strDescriptionPL;
    }

    @JsonProperty("strDescriptionIL")
    public Object getStrDescriptionIL() {
        return strDescriptionIL;
    }

    @JsonProperty("strDescriptionIL")
    public void setStrDescriptionIL(Object strDescriptionIL) {
        this.strDescriptionIL = strDescriptionIL;
    }

    @JsonProperty("strFanart1")
    public String getStrFanart1() {
        return strFanart1;
    }

    @JsonProperty("strFanart1")
    public void setStrFanart1(String strFanart1) {
        this.strFanart1 = strFanart1;
    }

    @JsonProperty("strFanart2")
    public String getStrFanart2() {
        return strFanart2;
    }

    @JsonProperty("strFanart2")
    public void setStrFanart2(String strFanart2) {
        this.strFanart2 = strFanart2;
    }

    @JsonProperty("strFanart3")
    public String getStrFanart3() {
        return strFanart3;
    }

    @JsonProperty("strFanart3")
    public void setStrFanart3(String strFanart3) {
        this.strFanart3 = strFanart3;
    }

    @JsonProperty("strFanart4")
    public String getStrFanart4() {
        return strFanart4;
    }

    @JsonProperty("strFanart4")
    public void setStrFanart4(String strFanart4) {
        this.strFanart4 = strFanart4;
    }

    @JsonProperty("strBanner")
    public String getStrBanner() {
        return strBanner;
    }

    @JsonProperty("strBanner")
    public void setStrBanner(String strBanner) {
        this.strBanner = strBanner;
    }

    @JsonProperty("strBadge")
    public String getStrBadge() {
        return strBadge;
    }

    @JsonProperty("strBadge")
    public void setStrBadge(String strBadge) {
        this.strBadge = strBadge;
    }

    @JsonProperty("strLogo")
    public String getStrLogo() {
        return strLogo;
    }

    @JsonProperty("strLogo")
    public void setStrLogo(String strLogo) {
        this.strLogo = strLogo;
    }

    @JsonProperty("strPoster")
    public String getStrPoster() {
        return strPoster;
    }

    @JsonProperty("strPoster")
    public void setStrPoster(String strPoster) {
        this.strPoster = strPoster;
    }

    @JsonProperty("strTrophy")
    public String getStrTrophy() {
        return strTrophy;
    }

    @JsonProperty("strTrophy")
    public void setStrTrophy(String strTrophy) {
        this.strTrophy = strTrophy;
    }

    @JsonProperty("strNaming")
    public String getStrNaming() {
        return strNaming;
    }

    @JsonProperty("strNaming")
    public void setStrNaming(String strNaming) {
        this.strNaming = strNaming;
    }

    @JsonProperty("strComplete")
    public String getStrComplete() {
        return strComplete;
    }

    @JsonProperty("strComplete")
    public void setStrComplete(String strComplete) {
        this.strComplete = strComplete;
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
