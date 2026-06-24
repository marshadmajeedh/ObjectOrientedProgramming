public class Payment {
    private final double amount;
    private final String currencyType;
    private final Customer customer;

    public Payment(double amount, String currencyType, Customer customer) {
        this.amount = amount;
        this.currencyType = currencyType;
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String toString() {
        return "Amount : "+getAmount()+"\nCurrency Type : "+getCurrencyType()+"\nCustomer : "+getCustomer();
    }
}
