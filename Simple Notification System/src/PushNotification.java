public class PushNotification implements Notification{
    @Override
    public void send(Recipient recipient, Message message) {
        System.out.println("Sending push notification to "+recipient.getDeviceToken()+"\n"+message.toString());
    }
}
