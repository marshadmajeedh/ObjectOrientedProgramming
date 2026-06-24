public class PaymentService {
    private final PaymentProcessor paymentProcessor;
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    public void processPayment(Payment payment) {
        paymentProcessor.processPayment(payment);
    }

}
