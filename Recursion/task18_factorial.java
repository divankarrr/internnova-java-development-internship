public class task18_factorial {
    public static void main(String args[]){
        int fact=findFactorial(5);
        System.out.println(fact);
    }
    public static int findFactorial(int  n){
        if(n==1||n==0){
            return 1;
        }
        return n*findFactorial(n-1);
    }
    
}
