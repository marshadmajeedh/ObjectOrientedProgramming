public class SMSNotification extends BaseNotification {
    @Override
    protected String getContactInfo(Recipient recipient) {
        return recipient.getPhone();
    }

    @Override
    protected String getType() {
        return "SMS";
    }
}
