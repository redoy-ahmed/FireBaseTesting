package com.fcmtest;

import com.fcmtest.model.*;

import java.util.ArrayList;

public class SendMessageExample {

    public static void main(String[] args) {

        FcmClient client = new FcmClient();
        //client.setAPIKey("AAAAWx5d3rk:APA91bF9kFyOfzA2_nUaO-wCiySITeNkn19CNkH87e8Bhlq167aQcTuVtBGj5uYqQhBv3pBFTVcazEiXca38SR7sGEzF-IF2d2uPgBDzU8kt-rFmlXHg0c8QRHOMB1J-Qe969TjpH-gK");
        client.setAPIKey("AAAAuWXfxsw:APA91bGV-mZclef3IDma9nedbtEeAg3SGKGdL9Jyicv9Xj0njwCfHXaH0cmFfLGETsWEs2MtXL7Fxp40yY81RXYdZEKx6Oje5Dk4kaeY0cYA2l3LC5Q5ct6tggu-YmcpjeYtqVlLSyKn");

        EntityMessage msg = new EntityMessage();

        msg.addRegistrationToken("eHmOduEUYMA:APA91bHoYTkBWUOUyvUdsEegRyIddo40gXS6nL8k1QKZ1I2rPfLTdQ8VFv6bLFnAMydX6JLHpoTwQceXPAth2BphuG0BPiVXdxvUrYLVCcrZPrSAW1Z1aNqHK4qqDDWzKMrOJ1suF8fd");

        ArrayList<OfferAvailability> offerAvailabilityList = new ArrayList<>();

        OfferAvailability offerAvailability = new OfferAvailability();
        offerAvailability.setSPID(1);
        offerAvailability.setOfferInfo("Very Delightful Offer");
        offerAvailability.setSlabNo(1);
        offerAvailability.setThreshold(10);

        offerAvailabilityList.add(offerAvailability);

        SKU sku = new SKU();
        sku.setSKUID(7524);
        sku.setSKUName("Surf Excel");
        sku.setQty(2);
        sku.setMinimumOrderQtyInfo("1");
        sku.setMinimumOrderQty(2);
        sku.setWeight(2.0);
        sku.setWeightInfo("KG");
        sku.setTradePriceInfo("Per Unit");
        sku.setTradePrice(177.5);
        sku.setUnitName("KG");
        sku.setCode("111");
        sku.setImageURL("http://www.1face1.com/ht/wp-content/uploads/2017/10/order-online-21-21.png");
        sku.setOfferAvailable(false);
        sku.setPromotionID(0);
        sku.setPromotionName("");
        sku.setItemPriceTotal(1000.0);
        sku.setDiscount(100.0);
        sku.setVat(10.0);
        sku.setSlabs(offerAvailabilityList);
        sku.setDescription("test description");
        sku.setMrpInfo("fdf");
        sku.setCustomTPInfo("Custom TP");
        sku.setCartPriceTotal(500.0);
        sku.setCartPriceDiscount(100.0);
        sku.setCartNetBill(1000.0);
        sku.setProductCount(1);

        Notification notification = new Notification(
                "inApp",
                "Order Status",
                "Your order is placed.",
                "http://www.1face1.com/ht/wp-content/uploads/2017/10/order-online-21-21.png",
                "RegistrationPage",
                sku);


        msg.putData("notification", notification);

        FcmResponse res = client.pushToEntities(msg);

        System.out.println(res);
    }
}
