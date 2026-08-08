public class task17_constructor {
    public static void main(String args[]){
        Student s=new Student("deva");
        System.out.println(s.name);
        Student s1=new Student(s);
        s1.password="deva123";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=98;
        for(int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }
        
        //copy karke baad bhi marks change hoga kyunki ek reference pass hoga
        s1.marks[2]=87;
        for(int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }
        //shallow and deep copy

        


    }
    
}
class Student{
    String name;
    int rollno;
    String password;
    int marks[];
    //constructor overloading
    Student(String name){
        this.name=name;
    }
    Student(){
        System.out.println("Constructor is called");
    }
    //copy constructor
    //shallow copy
    // Student(Student s){
    //     this.name=s.name;
    //     this.rollno=s.rollno;
    //     this.marks=s.marks;
    // }
    //deep copy
    Student(Student s){
        this.name=s.name;
        this.rollno=s.rollno;
        marks=new int[3];
        for(int i=0;i<3;i++){
            this.marks[i]=s.marks[i];
        }
    }
}

/*

constructor is a special method which is invoked automatically at the time of obejct creation
constructor has same name as class
constructor donot have return type
constructors are only called at once
memory allocation happens when constructor is called


types of constructors
non parameterized
parameterized
copy constructor


*/
/*

destructors
in java we have garbage collectors

*/