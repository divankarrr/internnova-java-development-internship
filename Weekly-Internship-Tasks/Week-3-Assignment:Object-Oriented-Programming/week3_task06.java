/*
Task 6: Encapsulation & Abstraction — Banking System (15 Marks)

Create a simple banking system demonstrating encapsulation and abstraction.

Encapsulation

Create a "BankAccount" class with private variables:

- Account Number
- Account Holder Name
- Balance

Use appropriate getter and setter methods to access and modify the data.

Abstraction

Create an abstract class named "Account" containing:

- At least one abstract method
- At least one normal method

Create a child class that extends the abstract class and implements the abstract method.

Display the account details and demonstrate the implemented functionality.
*/


// Encapsulation
class BankAccount {

    // Private variables
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}


// Abstraction
abstract class Account {

    // Abstract method
    abstract void calculateInterest();

    // Normal method
    void showBankName() {
        System.out.println("Bank Name: ABC Bank");
    }
}


// Child class implementing abstract method
class SavingsAccount extends Account {

    private double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest at 5%: " + interest);
    }
}


public class week3_task06 {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100001,"Divankar",50000);

        // Accessing data using getters
        System.out.println("Account Number: "+ account.getAccountNumber());

        System.out.println("Account Holder: "+ account.getAccountHolderName());

        System.out.println("Balance: "+ account.getBalance());

        // Modifying data using setter
        account.setBalance(60000);

        System.out.println("Updated Balance: "+ account.getBalance());

        SavingsAccount savings =new SavingsAccount(60000);

        // Normal method of abstract class
        savings.showBankName();

        // Implemented abstract method
        savings.calculateInterest();
    }
}

/*

OUTPUT
Account Number: 100001
Account Holder: Divankar
Balance: 50000.0
Updated Balance: 60000.0
Bank Name: ABC Bank
Interest at 5%: 3000.0
*/