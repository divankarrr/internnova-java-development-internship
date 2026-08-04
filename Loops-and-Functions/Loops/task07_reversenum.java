public class task07_reversenum {
    public static void main(String args[]){
        int n=1099;
        while(n>0){
            int rem=n%10;
            System.out.print(rem);
            n/=10;
        }

        int num=2342;
        int rev=0;
        while(num>0){
            int rem=n%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("Reverse number is"+rev);

    }
}
