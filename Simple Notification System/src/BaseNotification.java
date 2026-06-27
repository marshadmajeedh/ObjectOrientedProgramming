public abstract class BaseNotification implements Notification {
    @Override
    public void send(Recipient recipient, Message message) {

        String contactInfo = getContactInfo(recipient);
        String type = getType();

        System.out.println ("Sending via "+type+" to "+contactInfo);
        System.out.println ("===========Message===========");
        System.out.println (message);
        System.out.println ("++++++++++++++++++++++++++++++");
    }

    protected abstract String getType();
    protected abstract String getContactInfo(Recipient recipient);
}
