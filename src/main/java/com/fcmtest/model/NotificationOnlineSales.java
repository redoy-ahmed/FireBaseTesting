package com.fcmtest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONObject;

import java.util.List;

public class NotificationOnlineSales {

    private String Caption;
    private String Message;
    private List<JSONObject> SALES;
    private List<JSONObject> MRA;
    private List<JSONObject> CLP;

    public NotificationOnlineSales() {
    }

    public NotificationOnlineSales(String caption, String message, List<JSONObject> SALES, List<JSONObject> MRA, List<JSONObject> CLP) {
        Caption = caption;
        Message = message;
        this.SALES = SALES;
        this.MRA = MRA;
        this.CLP = CLP;
    }

    public String getCaption() {
        return Caption;
    }

    @JsonProperty("Caption")
    public void setCaption(String caption) {
        Caption = caption;
    }

    public String getMessage() {
        return Message;
    }

    @JsonProperty("Message")
    public void setMessage(String message) {
        Message = message;
    }

    public List<JSONObject> getSALES() {
        return SALES;
    }

    @JsonProperty("SALES")
    public void setSALES(List<JSONObject> SALES) {
        this.SALES = SALES;
    }

    public List<JSONObject> getMRA() {
        return MRA;
    }

    @JsonProperty("MRA")
    public void setMRA(List<JSONObject> MRA) {
        this.MRA = MRA;
    }

    public List<JSONObject> getCLP() {
        return CLP;
    }

    @JsonProperty("CLP")
    public void setCLP(List<JSONObject> CLP) {
        this.CLP = CLP;
    }
}
