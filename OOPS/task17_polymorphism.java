public class task17_polymorphism {
    public static void main(String args[]){
        Calculator cal=new Calculator();
        System.out.println(cal.sum(2,3));
        System.out.println(cal.sum(2.5f,5.3f ));
        System.out.println(cal.sum(4,3,11));
        Deer d=new Deer();
        d.eat();

    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
class Animal{
    void eat(){
    System.out.println("eats");}
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
/*
compile time polymorphism
    method overloading
    mutliple functions with same name but different number of parameter(type or count)
run time polymorphism
    method overriding
    parent and child class have same function name but different defination
*/

/*

package is a group of similar type of class,interfaces,subpackages
*/