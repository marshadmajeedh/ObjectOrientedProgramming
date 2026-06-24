public class EmailNotification implements Notification {
    @Override
    public void send(Recipient recipient, Message message) {
        System.out.println("Sending email to " + recipient.getEmail()+"\n"+message.toString());
    }
}
