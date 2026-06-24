public class CreditCard implements PaymentProcessor {

    private final ReceiptGenerator rg;
    public CreditCard(ReceiptGenerator rg) {
        this.rg = rg;
    }
    @Override
    public void processPayment(Payment payment) {
        System.out.println("Processing Credit Card Payment of "+payment.getCurrencyType()+" "+payment.getAmount()+" for "+payment.getCustomer().getName());
        String transactionRefID = "TXN-"+System.currentTimeMillis();
        Receipt receipt = rg.receiptGenerate(payment,"Credit Card",transactionRefID);
        rg.printReceipt(receipt);
    }
}
