package com.fcmtest.model;

public class SurveyAnswer {

    public int id;
    private int notificationUniqueID;
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

    public int getNotificationUniqueID() {
        return notificationUniqueID;
    }

    public void setNotificationUniqueID(int notificationUniqueID) {
        this.notificationUniqueID = notificationUniqueID;
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
