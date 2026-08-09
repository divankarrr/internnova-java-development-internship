/*
Task 4: Method Parameters & Return Types (15 Marks)

Create methods for the following operations:

Find the square of a number.
Find the cube of a number.
Find the average of three numbers.
Find the maximum of two numbers.

Each method should accept parameters and return the appropriate result.
*/
import java.util.Scanner;
public class week2_task4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int squ=findSquare(n);
        System.out.println("The square of number is : "+squ);
        int cube=findCube(n);
        System.out.println("The cube of number: "+cube);
        System.out.println("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float avg=findAverage(a,b,c);
        System.out.println("The average of three number: "+avg);
        int max=findMaximum(a,b);
        System.out.println("Maximum of two numbers: "+max);
        sc.close();
    }
    public static int findSquare(int n){
        return n*n;
    }
    public static int findCube(int n){
        return n*n*n;
    }
    public static float findAverage(int a,int b,int c){
        return (a+b+c)/3.0f;
    }
    public static int findMaximum(int a,int b){
        return (a>b)?a:b;
    }
    
}
