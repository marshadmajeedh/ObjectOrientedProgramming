import java.util.Scanner;

public class BankManagementApp {
    Scanner input = new Scanner(System.in);
    Account myAccount;

    public void ATM(){

        System.out.print ("Choose account type to create : 1 for savings account, 2 for current account :");
        int choice1 = input.nextInt();
        System.out.println();

        System.out.println("Enter account holder name :");
        String accountHolderName = input.next();

        System.out.println("Enter account number :");
        String accountNumber = input.next();

        System.out.println("Enter balance :");
        double balance = input.nextDouble();

       if (choice1 == 1) {
           myAccount = new SavingsAccount(accountHolderName, accountNumber, balance);

       } else if (choice1 == 2) {
           myAccount = new CurrentAccount(accountHolderName, accountNumber, balance);
       } else {
           System.out.println("Wrong choice");
           return;
       }

        System.out.print("Choose action : 1 for deposit, 2 for withdraw :");
        int choice2 = input.nextInt();
        System.out.println();

        if (choice2 == 2) {
            System.out.print("Enter amount to withdraw : ");
            double withdraw = input.nextDouble();

            myAccount.withdraw(withdraw);
        } else if (choice2 == 1) {
            System.out.print("Enter amount to deposit : ");
            double deposit = input.nextDouble();

            myAccount.deposit(deposit);
        } else {
            System.out.println("Wrong choice");
        }

    }
}
