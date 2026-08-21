/*
Task 3: "this" & "static" — Bank Account (15 Marks)

Create a "BankAccount" class containing:

- Account Holder Name
- Account Number
- Balance

Use the "this" keyword to differentiate instance variables from constructor parameters.

Also create a "static" variable to keep track of the total number of bank accounts created.

Create at least 3 objects and display:

- Account details
- Total number of accounts

*/
class BankAccount {

    // Instance variables
    String accountHolderName;
    long accountNumber;
    double balance;

    // Static variable
    static int totalAccounts = 0;

    BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
    }

    
}

public class week3_task03  {
    public static void main(String[] args) {

        // Creating objects
        BankAccount account1 =
            new BankAccount("Divankar", 100001, 25000);

        BankAccount account2 =
            new BankAccount("Rahul", 100002, 35000);

        BankAccount account3 =
            new BankAccount("Priya", 100003, 45000);

        // Display account details
        System.out.println("Account Holder Name: " + account1.accountHolderName);
        System.out.println("Account Number: " + account1.accountNumber);
        System.out.println("Balance: " + account1.balance);

        System.out.println("Account Holder Name: " + account2.accountHolderName);
        System.out.println("Account Number: " + account2.accountNumber);
        System.out.println("Balance: " + account2.balance);

        System.out.println("Account Holder Name: " + account3.accountHolderName);
        System.out.println("Account Number: " + account3.accountNumber);
        System.out.println("Balance: " + account3.balance);

        // Display total number of accounts
        System.out.println("Total Number of Accounts: "+ BankAccount.totalAccounts);
    }
}
/*
OUTPUT:

Account Holder Name: Divankar
Account Number: 100001
Balance: 25000.0
Account Holder Name: Rahul
Account Number: 100002
Balance: 35000.0
Account Holder Name: Priya
Account Number: 100003
Balance: 45000.0
Total Number of Accounts: 3
*/

