package com.fcmtest.model;

public class SurveyAnswer {

    public int id;
    private int notificationID;
    private String answer;
    private String answerImagePath;

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
}
