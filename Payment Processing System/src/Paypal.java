public class Paypal implements PaymentProcessor{

    private final ReceiptGenerator rg;
    public Paypal(ReceiptGenerator rg) {
        this.rg = rg;
    }
    @Override
    public void processPayment(Payment payment) {
        System.out.println("Processing Pay-Pal Payment of "+payment.getCurrencyType()+" "+payment.getAmount()+" for "+payment.getCustomer().getName());
        String transactionRefID = "TXN-"+System.currentTimeMillis();
        Receipt receipt =  rg.receiptGenerate(payment,"Pay-Pal",transactionRefID);
        rg.printReceipt(receipt);
    }
}
