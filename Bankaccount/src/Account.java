public abstract class Account {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public Account(String accountHolderName, String accountNumber, double balance) {
        setAccountHolderName(accountHolderName);
        setBalance(balance);
        setAccountNumber(accountNumber);
    }

    public void setAccountHolderName(String accountHolderName) {

        if (!accountHolderName.isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Account holder name cannot be empty");
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (!accountNumber.isEmpty()) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Account number cannot be empty");
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected boolean isValidWithdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return false;
        } else if (amount > getBalance()) {
            System.out.println ("Insufficient funds your current balance is: " +getBalance());
            return false;
        }
        return true;
    }

    protected boolean isValidDeposit(double amount) {
        if  (amount < 0) {
            System.out.println("Amount cannot be negative");
            return false;
        }
        return true;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
