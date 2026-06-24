public class SMSNotification implements Notification {
    @Override
    public void send(Recipient recipient, Message message) {
        System.out.println("Sending sms to " + recipient.getPhone()+"\n"+message.toString());
    }
}
