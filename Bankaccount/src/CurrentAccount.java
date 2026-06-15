public class CurrentAccount extends Account {

    public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    void withdraw(double withdrawAmount) {

        if(isValidWithdraw(withdrawAmount)) {
            System.out.printf("Withdrawing $%.2f from your Current account%n", withdrawAmount);
            setBalance(getBalance() - withdrawAmount);
            System.out.println("Current balance :" + getBalance());
        }
    }

    @Override
    void deposit(double depositAmount) {

        if(isValidDeposit(depositAmount)) {
            System.out.printf("Depositing $%.2f to Current account%n", depositAmount);
            setBalance(getBalance() + depositAmount);
            System.out.println("Current balance :" + getBalance());
        }
    }
}
