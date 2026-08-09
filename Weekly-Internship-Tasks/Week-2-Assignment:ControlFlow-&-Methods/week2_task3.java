/*
Task 3: Methods — Calculator (20 Marks)

Create a calculator program using separate methods for:

Addition
Subtraction
Multiplication
Division
Modulus

Take two numbers as input from the user and call the appropriate methods to perform the operations

*/
import java.util.Scanner;
public class week2_task3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("Enter the operations: ");
        char ch=sc.next().charAt(0);
        if(ch=='+'){
            sum(a,b);
        }else if(ch=='-'){
            subtract(a, b);
        }else if(ch=='*'){
            multiply(a, b);
        }else if(ch=='%'){
            modulus(a, b);
        }else if(ch=='/'){
            division(a, b);
        }else{
            System.out.println("invalid");
        }
        sc.close();


    }
    public static void sum(int a,int b){
        System.out.println("Sum: "+(a+b));
    }
    public static void multiply(int a,int b){
        System.out.println("Multiplication "+(a*b));
    }
    public static void subtract(int a,int b){
        System.out.println("Subtraction: "+(a-b));
    }
    public static void division(int a,int b){
        System.out.println("Divide: "+(a/b));
    }
    public static void modulus(int a,int b){
        System.out.println("Sum: "+(a%b));
    }
    
}
