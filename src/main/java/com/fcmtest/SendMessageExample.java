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

        msg.addRegistrationToken("f5sWjxCbsTs:APA91bGt9nofS8E52XoGz8TitAv95pjRwhQMa4nz2ksWbxOuST6KzCNe1k6HD2eYfmJSOScSbXvUN49sd0vC8o2xgDm4Ri1ZpsI5lFFts2CNQmQKKl-s5RgM155NvP2aV09pTN4qbdT5");

        List<Integer> skuIDs = new ArrayList<>();
        List<Integer> tpIDs = new ArrayList<>();
        List<String> times = new ArrayList<>();
        List<SurveyAnswer> surveyAnswerList = new ArrayList<>();


        Notification notification = new Notification();

        notification.setNotificationID(1);
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

        msg.putData("notification", notification);

        FcmResponse res = client.pushToEntities(msg);

        System.out.println(res);
    }
}
