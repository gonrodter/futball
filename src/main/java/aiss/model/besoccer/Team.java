
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
    "id_comp",
    "nameShow",
    "translate",
    "group_code",
    "favorite",
    "basealias",
    "fullName",
    "short_name",
    "alerts",
    "shield",
    "shield_big"
})
public class Team {

    @JsonProperty("id")
    private String id;
    @JsonProperty("id_comp")
    private String idComp;
    @JsonProperty("nameShow")
    private String nameShow;
    @JsonProperty("translate")
    private String translate;
    @JsonProperty("group_code")
    private String groupCode;
    @JsonProperty("favorite")
    private String favorite;
    @JsonProperty("basealias")
    private String basealias;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("alerts")
    private String alerts;
    @JsonProperty("shield")
    private String shield;
    @JsonProperty("shield_big")
    private String shieldBig;
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

    @JsonProperty("id_comp")
    public String getIdComp() {
        return idComp;
    }

    @JsonProperty("id_comp")
    public void setIdComp(String idComp) {
        this.idComp = idComp;
    }

    @JsonProperty("nameShow")
    public String getNameShow() {
        return nameShow;
    }

    @JsonProperty("nameShow")
    public void setNameShow(String nameShow) {
        this.nameShow = nameShow;
    }

    @JsonProperty("translate")
    public String getTranslate() {
        return translate;
    }

    @JsonProperty("translate")
    public void setTranslate(String translate) {
        this.translate = translate;
    }

    @JsonProperty("group_code")
    public String getGroupCode() {
        return groupCode;
    }

    @JsonProperty("group_code")
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    @JsonProperty("favorite")
    public String getFavorite() {
        return favorite;
    }

    @JsonProperty("favorite")
    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    @JsonProperty("basealias")
    public String getBasealias() {
        return basealias;
    }

    @JsonProperty("basealias")
    public void setBasealias(String basealias) {
        this.basealias = basealias;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("alerts")
    public String getAlerts() {
        return alerts;
    }

    @JsonProperty("alerts")
    public void setAlerts(String alerts) {
        this.alerts = alerts;
    }

    @JsonProperty("shield")
    public String getShield() {
        return shield;
    }

    @JsonProperty("shield")
    public void setShield(String shield) {
        this.shield = shield;
    }

    @JsonProperty("shield_big")
    public String getShieldBig() {
        return shieldBig;
    }

    @JsonProperty("shield_big")
    public void setShieldBig(String shieldBig) {
        this.shieldBig = shieldBig;
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
