public class task05_assignmentoperators {
    public static void main(String args[]){
        int a=10;
        int b=5;
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        a+=b; // a=a+b
        System.out.println("The value of a after a+=b is: " + a);
        a-=b; // a=a-b
        System.out.println("The value of a after a-=b is: " + a);
        a*=b; // a=a*b
        System.out.println("The value of a after a*=b is: " + a);
        a/=b; // a=a/b
        System.out.println("The value of a after a/=b is: " + a);
        a%=b; // a=a%b
        System.out.println("The value of a after a%=b is: " + a);
    }
}
