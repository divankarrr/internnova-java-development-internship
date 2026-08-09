public class task18_calculatepower {
    public static void main(String args[]){
        int n=10;
        int x=2;
        long pow=optimizedPower(x,n);
        System.out.println(pow);
    }
    public static long findPower(int n,int x){
        if(n==1){
            return x;
        }
        return x*findPower(n-1, x);
    }
    public static int optimizedPower(int a,int n){//log n
        if(n==0){
            return 1;
        }
        int halfPower=optimizedPower(a, n/2);
        halfPower*=halfPower;
        //int halfPower=optimizedPower(a, n/2)*optimizedPower(a, n/2);
        if(n%2!=0){
            halfPower=a*halfPower;
        }
        return halfPower;

    }
}
