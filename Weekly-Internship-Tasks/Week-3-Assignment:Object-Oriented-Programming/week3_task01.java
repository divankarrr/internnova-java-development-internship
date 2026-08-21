/*Task 1: Classes & Objects — Student Management (15 Marks)

Create a "Student" class with the following attributes:

- Student Name
- Roll Number
- Branch
- CGPA

Create objects of the "Student" class and display the information of at least 3 students.

Requirements:

- Create a separate class.
- Create multiple objects.
- Access the attributes through objects.
- Display the student information in a proper format.
*/

//Create a separate class.
class Student{
    String name;
    int rollno;
    String branch;
    Float cgpa;
    Student(String name,int rollno,String branch,float cgpa){
        this.name=name;
        this.rollno=rollno;
        this.branch=branch;
        this.cgpa=cgpa;
    }
}
public class week3_task01{
    public static void main(String args[]){
       // Create multiple objects.
        Student s1=new Student("Divankar Singh",132,"CSE",8.94f);
        Student s2=new Student("Rajat",136,"CSIT",8.76f);
        Student s3=new Student("Siddhant Singh",203,"CSEAIML",7.15f);

        //Access the attributes through objects.

        String nameOfStudent1=s1.name;
        System.out.println("name of student 1"+nameOfStudent1);
        String nameOfStudent3=s3.name;
        System.out.println("name of student 3"+nameOfStudent3);

        int rollnoOfStudent2=s2.rollno;
        System.out.println("Roll number of student 2"+rollnoOfStudent2);
        
        float cgpaOfStudent3=s3.cgpa;
        System.out.println("CGPA of student 3"+cgpaOfStudent3);


        //Display the student information in a proper format.

        System.out.println("Details of Student 1: ");
        System.out.println("Name "+s1.name +" Rollno "+s1.rollno+" Branch "+s1.branch+" CGPA "+s1.cgpa);

        System.out.println("Details of Student 2: ");
        System.out.println("Name "+s2.name +" Rollno "+s2.rollno+" Branch "+s2.branch+" CGPA "+s2.cgpa);

        System.out.println("Details of Student 3: ");
        System.out.println("Name "+s3.name +" Rollno "+s3.rollno+" Branch "+s3.branch+" CGPA "+s3.cgpa);

    }
}
/*
OUTPUT

name of student 1Divankar Singh
name of student 3Siddhant Singh
Roll number of student 2136
CGPA of student 37.15
Details of Student 1: 
Name Divankar Singh Rollno 132 Branch CSE CGPA 8.94
Details of Student 2: 
Name Rajat Rollno 136 Branch CSIT CGPA 8.76
Details of Student 3: 
Name Siddhant Singh Rollno 203 Branch CSEAIML CGPA 7.15

*/