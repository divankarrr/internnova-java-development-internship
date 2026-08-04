/*Task 5: Type Casting (15 Marks)

Create a Java program demonstrating:
Implicit Type Casting
Explicit Type Casting
Display the values before and after type casting.
Also write a short explanation (4–5 lines) describing the difference between implicit and explicit type casting.
 */
public class week1task5 {
    public static void main(String[] args) {
        // 1. IMPLICIT TYPE CASTING (Widening Conversion)
        // Automatically converts a smaller primitive type to a larger primitive type
        int originalInt = 45;
        double implicitDouble = originalInt; // Automatic casting from int to double
        System.out.println("Original integer value: " + originalInt);
        System.out.println("Casted double value: " + implicitDouble);

        // 2. EXPLICIT TYPE CASTING (Narrowing Conversion)
        // Manually converts a larger primitive type to a smaller primitive type
        double originalDouble = 89.75;
        int explicitInt = (int) originalDouble; // Manual casting using (int) operator
        System.out.println("Original double value: " + originalDouble);
        System.out.println("Casted integer valu: " + explicitInt);
        
    }
}

