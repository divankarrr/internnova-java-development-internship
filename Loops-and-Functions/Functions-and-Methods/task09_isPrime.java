import java.util.Scanner;
public class task09_isPrime {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){//for(int i=0;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        primeInRange(n);
        sc.close();
    }
}
