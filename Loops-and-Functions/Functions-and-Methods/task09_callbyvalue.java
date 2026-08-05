import java.util.Scanner;
public class task09_callbyvalue {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        //this change will not be seen in main function
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);// a copy of a & b are passed
        System.out.println(a);
        System.out.println(b);
        sc.close();
        
    }
}
//java always uses call by value
