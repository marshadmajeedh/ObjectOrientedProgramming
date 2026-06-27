public class PushNotification extends BaseNotification{
    @Override
    protected String getType() {
        return "Push Notification";
    }

    @Override
    protected String getContactInfo(Recipient recipient) {
        return recipient.getDeviceToken();
    }
}
