public class EmailNotification extends BaseNotification{
    @Override
    protected String getType() {
        return "E-Mail";
    }

    @Override
    protected String getContactInfo(Recipient recipient) {
        return recipient.getEmail();
    }
}
