public class task05_logicaloperators {
    public static void main(String args[]){
        int a=10;
        int b=5;
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        System.out.println("Is a greater than b AND a less than 20? " + (a>b && a<20));
        System.out.println("Is a greater than b OR a less than 20? " + (a>b || a<20));
        System.out.println("Is NOT (a greater than b)? " + !(a>b));
    }
}
