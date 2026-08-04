/*Task 4: Operators Practice (20 Marks)

Create a calculator program that performs the following operations using two numbers entered by the user:

Addition
Subtraction
Multiplication
Division
Modulus */
import java.util.Scanner;
public class week1task4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Addition "+(num1+num2));
        System.out.println("Subtraction "+(num1-num2));
        System.out.println("Multiplication "+(num1*num2));
        System.out.println("Division "+(num1/num2));
        System.out.println("Modulus "+(num1%num2));
        



    }
}
