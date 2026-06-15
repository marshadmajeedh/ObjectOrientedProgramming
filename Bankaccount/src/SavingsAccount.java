public class SavingsAccount extends Account {

    public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    void withdraw(double withdrawAmount) {

        if (isValidWithdraw(withdrawAmount)) {
            System.out.println("Withdrawing " + withdrawAmount + " from Savings account " + getAccountNumber());
            setBalance(getBalance() - withdrawAmount);
            System.out.println("Current balance is: " + getBalance());
        }
    }

    @Override
    void deposit(double depositAmount) {

        if (isValidDeposit(depositAmount)) {
            System.out.println("Depositing " + depositAmount + " to Savings account " + getAccountNumber());
            setBalance(getBalance() + depositAmount);
            System.out.println("Current balance is: " + getBalance());
        }
    }
}
