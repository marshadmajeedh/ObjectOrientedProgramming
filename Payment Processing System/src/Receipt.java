import java.time.LocalDateTime;

public class Receipt {
    private final String receiptId;
    private final String paymentId;
    private final double amount;
    private final String currency;
    private final String paymentMethod;
    private final String customerName;
    private final String customerEmail;
    private final LocalDateTime transactionDate;
    private final String status;

    public Receipt(String receiptId, double amount, String paymentId, String currency, String paymentMethod, String customerName, String customerEmail, LocalDateTime transactionDate, String status) {
        this.receiptId =  receiptId;
        this.amount = amount;
        this.paymentId = paymentId;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.transactionDate = transactionDate;
        this.status = status;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public String getStatus() {
        return status;
    }

    public String getCurrency() {
        return currency;
    }

    public String toString() {
        return "Receipt ID : "+getReceiptId()+"\n"+
                "Payment ID: "+getPaymentId()+"\n"+
                "Amount: "+getAmount()+"\n"+
                "Currency Type: "+getCurrency()+"\n"+
                "Payment Method: "+getPaymentMethod()+"\n"+
                "Customer Name: "+getCustomerName()+"\n"+
                "Customer Email: "+getCustomerEmail()+"\n"+
                "Transaction Date: "+getTransactionDate()+"\n"+
                "Status: "+getStatus()+"\n";
    }
}
