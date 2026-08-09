public class task18_fibonacciNumber {
    public static void main(String args[]){
        // int a=0;
        // int b=1;
        // int n=5;
        // for(int i=2;i<=n;i++){
        //     int c=a+b;
        //     a=b;
        //     b=c;

        // }
        // System.out.println(b);
        int n=5;
        int fib=findFibonacci(n);
        System.out.println(fib);
    }
    public static int findFibonacci(int n){
        if(n<=1){
            return n;
        }
        return findFibonacci(n-1)+findFibonacci(n-2);
    }
}
