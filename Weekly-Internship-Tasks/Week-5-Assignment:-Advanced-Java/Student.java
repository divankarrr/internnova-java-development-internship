/*
Task 1: Packages — Organizing Java Code (15 Marks)

Create a custom Java package named studentmanagement.

Inside the package, create a class named Student containing:

Student ID
Student Name
Course

Create another Java class outside the package and import the Student class.

Create a Student object and display the student information.

*/
package studentmanagement;

public class Student {
    private String studentID;
    private String studentName;
    private String course;

    // Constructor
    public Student(String studentID, String studentName, String course) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.course = course;
    }

    // Method to display student information
    public void displayStudentDetails() {
        System.out.println("ID     : " + studentID);
        System.out.println("Name   : " + studentName);
        System.out.println("Course : " + course);
        
    }
}
