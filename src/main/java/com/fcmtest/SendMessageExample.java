package com.fcmtest;

import com.fcmtest.model.*;
import com.fcmtest.util.AppUtil;

import java.util.ArrayList;
import java.util.List;

public class SendMessageExample {

    public static void main(String[] args) {

        FcmClient client = new FcmClient();
        client.setAPIKey("AAAAuWXfxsw:APA91bGV-mZclef3IDma9nedbtEeAg3SGKGdL9Jyicv9Xj0njwCfHXaH0cmFfLGETsWEs2MtXL7Fxp40yY81RXYdZEKx6Oje5Dk4kaeY0cYA2l3LC5Q5ct6tggu-YmcpjeYtqVlLSyKn");

        EntityMessage msg = new EntityMessage();

        msg.addRegistrationToken("e6_9Wdj3_9k:APA91bGsmT3at-_UklvEocm0yUU9hnsa3BvRopovi2jTEtAmhp7DtcbLnLB21j-xJ6mggIuNJKd2xnjSsonYiIMU_jwt0vM9lQk9i2P025NWhT87WAjwHw_T2PUSg2hpgOHWB5KaifGn");

        List<Integer> skuIDs = new ArrayList<>();
        List<Integer> tpIDs = new ArrayList<>();
        List<String> times = new ArrayList<>();
        List<SurveyAnswer> surveyAnswerList = new ArrayList<>();

        Notification notification = new Notification();
        notification.setNotificationUniqueID(1);

       /*//Order status notification
        notification.setNotificationID(AppUtil.OrderConfirmNotification);
        notification.setNotificationName("OrderConfirmNotification");
        notification.setNotificationGenerationType("Auto");
        notification.setNotificationType("Push");
        notification.setStartDate("2020-03-01T00:00:00");
        notification.setEndDate("2020-03-01T00:00:00");
        notification.setCaption("Customer Order Confirmation");
        notification.setMessage("Order confirmed with order no D03-200309-0001 and order value 1185.25.");
        notification.setImagePath("http://www.1face1.com/ht/wp-content/uploads/2017/10/order-online-21-21.png");
        notification.setPageLink("1");
        notification.setSkuIds(skuIDs);
        notification.setTpIds(tpIDs);
        notification.setTimes(times);
        notification.setSurveyAnswers(surveyAnswerList);*/


        //Survey notification
        SurveyAnswer surveyAnswer = new SurveyAnswer();
        surveyAnswer.setId(1);
        surveyAnswer.setNotificationUniqueID(notification.getNotificationUniqueID());
        surveyAnswer.setAnswer("Clear Men");
        surveyAnswer.setAnswerImagePath("https://logos-download.com/wp-content/uploads/2016/03/Unilever_logotype_emblem_logo.png");

        surveyAnswerList.add(surveyAnswer);

        surveyAnswer = new SurveyAnswer();
        surveyAnswer.setId(2);
        surveyAnswer.setNotificationUniqueID(notification.getNotificationUniqueID());
        surveyAnswer.setAnswer("Clear Hairfall");
        surveyAnswer.setAnswerImagePath("https://logos-download.com/wp-content/uploads/2016/03/Unilever_logotype_emblem_logo.png");

        surveyAnswerList.add(surveyAnswer);

        surveyAnswer = new SurveyAnswer();
        surveyAnswer.setId(3);
        surveyAnswer.setNotificationUniqueID(notification.getNotificationUniqueID());
        surveyAnswer.setAnswer("Sunsilk Hairfall");
        surveyAnswer.setAnswerImagePath("https://logos-download.com/wp-content/uploads/2016/03/Unilever_logotype_emblem_logo.png");

        surveyAnswerList.add(surveyAnswer);

        surveyAnswer = new SurveyAnswer();
        surveyAnswer.setId(4);
        surveyAnswer.setNotificationUniqueID(notification.getNotificationUniqueID());
        surveyAnswer.setAnswer("Sunsilk");
        surveyAnswer.setAnswerImagePath("https://logos-download.com/wp-content/uploads/2016/03/Unilever_logotype_emblem_logo.png");

        surveyAnswerList.add(surveyAnswer);


        notification.setNotificationID(AppUtil.SurveyNotification);
        notification.setNotificationName("SurveyNotification");
        notification.setNotificationGenerationType("Auto");
        notification.setNotificationType("InApp");
        notification.setStartDate("2020-03-01T00:00:00");
        notification.setEndDate("2020-03-01T00:00:00");
        notification.setCaption("Choose the best One");
        notification.setMessage("Which shampoo do you use daily?");
        notification.setImagePath("http://www.1face1.com/ht/wp-content/uploads/2017/10/order-online-21-21.png");
        notification.setPageLink("2");
        notification.setSkuIds(skuIDs);
        notification.setTpIds(tpIDs);
        notification.setTimes(times);
        notification.setSurveyAnswers(surveyAnswerList);

        msg.putData("notification", notification);

        FcmResponse res = client.pushToEntities(msg);

        System.out.println(res);
    }
}
