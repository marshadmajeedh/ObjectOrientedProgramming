public class NotificationService {
    private final Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(Recipient recipient, Message message) {
        notification.send(recipient, message);
        System.out.println("Notification sent successfully "+notification.getClass().getSimpleName());
    }
}
