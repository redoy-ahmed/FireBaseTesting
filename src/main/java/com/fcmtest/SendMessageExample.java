package com.fcmtest;

import com.fcmtest.model.*;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SendMessageExample {

    public static void main(String[] args) {

        FcmClient client = new FcmClient();
        client.setAPIKey("AAAAY3u44jc:APA91bFeLp0nm5ONIRGUZr-n-OTNTbjHA3Aj2w8UGdLgmEITulLluA-d0c04PxSSD-TdWuWcJK8HMJh0Ip2KIDPl0vosYATUZevNz4VoCOtdgyHYRQYFcffC_4CFVamzDoqTSjCF5SJ8");

        EntityMessage msg = new EntityMessage();

        //msg.addRegistrationToken("c77o0mbCREeLXqrM0GjvBq:APA91bERfKjF5wP9OieJWPpI5cXlvU3gxDcrcsay-HhMNLjK0qW0jg-MK_6a_sBR7XMrkoOlyQAFIfie2dYSbujIqPBrXl5bX10iCGOmd9-EgT_7JLr9iuoIwh4d1wco9ZDqt66dxy8d");
        msg.addRegistrationToken("cSXCzpsmQlGlAseEh7oLaK:APA91bH-Lvc6vzESfSuYKOS4J8Aljk3_DvEm2nKAMzIh7eP932IB0fhDdIR6X8znbPE8P6TjRuqHZsJVELOeEKXQ9Yx5Qw7cr7mgvQS31wZNyInE3rsSmuuE-QZV3qB30FN0doyh0a4L");

        /*List<Integer> skuIDs = new ArrayList<>();
        List<Integer> tpIDs = new ArrayList<>();
        List<String> times = new ArrayList<>();
        List<SurveyAnswer> surveyAnswerList = new ArrayList<>();

        Notification notification = new Notification();
        notification.setNotificationUniqueID(6);*/

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
        notification.setPageLink("myorderdetails");
        notification.setSkuIds(skuIDs);
        notification.setTpIds(tpIDs);
        notification.setTimes(times);
        notification.setSurveyAnswers(surveyAnswerList);
        notification.setB2bOrderID(7768);*/

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

        /*skuIDs.add(7962);

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
        notification.setSurveyAnswers(surveyAnswerList);*/

        /*//Customize Push Notification
        notification.setNotificationID(AppUtil.DailyNotificationsTextWithImage);
        notification.setNotificationName("DailyNotificationsTextWithImage");
        notification.setNotificationGenerationType("Auto");
        notification.setNotificationType("Push");
        notification.setStartDate("2020-03-01T00:00:00");
        notification.setEndDate("2020-03-01T00:00:00");
        notification.setCaption("Please Stay Home");
        notification.setMessage("You can now complete your order From Lever Bazar App without hassle.");
        notification.setImagePath("https://i0.wp.com/bioplasticsnews.com/wp-content/uploads/2019/10/unilever-commitment-plastics.png?w=1024&ssl=1");
        notification.setPageLink("");
        notification.setSkuIds(skuIDs);
        notification.setTpIds(tpIDs);
        notification.setTimes(times);
        notification.setSurveyAnswers(surveyAnswerList);
        notification.setB2bOrderID(0);


        msg.putData("notification", notification);

        FcmResponse res = client.pushToEntities(msg);

        System.out.println(res);*/

        //Customize Push Notification

        List<JSONObject> SALES = new ArrayList<>();
        List<JSONObject> MRA = new ArrayList<>();
        List<JSONObject> CLP = new ArrayList<>();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("OrderDate", "2022-02-01T00:00:00");
        jsonObject.put("sectionID", 4571);
        jsonObject.put("status", 2);
        jsonObject.put("ErrorMsg", "");

        SALES.add(jsonObject);

        NotificationOnlineSales notificationOnlineSales = new NotificationOnlineSales();
        notificationOnlineSales.setCaption("Sales Status Notification");
        notificationOnlineSales.setMessage("Sales of 02 Feb 2022 is in pending state");

        notificationOnlineSales.setSALES(SALES);
        notificationOnlineSales.setMRA(MRA);
        notificationOnlineSales.setCLP(CLP);

        msg.putData("notification", notificationOnlineSales);

        FcmResponse res = client.pushToEntities(msg);

        System.out.println(res);
    }
}
