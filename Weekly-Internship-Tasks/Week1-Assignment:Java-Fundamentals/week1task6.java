/*Task 6: Java Fundamentals Practice (15 Marks)

Create a Java program that:
- Accepts an integer, float, and double value from the user.
- Displays each value.
- Performs both implicit and explicit type casting wherever applicable.
- Prints the values before and after type casting. */

import java.util.Scanner;

public class week1task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer value: ");
        int userInt = sc.nextInt();
        System.out.print("Enter a Float value: ");
        float userFloat = sc.nextFloat();
        System.out.print("Enter a Double value: ");
        double userDouble = sc.nextDouble();
        System.out.println("Integer value : " + userInt);
        System.out.println("Float value   : " + userFloat);
        System.out.println("Double value  : " + userDouble);
        // Converting smaller types (int and float) up into a double
        double implicitFromInt = userInt;
        double implicitFromFloat = userFloat;

        System.out.println("Int to Double   -> Before: " + userInt + " | After: " + implicitFromInt);
        System.out.println("Float to Double -> Before: " + userFloat + " | After: " + implicitFromFloat);
        // Converting larger types (double and float) down into an int
        int explicitFromDouble = (int) userDouble;
        int explicitFromFloat = (int) userFloat;

        System.out.println("Double to Int   -> Before: " + userDouble + " | After: " + explicitFromDouble + " (Decimals lost!)");
        System.out.println("Float to Int    -> Before: " + userFloat + " | After: " + explicitFromFloat + " (Decimals lost!)");

        sc.close();
    }
}

