public class task18_sumOfNaturalnumber {
    public static void main(String args[]){
        int n=10;
        int sum=sumOfFirstNaturalNumber(n);
        System.out.println("sum "+sum);
    }
    public static int sumOfFirstNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfFirstNaturalNumber(n-1);
    }
    
}
