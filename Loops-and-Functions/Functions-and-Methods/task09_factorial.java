import java.util.Scanner;
public class task09_factorial {
    public static int multiply(int a,int b){
        return a*b;
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Multiplication of a * b: "+multiply(a, b));
        int n=sc.nextInt();
        System.out.println(factorial(n));
        sc.close();


    }
    
}
