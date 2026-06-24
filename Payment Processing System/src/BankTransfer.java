public class BankTransfer implements PaymentProcessor{
    private final ReceiptGenerator rg;
    public BankTransfer(ReceiptGenerator rg) {
        this.rg = rg;
    }
    @Override
    public void processPayment(Payment payment) {
        System.out.println("Processing Bank Transfer Payment of "+payment.getCurrencyType()+" "+payment.getAmount()+" for "+payment.getCustomer().getName());
        String transactionRefID = "TXN-"+System.currentTimeMillis();
        Receipt receipt = rg.receiptGenerate(payment,"Bank Transfer",transactionRefID);
        rg.printReceipt(receipt);
    }
}
