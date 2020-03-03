package com.fcmtest.model;

import java.util.ArrayList;

public class SKU {

    private int SKUID;
    private String SKUName;
    private int Qty;
    private String minimumOrderQtyInfo;
    private Integer minimumOrderQty;
    private Double weight;
    private String weightInfo;
    private String tradePriceInfo;
    private Double tradePrice;
    private String unitName;
    private String code;
    private String imageURL;
    private Boolean isOfferAvailable;
    private int promotionID;
    private String promotionName;
    private Double itemPriceTotal;
    private Double discount;
    private Double vat;
    private ArrayList<OfferAvailability> Slabs;
    private String Description;
    private String MrpInfo;
    private String CustomTPInfo;
    private Double cartPriceTotal;
    private Double cartPriceDiscount;
    private Double cartNetBill;
    private int productCount;

    public SKU() {
    }

    public SKU(int SKUID, String SKUName, int qty, String minimumOrderQtyInfo, Integer minimumOrderQty, Double weight, String weightInfo, String tradePriceInfo, Double tradePrice, String unitName, String code, String imageURL, Boolean isOfferAvailable, int promotionID, String promotionName, Double itemPriceTotal, Double discount, Double vat, ArrayList<OfferAvailability> slabs, String description, String mrpInfo, String customTPInfo, Double cartPriceTotal, Double cartPriceDiscount, Double cartNetBill, int productCount) {
        this.SKUID = SKUID;
        this.SKUName = SKUName;
        Qty = qty;
        this.minimumOrderQtyInfo = minimumOrderQtyInfo;
        this.minimumOrderQty = minimumOrderQty;
        this.weight = weight;
        this.weightInfo = weightInfo;
        this.tradePriceInfo = tradePriceInfo;
        this.tradePrice = tradePrice;
        this.unitName = unitName;
        this.code = code;
        this.imageURL = imageURL;
        this.isOfferAvailable = isOfferAvailable;
        this.promotionID = promotionID;
        this.promotionName = promotionName;
        this.itemPriceTotal = itemPriceTotal;
        this.discount = discount;
        this.vat = vat;
        Slabs = slabs;
        Description = description;
        MrpInfo = mrpInfo;
        CustomTPInfo = customTPInfo;
        this.cartPriceTotal = cartPriceTotal;
        this.cartPriceDiscount = cartPriceDiscount;
        this.cartNetBill = cartNetBill;
        this.productCount = productCount;
    }

    public int getSKUID() {
        return SKUID;
    }

    public void setSKUID(int SKUID) {
        this.SKUID = SKUID;
    }

    public String getSKUName() {
        return SKUName;
    }

    public void setSKUName(String SKUName) {
        this.SKUName = SKUName;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public String getMinimumOrderQtyInfo() {
        return minimumOrderQtyInfo;
    }

    public void setMinimumOrderQtyInfo(String minimumOrderQtyInfo) {
        this.minimumOrderQtyInfo = minimumOrderQtyInfo;
    }

    public Integer getMinimumOrderQty() {
        return minimumOrderQty;
    }

    public void setMinimumOrderQty(Integer minimumOrderQty) {
        this.minimumOrderQty = minimumOrderQty;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getWeightInfo() {
        return weightInfo;
    }

    public void setWeightInfo(String weightInfo) {
        this.weightInfo = weightInfo;
    }

    public String getTradePriceInfo() {
        return tradePriceInfo;
    }

    public void setTradePriceInfo(String tradePriceInfo) {
        this.tradePriceInfo = tradePriceInfo;
    }

    public Double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Boolean getOfferAvailable() {
        return isOfferAvailable;
    }

    public void setOfferAvailable(Boolean offerAvailable) {
        isOfferAvailable = offerAvailable;
    }

    public int getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(int promotionID) {
        this.promotionID = promotionID;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Double getItemPriceTotal() {
        return itemPriceTotal;
    }

    public void setItemPriceTotal(Double itemPriceTotal) {
        this.itemPriceTotal = itemPriceTotal;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public ArrayList<OfferAvailability> getSlabs() {
        return Slabs;
    }

    public void setSlabs(ArrayList<OfferAvailability> slabs) {
        Slabs = slabs;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMrpInfo() {
        return MrpInfo;
    }

    public void setMrpInfo(String mrpInfo) {
        MrpInfo = mrpInfo;
    }

    public String getCustomTPInfo() {
        return CustomTPInfo;
    }

    public void setCustomTPInfo(String customTPInfo) {
        CustomTPInfo = customTPInfo;
    }

    public Double getCartPriceTotal() {
        return cartPriceTotal;
    }

    public void setCartPriceTotal(Double cartPriceTotal) {
        this.cartPriceTotal = cartPriceTotal;
    }

    public Double getCartPriceDiscount() {
        return cartPriceDiscount;
    }

    public void setCartPriceDiscount(Double cartPriceDiscount) {
        this.cartPriceDiscount = cartPriceDiscount;
    }

    public Double getCartNetBill() {
        return cartNetBill;
    }

    public void setCartNetBill(Double cartNetBill) {
        this.cartNetBill = cartNetBill;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}