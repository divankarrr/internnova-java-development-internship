/*
Task 2: Interface — Payment System (20 Marks)

Create an interface named Payment with methods such as:

pay()
showPaymentDetails()

Create at least two classes that implement the interface, for example:

UPIPayment
CardPayment

Implement the methods differently in both classes.

Create objects of both classes and demonstrate their functionality.

Requirements
Create an interface.
Use the implements keyword.
Implement all required interface methods.
Demonstrate how different classes can implement the same interface.

*/


// 1. Defining the Interface
interface Payment {
    void pay(double amount);
    void showPaymentDetails();
}

// 2. Class implementing via UPI
class UPIPayment implements Payment {
    private String upiId;
    private double lastTransactionAmount;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        this.lastTransactionAmount = amount;
        System.out.println("Processing UPI payment of $" + amount + " via ID: " + upiId);
        System.out.println("UPI Payment Successful!");
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("[UPI Receipt] Paid: $" + lastTransactionAmount + " | Account: " + upiId);
    }
}

// 3. Class implementing via Card
class CardPayment implements Payment {
    private String cardNumber;
    private double lastTransactionAmount;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        this.lastTransactionAmount = amount;
        // Obfuscating card number for security presentation
        String maskedCard = "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Authorizing Card payment of $" + amount + " on card: " + maskedCard);
        System.out.println("Card Payment Authorized cleanly!");
    }

    @Override
    public void showPaymentDetails() {
        String maskedCard = "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("[Card Receipt] Charged: $" + lastTransactionAmount + " | Card: " + maskedCard);
    }
}

// 4. Execution Class
public class PaymentSystem {
    public static void main(String[] args) {
        System.out.println("--- Executing Payment Interface Demo --- \n");

        // Polimorphic initialization using Interface references
        Payment upi = new UPIPayment("user@okaxis");
        upi.pay(250.75);
        upi.showPaymentDetails();

        System.out.println();

        Payment card = new CardPayment("1234567890123456");
        card.pay(1200.00);
        card.showPaymentDetails();
    }
}
/*
An Interface in Java is a blueprint of a class that contains abstract methods (methods without a body).
 It establishes a strict contract for what a class must do, without stating how it should do it. 
 Classes achieve this using the implements keyword. Interfaces allow Java to achieve polymorphism and decouple software layers, 
making it easy to swap mechanisms (like switching from UPI to Card processing) cleanly.
*/