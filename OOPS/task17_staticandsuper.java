public class task17_staticandsuper{
    public static void main(String args[]){
        Student s=new Student();
        s.schoolName="ABPS Jagdishpur";
        Student s1=new Student();
        System.out.println(s1.schoolName);
        Horse h=new Horse();
        System.out.println(h.color);
    }

}
class Student{
    String name;
    int rollno;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }

}


class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
    
}
class Horse extends Animal{
    Horse(){
        super.color="black";
        //super();//default hi hota hai
        System.out.println("Horse constructor is called");
    }
}
/*
static keyword in java is used to share the same variable or method of a given class
properties functions blocks nested classes

*/
/*
super keyword
is used to refer the immediate parent class of object
    to access parent properties
    to access parent functions
    to access parent constructors

*/
/*
constructor chaining
*/