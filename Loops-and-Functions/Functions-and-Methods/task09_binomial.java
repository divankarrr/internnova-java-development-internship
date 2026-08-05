import java.util.Scanner;
public class task09_binomial {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static int binomial(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binomialCoeff=fact_n/(fact_r*fact_nmr);
        return binomialCoeff;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(binomial(n,r));
        sc.close();
    }
}
/*
ncr=n!/r!(n-r)!
*/