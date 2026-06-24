public class Main {
    public static void main(String[] args) {
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        PaymentProcessor[] pp = {
                new CreditCard(receiptGenerator),
                new BankTransfer(receiptGenerator),
                new Paypal(receiptGenerator)
        };

        PaymentService ps1 = new PaymentService(pp[0]);
        PaymentService ps2 = new PaymentService(pp[1]);
        PaymentService ps3 = new PaymentService(pp[2]);

        Customer customer1 = new Customer("Marshad","a@gmail.com","012");
        Customer customer2 = new Customer("Rimlan","b@gmail.com","013");
        Customer customer3 = new Customer("Nasry","d@gmail.com","014");

        Payment payment1 = new Payment(100,"USD",customer1);
        Payment payment2 = new Payment(200,"INR",customer2);
        Payment payment3 = new Payment(300,"LKR",customer3);

        System.out.println("====== Payment 1 ======");
        ps1.processPayment(payment1);
        System.out.println();
        System.out.println("====== Payment 2 ======");
        ps2.processPayment(payment2);
        System.out.println();
        System.out.println("====== Payment 3 ======");
        ps3.processPayment(payment3);
    }
}