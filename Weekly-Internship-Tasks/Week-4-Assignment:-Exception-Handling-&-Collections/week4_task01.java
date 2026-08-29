/*
Task 1: Exception Handling — Safe Calculator (20 Marks)

Create a Java calculator program that accepts two numbers from the user and performs:

Addition
Subtraction
Multiplication
Division
Modulus
Requirements
Handle division by zero using ArithmeticException.
Handle invalid input using InputMismatchException.
Display meaningful error messages.
The program should not terminate unexpectedly when an error occurs.

*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class week4_task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            double result;

            switch (choice) {

                case 1:
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                    break;

                case 5:
                    result = num1 % num2;
                    System.out.println("Result = " + result);
                    break;

                default:
                    System.out.println("Invalid operation choice.");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric input.");

        } finally {
            sc.close();
            System.out.println("Calculator program completed.");
        }
    }
}
/*
Enter first number: 4
Enter second number: 0

Choose an operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Modulus
Enter your choice: 4
Error: Cannot divide by zero.
Calculator program completed.

*/