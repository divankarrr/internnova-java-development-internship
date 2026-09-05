
import studentmanagement.Student;

public class MainApp {
    public static void main(String[] args) {
        // Creating an object of the imported Student class
        Student student1 = new Student("S101", "Ananya Sharma", "Computer Science Engineering");
        
        // Displaying student information
        student1.displayStudentDetails();
    }
}
/*
A Package in Java acts like a container or a folder structure used to group related classes, interfaces, and sub-packages together. 
It helps prevent naming conflicts (e.g., having two classes named Student in different components) and improves modularity and access control. 
We declare a package using the package keyword at the very top of a file, and external files access it using the import statement.

*/