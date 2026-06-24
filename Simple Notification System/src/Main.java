public class Main {
    public static void main(String[] args) {

        Recipient recipient = new Recipient("Marshadahamedh@gmail.com","0766758834","#@$");
        Message message = new Message("Greet","Good morning");

        Notification[] notifications = {
                new EmailNotification(),
                new SMSNotification(),
                new PushNotification()
        };

        NotificationService ns1 = new NotificationService(notifications[0]);
        NotificationService ns2 = new NotificationService(notifications[1]);
        NotificationService ns3 = new NotificationService(notifications[2]);

        ns1.sendNotification(recipient,message);
        System.out.println();
        ns2.sendNotification(recipient,message);
        System.out.println();
        ns3.sendNotification(recipient,message);
        System.out.println();
    }
}