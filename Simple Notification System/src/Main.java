public class Main {
    public static void main(String[] args) {

        Notification[] notification = {
                new PushNotification(),
                new SMSNotification(),
                new  EmailNotification()
        };

        Message message1 = new Message("Greet", "Good Morning");
        Message message2 = new Message("Greet", "Good Afternoon");
        Message message3 = new Message("Greet", "Good Evening");


        NotificationService ns1 = new NotificationService(notification[0]);
        NotificationService ns2 = new NotificationService(notification[1]);
        NotificationService ns3 = new NotificationService(notification[2]);

        Recipient r1 = new Recipient("Marshadahamedh@gmial.com","076","123");
        Recipient r2 = new Recipient("Marshadahamedh@gmial.com","076","123");
        Recipient r3 = new Recipient("Marshadahamedh@gmial.com","076","123");

        ns1.sendNotification(r1,message1);
        System.out.println();
        ns2.sendNotification(r2,message2);
        System.out.println();
        ns3.sendNotification(r3,message3);
    }
}