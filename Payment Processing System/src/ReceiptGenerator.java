import java.time.LocalDateTime;

public class ReceiptGenerator {

    public Receipt receiptGenerate(Payment payment,String paymentMethod,String transactionReferenceID) {
        String receiptID = "RCP-"+System.currentTimeMillis();

        return new Receipt(
                receiptID,
                payment.getAmount(),
                transactionReferenceID,
                payment.getCurrencyType(),
                paymentMethod,
                payment.getCustomer().getName(),
                payment.getCustomer().getEmail(),
                LocalDateTime.now(),
                "SUCCESS"
        );
    }

    public void printReceipt(Receipt receipt) {
        System.out.println("====== Payment Receipt ======");
        System.out.print(receipt);
        System.out.println("====== ===============  ======");
    }
}

