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

        msg.addRegistrationToken("cI5bfzOrFLQ:APA91bHwCiviB0pS3uosujcNoslo458CAbELi1P_cs5Y_rVy_l_O_qFEJjdcCB6DP1YMZsRMviMp7t2AD4gs3ShuX4PQHzzwh-esF-mJxwA6cXdcIUS6kxXKcdhgAXhMfEDdwIVK-OIX");
        //msg.addRegistrationToken("dm9T56Jd8Jk:APA91bFPQB7FZ8fVc3Yk9TQZyFNy-wypzpPWH5ipEWGVphiZV7tTMttwV7qpWWWwcmlwbHlNNejdPjKTwi-Z-OztjOQl4tZGUi-opXx3TFlLBlqb80qUJDN13D64vcD43n2IiIcIkYPV");

        List<Integer> skuIDs = new ArrayList<>();
        List<Integer> tpIDs = new ArrayList<>();
        List<String> times = new ArrayList<>();
        List<SurveyAnswer> surveyAnswerList = new ArrayList<>();

        Notification notification = new Notification();
        notification.setNotificationUniqueID(6);

        //Order status notification
        /*notification.setNotificationID(AppUtil.OrderConfirmNotification);
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
        notification.setSurveyAnswers(surveyAnswerList);
        notification.setOrderID(7768);*/


        //Survey notification
        /*SurveyAnswer surveyAnswer = new SurveyAnswer();
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

        surveyAnswer = new SurveyAnswer();
        surveyAnswer.setId(5);
        surveyAnswer.setNotificationUniqueID(notification.getNotificationUniqueID());
        surveyAnswer.setAnswer("Dove Men");
        surveyAnswer.setAnswerImagePath("https://logos-download.com/wp-content/uploads/2016/03/Unilever_logotype_emblem_logo.png");

        surveyAnswerList.add(surveyAnswer);*/


        /*notification.setNotificationID(AppUtil.SurveyNotification);
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
        notification.setSurveyAnswers(surveyAnswerList);*/


        //Daily Notifications Image Only

        /*skuIDs.add(7962);

        notification.setNotificationID(AppUtil.DailyNotificationsImageOnly);
        notification.setNotificationName("DailyNotificationsImageOnly");
        notification.setNotificationGenerationType("Auto");
        notification.setNotificationType("InApp");
        notification.setStartDate("2020-03-01T00:00:00");
        notification.setEndDate("2020-03-01T00:00:00");
        notification.setCaption("অবিশ্বাস্য ছাড়!");
        notification.setMessage("নাগরিক সংবাদে প্রকাশিত সব ধরনের লেখা, ছবি ও ভিডিও প্রথম আলোর পাঠকেরা স্বতঃস্ফূর্তভাবে নিজ উদ্যোগে পাঠিয়েছেন।");
        notification.setImagePath("http://www.1face1.com/ht/wp-content/uploads/2017/10/order-online-21-21.png");
        notification.setPageLink("productdetails");
        notification.setSkuIds(skuIDs);
        notification.setTpIds(tpIDs);
        notification.setTimes(times);
        notification.setSurveyAnswers(surveyAnswerList);*/

        //Daily Notifications without Image

        skuIDs.add(7962);

        notification.setNotificationID(AppUtil.DailyNotificationsTextOnly);
        notification.setNotificationName("DailyNotificationsTextOnly");
        notification.setNotificationGenerationType("Auto");
        notification.setNotificationType("InApp");
        notification.setStartDate("2020-03-01T00:00:00");
        notification.setEndDate("2020-03-01T00:00:00");
        notification.setCaption("অবিশ্বাস্য ছাড়!");
        notification.setMessage("নাগরিক সংবাদে প্রকাশিত সব ধরনের লেখা, ছবি ও ভিডিও প্রথম আলোর পাঠকেরা স্বতঃস্ফূর্তভাবে নিজ উদ্যোগে পাঠিয়েছেন।");
        notification.setImagePath("");
        notification.setPageLink("productdetails");
        notification.setSkuIds(skuIDs);
        notification.setTpIds(tpIDs);
        notification.setTimes(times);
        notification.setSurveyAnswers(surveyAnswerList);


        msg.putData("notification", notification);

        FcmResponse res = client.pushToEntities(msg);

        System.out.println(res);
    }
}
