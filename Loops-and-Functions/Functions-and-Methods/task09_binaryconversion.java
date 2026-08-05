import java.util.Scanner;
import java.lang.Math;
public class task09_binaryconversion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        int deci=0;
        while(n>0){
            int rem=n%10;
            deci=deci+(rem*(int)Math.pow(2,p));
            p++;
            n/=10;
        }
        System.out.println(deci);
        sc.close();
    }
}
