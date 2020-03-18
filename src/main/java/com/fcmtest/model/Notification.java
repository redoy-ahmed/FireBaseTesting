package com.fcmtest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

public class Notification {

    private int NotificationID;
    private String NotificationName;
    private String NotificationGenerationType;
    private String NotificationType;
    private String StartDate;
    private String EndDate;
    private String Caption;
    private String Message;
    private String ImagePath;
    private String PageLink;
    private List<Integer> SkuIds;
    private List<Integer> TpIds;
    private List<String> Times;
    private List<SurveyAnswer> SurveyAnswers;

    public Notification() {
    }

    public Notification(int NotificationID, String NotificationName, String NotificationGenerationType, String NotificationType, String StartDate, String EndDate, String Caption, String Message, String ImagePath, String PageLink, List<Integer> SkuIds, List<Integer> TpIds, List<String> Times, List<SurveyAnswer> SurveyAnswers) {
        this.NotificationID = NotificationID;
        this.NotificationName = NotificationName;
        this.NotificationGenerationType = NotificationGenerationType;
        this.NotificationType = NotificationType;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.Caption = Caption;
        this.Message = Message;
        this.ImagePath = ImagePath;
        this.PageLink = PageLink;
        this.SkuIds = SkuIds;
        this.TpIds = TpIds;
        this.Times = Times;
        this.SurveyAnswers = SurveyAnswers;
    }

    public int getNotificationID() {
        return NotificationID;
    }

    @JsonProperty("NotificationID")
    public void setNotificationID(int NotificationID) {
        this.NotificationID = NotificationID;
    }

    public String getNotificationName() {
        return NotificationName;
    }

    @JsonProperty("NotificationName")
    public void setNotificationName(String NotificationName) {
        this.NotificationName = NotificationName;
    }

    public String getNotificationGenerationType() {
        return NotificationGenerationType;
    }

    @JsonProperty("NotificationGenerationType")
    public void setNotificationGenerationType(String NotificationGenerationType) {
        this.NotificationGenerationType = NotificationGenerationType;
    }

    public String getNotificationType() {
        return NotificationType;
    }

    @JsonProperty("NotificationType")
    public void setNotificationType(String NotificationType) {
        this.NotificationType = NotificationType;
    }

    public String getStartDate() {
        return StartDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public String getCaption() {
        return Caption;
    }

    @JsonProperty("Caption")
    public void setCaption(String Caption) {
        this.Caption = Caption;
    }

    public String getMessage() {
        return Message;
    }

    @JsonProperty("Message")
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getImagePath() {
        return ImagePath;
    }

    @JsonProperty("ImagePath")
    public void setImagePath(String ImagePath) {
        this.ImagePath = ImagePath;
    }

    public String getPageLink() {
        return PageLink;
    }

    @JsonProperty("PageLink")
    public void setPageLink(String PageLink) {
        this.PageLink = PageLink;
    }

    public List<Integer> getSkuIds() {
        return SkuIds;
    }

    @JsonProperty("SkuIds")
    public void setSkuIds(List<Integer> SkuIds) {
        this.SkuIds = SkuIds;
    }

    public List<Integer> getTpIds() {
        return TpIds;
    }

    @JsonProperty("TpIds")
    public void setTpIds(List<Integer> TpIds) {
        this.TpIds = TpIds;
    }

    public List<String> getTimes() {
        return Times;
    }

    @JsonProperty("Times")
    public void setTimes(List<String> Times) {
        this.Times = Times;
    }

    public List<SurveyAnswer> getSurveyAnswers() {
        return SurveyAnswers;
    }

    @JsonProperty("SurveyAnswerList")
    public void setSurveyAnswers(List<SurveyAnswer> SurveyAnswers) {
        this.SurveyAnswers = SurveyAnswers;
    }
}
