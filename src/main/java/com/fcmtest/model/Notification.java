package com.fcmtest.model;

public class Notification {

    private String notificationType;
    private String caption;
    private String message;
    private String imageURL;
    private String pageLink;
    private SKU sku;

    public Notification() {
    }

    public Notification(String notificationType, String caption, String message, String imageURL, String pageLink, SKU sku) {
        this.notificationType = notificationType;
        this.caption = caption;
        this.message = message;
        this.imageURL = imageURL;
        this.pageLink = pageLink;
        this.sku = sku;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getPageLink() {
        return pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }
}
