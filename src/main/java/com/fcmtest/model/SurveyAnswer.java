package com.fcmtest.model;

public class SurveyAnswer {

    public int id;
    private int notificationID;
    private String answer;
    private String answerImagePath;

    private int isSelected;

    public SurveyAnswer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswerImagePath() {
        return answerImagePath;
    }

    public void setAnswerImagePath(String answerImagePath) {
        this.answerImagePath = answerImagePath;
    }

    public int getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(int isSelected) {
        this.isSelected = isSelected;
    }
}
