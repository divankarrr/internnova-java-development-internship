public class task09_overloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
    }
}
/*
inbuilt and user defined functions

math.max
sc.nextInt

function overloading
multiple functions with same name with differnt parameters

function overloading using parameters
function overloading using datatypes

method scope
block scope
class scope

*/