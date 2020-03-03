package com.fcmtest.model;

public class OfferAvailability {

    private String offerInfo;
    private Integer sPID;
    private Integer slabNo;
    private int threshold;

    public String getOfferInfo() {
        return offerInfo;
    }

    public void setOfferInfo(String offerInfo) {
        this.offerInfo = offerInfo;
    }

    public Integer getSPID() {
        return sPID;
    }

    public void setSPID(Integer sPID) {
        this.sPID = sPID;
    }

    public Integer getSlabNo() {
        return slabNo;
    }

    public void setSlabNo(Integer slabNo) {
        this.slabNo = slabNo;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}
