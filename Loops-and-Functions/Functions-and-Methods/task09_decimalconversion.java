public class task09_decimalconversion{
    public static void main(String args[]){
        int n=23;
        int binary=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            binary+=(int)Math.pow(rem,pow);
            n/=2;
            pow++;

        }
        System.out.println(binary);

    }
}