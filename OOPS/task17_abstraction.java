public class task17_abstraction {
    public static void main(String args[]){
        Horse h=new Horse();
        h.eat();
        h.legs();

    }
    
}
abstract class Animal{
    String color;
    Animal(){
        this.color="brown";
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void legs();
}
class Horse extends Animal{
    void changeColor(){
        this.color="black";
    }
    void legs(){
        System.out.println("has four legs");
    }
}
/*
hidding all the unnecessary thing and showing only the important thing to the user
idea dete hai but implementation nhi karte hai

*/
/*
abstract class
    cannot create an instance of abstract class
    can have constructors
    can have abstract/non-abstract methods(vo methods jinka implementation nhi rheta)
*/