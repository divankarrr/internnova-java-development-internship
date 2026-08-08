public class task17_learning {
    public static void main(String args[]){
        Mustang a=new Mustang();
        a.eat();


    }
    
}
class Animal{
    Animal(){
        System.out.println("Animal constructor is called");
    }
    void eat(){
        System.out.println("eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}
/*
Animal constructor is called
Horse constructor is called
Mustang constructor is called
eats
*/
