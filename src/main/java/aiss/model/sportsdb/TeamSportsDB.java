
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
    "idTeam",
    "idSoccerXML",
    "idAPIfootball",
    "intLoved",
    "strTeam",
    "strTeamShort",
    "strAlternate",
    "intFormedYear",
    "strSport",
    "strLeague",
    "idLeague",
    "strLeague2",
    "idLeague2",
    "strLeague3",
    "idLeague3",
    "strLeague4",
    "idLeague4",
    "strLeague5",
    "idLeague5",
    "strDivision",
    "strManager",
    "strStadium",
    "strKeywords",
    "strRSS",
    "strStadiumThumb",
    "strStadiumDescription",
    "strStadiumLocation",
    "intStadiumCapacity",
    "strWebsite",
    "strFacebook",
    "strTwitter",
    "strInstagram",
    "strDescriptionEN",
    "strDescriptionDE",
    "strDescriptionFR",
    "strDescriptionCN",
    "strDescriptionIT",
    "strDescriptionJP",
    "strDescriptionRU",
    "strDescriptionES",
    "strDescriptionPT",
    "strDescriptionSE",
    "strDescriptionNL",
    "strDescriptionHU",
    "strDescriptionNO",
    "strDescriptionIL",
    "strDescriptionPL",
    "strGender",
    "strCountry",
    "strTeamBadge",
    "strTeamJersey",
    "strTeamLogo",
    "strTeamFanart1",
    "strTeamFanart2",
    "strTeamFanart3",
    "strTeamFanart4",
    "strTeamBanner",
    "strYoutube",
    "strLocked"
})
public class TeamSportsDB {

    @JsonProperty("idTeam")
    private String idTeam;
    @JsonProperty("idSoccerXML")
    private String idSoccerXML;
    @JsonProperty("idAPIfootball")
    private String idAPIfootball;
    @JsonProperty("intLoved")
    private String intLoved;
    @JsonProperty("strTeam")
    private String strTeam;
    @JsonProperty("strTeamShort")
    private String strTeamShort;
    @JsonProperty("strAlternate")
    private String strAlternate;
    @JsonProperty("intFormedYear")
    private String intFormedYear;
    @JsonProperty("strSport")
    private String strSport;
    @JsonProperty("strLeague")
    private String strLeague;
    @JsonProperty("idLeague")
    private String idLeague;
    @JsonProperty("strLeague2")
    private String strLeague2;
    @JsonProperty("idLeague2")
    private String idLeague2;
    @JsonProperty("strLeague3")
    private String strLeague3;
    @JsonProperty("idLeague3")
    private String idLeague3;
    @JsonProperty("strLeague4")
    private String strLeague4;
    @JsonProperty("idLeague4")
    private String idLeague4;
    @JsonProperty("strLeague5")
    private String strLeague5;
    @JsonProperty("idLeague5")
    private Object idLeague5;
    @JsonProperty("strDivision")
    private Object strDivision;
    @JsonProperty("strManager")
    private String strManager;
    @JsonProperty("strStadium")
    private String strStadium;
    @JsonProperty("strKeywords")
    private String strKeywords;
    @JsonProperty("strRSS")
    private String strRSS;
    @JsonProperty("strStadiumThumb")
    private String strStadiumThumb;
    @JsonProperty("strStadiumDescription")
    private String strStadiumDescription;
    @JsonProperty("strStadiumLocation")
    private String strStadiumLocation;
    @JsonProperty("intStadiumCapacity")
    private String intStadiumCapacity;
    @JsonProperty("strWebsite")
    private String strWebsite;
    @JsonProperty("strFacebook")
    private String strFacebook;
    @JsonProperty("strTwitter")
    private String strTwitter;
    @JsonProperty("strInstagram")
    private String strInstagram;
    @JsonProperty("strDescriptionEN")
    private String strDescriptionEN;
    @JsonProperty("strDescriptionDE")
    private String strDescriptionDE;
    @JsonProperty("strDescriptionFR")
    private String strDescriptionFR;
    @JsonProperty("strDescriptionCN")
    private Object strDescriptionCN;
    @JsonProperty("strDescriptionIT")
    private String strDescriptionIT;
    @JsonProperty("strDescriptionJP")
    private String strDescriptionJP;
    @JsonProperty("strDescriptionRU")
    private String strDescriptionRU;
    @JsonProperty("strDescriptionES")
    private String strDescriptionES;
    @JsonProperty("strDescriptionPT")
    private String strDescriptionPT;
    @JsonProperty("strDescriptionSE")
    private Object strDescriptionSE;
    @JsonProperty("strDescriptionNL")
    private Object strDescriptionNL;
    @JsonProperty("strDescriptionHU")
    private Object strDescriptionHU;
    @JsonProperty("strDescriptionNO")
    private String strDescriptionNO;
    @JsonProperty("strDescriptionIL")
    private Object strDescriptionIL;
    @JsonProperty("strDescriptionPL")
    private Object strDescriptionPL;
    @JsonProperty("strGender")
    private String strGender;
    @JsonProperty("strCountry")
    private String strCountry;
    @JsonProperty("strTeamBadge")
    private String strTeamBadge;
    @JsonProperty("strTeamJersey")
    private String strTeamJersey;
    @JsonProperty("strTeamLogo")
    private String strTeamLogo;
    @JsonProperty("strTeamFanart1")
    private String strTeamFanart1;
    @JsonProperty("strTeamFanart2")
    private String strTeamFanart2;
    @JsonProperty("strTeamFanart3")
    private String strTeamFanart3;
    @JsonProperty("strTeamFanart4")
    private String strTeamFanart4;
    @JsonProperty("strTeamBanner")
    private String strTeamBanner;
    @JsonProperty("strYoutube")
    private String strYoutube;
    @JsonProperty("strLocked")
    private String strLocked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idTeam")
    public String getIdTeam() {
        return idTeam;
    }

    @JsonProperty("idTeam")
    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
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

    @JsonProperty("intLoved")
    public String getIntLoved() {
        return intLoved;
    }

    @JsonProperty("intLoved")
    public void setIntLoved(String intLoved) {
        this.intLoved = intLoved;
    }

    @JsonProperty("strTeam")
    public String getStrTeam() {
        return strTeam;
    }

    @JsonProperty("strTeam")
    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    @JsonProperty("strTeamShort")
    public String getStrTeamShort() {
        return strTeamShort;
    }

    @JsonProperty("strTeamShort")
    public void setStrTeamShort(String strTeamShort) {
        this.strTeamShort = strTeamShort;
    }

    @JsonProperty("strAlternate")
    public String getStrAlternate() {
        return strAlternate;
    }

    @JsonProperty("strAlternate")
    public void setStrAlternate(String strAlternate) {
        this.strAlternate = strAlternate;
    }

    @JsonProperty("intFormedYear")
    public String getIntFormedYear() {
        return intFormedYear;
    }

    @JsonProperty("intFormedYear")
    public void setIntFormedYear(String intFormedYear) {
        this.intFormedYear = intFormedYear;
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

    @JsonProperty("idLeague")
    public String getIdLeague() {
        return idLeague;
    }

    @JsonProperty("idLeague")
    public void setIdLeague(String idLeague) {
        this.idLeague = idLeague;
    }

    @JsonProperty("strLeague2")
    public String getStrLeague2() {
        return strLeague2;
    }

    @JsonProperty("strLeague2")
    public void setStrLeague2(String strLeague2) {
        this.strLeague2 = strLeague2;
    }

    @JsonProperty("idLeague2")
    public String getIdLeague2() {
        return idLeague2;
    }

    @JsonProperty("idLeague2")
    public void setIdLeague2(String idLeague2) {
        this.idLeague2 = idLeague2;
    }

    @JsonProperty("strLeague3")
    public String getStrLeague3() {
        return strLeague3;
    }

    @JsonProperty("strLeague3")
    public void setStrLeague3(String strLeague3) {
        this.strLeague3 = strLeague3;
    }

    @JsonProperty("idLeague3")
    public String getIdLeague3() {
        return idLeague3;
    }

    @JsonProperty("idLeague3")
    public void setIdLeague3(String idLeague3) {
        this.idLeague3 = idLeague3;
    }

    @JsonProperty("strLeague4")
    public String getStrLeague4() {
        return strLeague4;
    }

    @JsonProperty("strLeague4")
    public void setStrLeague4(String strLeague4) {
        this.strLeague4 = strLeague4;
    }

    @JsonProperty("idLeague4")
    public String getIdLeague4() {
        return idLeague4;
    }

    @JsonProperty("idLeague4")
    public void setIdLeague4(String idLeague4) {
        this.idLeague4 = idLeague4;
    }

    @JsonProperty("strLeague5")
    public String getStrLeague5() {
        return strLeague5;
    }

    @JsonProperty("strLeague5")
    public void setStrLeague5(String strLeague5) {
        this.strLeague5 = strLeague5;
    }

    @JsonProperty("idLeague5")
    public Object getIdLeague5() {
        return idLeague5;
    }

    @JsonProperty("idLeague5")
    public void setIdLeague5(Object idLeague5) {
        this.idLeague5 = idLeague5;
    }

    @JsonProperty("strDivision")
    public Object getStrDivision() {
        return strDivision;
    }

    @JsonProperty("strDivision")
    public void setStrDivision(Object strDivision) {
        this.strDivision = strDivision;
    }

    @JsonProperty("strManager")
    public String getStrManager() {
        return strManager;
    }

    @JsonProperty("strManager")
    public void setStrManager(String strManager) {
        this.strManager = strManager;
    }

    @JsonProperty("strStadium")
    public String getStrStadium() {
        return strStadium;
    }

    @JsonProperty("strStadium")
    public void setStrStadium(String strStadium) {
        this.strStadium = strStadium;
    }

    @JsonProperty("strKeywords")
    public String getStrKeywords() {
        return strKeywords;
    }

    @JsonProperty("strKeywords")
    public void setStrKeywords(String strKeywords) {
        this.strKeywords = strKeywords;
    }

    @JsonProperty("strRSS")
    public String getStrRSS() {
        return strRSS;
    }

    @JsonProperty("strRSS")
    public void setStrRSS(String strRSS) {
        this.strRSS = strRSS;
    }

    @JsonProperty("strStadiumThumb")
    public String getStrStadiumThumb() {
        return strStadiumThumb;
    }

    @JsonProperty("strStadiumThumb")
    public void setStrStadiumThumb(String strStadiumThumb) {
        this.strStadiumThumb = strStadiumThumb;
    }

    @JsonProperty("strStadiumDescription")
    public String getStrStadiumDescription() {
        return strStadiumDescription;
    }

    @JsonProperty("strStadiumDescription")
    public void setStrStadiumDescription(String strStadiumDescription) {
        this.strStadiumDescription = strStadiumDescription;
    }

    @JsonProperty("strStadiumLocation")
    public String getStrStadiumLocation() {
        return strStadiumLocation;
    }

    @JsonProperty("strStadiumLocation")
    public void setStrStadiumLocation(String strStadiumLocation) {
        this.strStadiumLocation = strStadiumLocation;
    }

    @JsonProperty("intStadiumCapacity")
    public String getIntStadiumCapacity() {
        return intStadiumCapacity;
    }

    @JsonProperty("intStadiumCapacity")
    public void setIntStadiumCapacity(String intStadiumCapacity) {
        this.intStadiumCapacity = intStadiumCapacity;
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

    @JsonProperty("strInstagram")
    public String getStrInstagram() {
        return strInstagram;
    }

    @JsonProperty("strInstagram")
    public void setStrInstagram(String strInstagram) {
        this.strInstagram = strInstagram;
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
    public String getStrDescriptionDE() {
        return strDescriptionDE;
    }

    @JsonProperty("strDescriptionDE")
    public void setStrDescriptionDE(String strDescriptionDE) {
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

    @JsonProperty("strDescriptionCN")
    public Object getStrDescriptionCN() {
        return strDescriptionCN;
    }

    @JsonProperty("strDescriptionCN")
    public void setStrDescriptionCN(Object strDescriptionCN) {
        this.strDescriptionCN = strDescriptionCN;
    }

    @JsonProperty("strDescriptionIT")
    public String getStrDescriptionIT() {
        return strDescriptionIT;
    }

    @JsonProperty("strDescriptionIT")
    public void setStrDescriptionIT(String strDescriptionIT) {
        this.strDescriptionIT = strDescriptionIT;
    }

    @JsonProperty("strDescriptionJP")
    public String getStrDescriptionJP() {
        return strDescriptionJP;
    }

    @JsonProperty("strDescriptionJP")
    public void setStrDescriptionJP(String strDescriptionJP) {
        this.strDescriptionJP = strDescriptionJP;
    }

    @JsonProperty("strDescriptionRU")
    public String getStrDescriptionRU() {
        return strDescriptionRU;
    }

    @JsonProperty("strDescriptionRU")
    public void setStrDescriptionRU(String strDescriptionRU) {
        this.strDescriptionRU = strDescriptionRU;
    }

    @JsonProperty("strDescriptionES")
    public String getStrDescriptionES() {
        return strDescriptionES;
    }

    @JsonProperty("strDescriptionES")
    public void setStrDescriptionES(String strDescriptionES) {
        this.strDescriptionES = strDescriptionES;
    }

    @JsonProperty("strDescriptionPT")
    public String getStrDescriptionPT() {
        return strDescriptionPT;
    }

    @JsonProperty("strDescriptionPT")
    public void setStrDescriptionPT(String strDescriptionPT) {
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
    public String getStrDescriptionNO() {
        return strDescriptionNO;
    }

    @JsonProperty("strDescriptionNO")
    public void setStrDescriptionNO(String strDescriptionNO) {
        this.strDescriptionNO = strDescriptionNO;
    }

    @JsonProperty("strDescriptionIL")
    public Object getStrDescriptionIL() {
        return strDescriptionIL;
    }

    @JsonProperty("strDescriptionIL")
    public void setStrDescriptionIL(Object strDescriptionIL) {
        this.strDescriptionIL = strDescriptionIL;
    }

    @JsonProperty("strDescriptionPL")
    public Object getStrDescriptionPL() {
        return strDescriptionPL;
    }

    @JsonProperty("strDescriptionPL")
    public void setStrDescriptionPL(Object strDescriptionPL) {
        this.strDescriptionPL = strDescriptionPL;
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

    @JsonProperty("strTeamBadge")
    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    @JsonProperty("strTeamBadge")
    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }

    @JsonProperty("strTeamJersey")
    public String getStrTeamJersey() {
        return strTeamJersey;
    }

    @JsonProperty("strTeamJersey")
    public void setStrTeamJersey(String strTeamJersey) {
        this.strTeamJersey = strTeamJersey;
    }

    @JsonProperty("strTeamLogo")
    public String getStrTeamLogo() {
        return strTeamLogo;
    }

    @JsonProperty("strTeamLogo")
    public void setStrTeamLogo(String strTeamLogo) {
        this.strTeamLogo = strTeamLogo;
    }

    @JsonProperty("strTeamFanart1")
    public String getStrTeamFanart1() {
        return strTeamFanart1;
    }

    @JsonProperty("strTeamFanart1")
    public void setStrTeamFanart1(String strTeamFanart1) {
        this.strTeamFanart1 = strTeamFanart1;
    }

    @JsonProperty("strTeamFanart2")
    public String getStrTeamFanart2() {
        return strTeamFanart2;
    }

    @JsonProperty("strTeamFanart2")
    public void setStrTeamFanart2(String strTeamFanart2) {
        this.strTeamFanart2 = strTeamFanart2;
    }

    @JsonProperty("strTeamFanart3")
    public String getStrTeamFanart3() {
        return strTeamFanart3;
    }

    @JsonProperty("strTeamFanart3")
    public void setStrTeamFanart3(String strTeamFanart3) {
        this.strTeamFanart3 = strTeamFanart3;
    }

    @JsonProperty("strTeamFanart4")
    public String getStrTeamFanart4() {
        return strTeamFanart4;
    }

    @JsonProperty("strTeamFanart4")
    public void setStrTeamFanart4(String strTeamFanart4) {
        this.strTeamFanart4 = strTeamFanart4;
    }

    @JsonProperty("strTeamBanner")
    public String getStrTeamBanner() {
        return strTeamBanner;
    }

    @JsonProperty("strTeamBanner")
    public void setStrTeamBanner(String strTeamBanner) {
        this.strTeamBanner = strTeamBanner;
    }

    @JsonProperty("strYoutube")
    public String getStrYoutube() {
        return strYoutube;
    }

    @JsonProperty("strYoutube")
    public void setStrYoutube(String strYoutube) {
        this.strYoutube = strYoutube;
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
