import java.util.Scanner;
public class task09_functions {
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static void calculateSum(int a,int b){//parameter or formal parameters
        System.out.println(a+b);
    }
    public static void main(String args[]){
        printHelloWorld();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculateSum(a, b);//actual parameters or arguments
        sc.close();
    }
}
/*
vo functions jo class ke andar likhe jate hai use methods kehte hai
syntax of function
returntype functionName(type para1, type para2 ){
//body
return statement
}


*/
