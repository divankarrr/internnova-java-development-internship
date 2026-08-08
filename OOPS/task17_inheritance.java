public class task17_inheritance {
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.eat();

    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim in water");
    }

}
class A extends Fish{
    void dangerous(){
        System.out.println("No");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }

}





/*
inheritance
when the properties and methods of base class is passed to derived class
types of inheritance
1. single level inheritance
2. multi level inheritance
3. heriarchical inheritance
4.hybrid inheritance
5. multiple inheritance is not present in java 


*/
