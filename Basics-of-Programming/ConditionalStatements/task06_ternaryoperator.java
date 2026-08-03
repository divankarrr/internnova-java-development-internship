public class task06_ternaryoperator {
    public static void main(String args[]){
        int num=10;
        String type=(num%2==0)?"Even":"Odd";
        System.out.println(num+" is "+type);

        int marks=85;
        String result=(marks>=33)?"Pass":"Fail";
        System.out.println("You have "+result+" the exam.");
    }
}
