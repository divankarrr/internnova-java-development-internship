/*
Task 2: Collections — Student Names (15 Marks)

Create a Java program using a suitable Collection to store the names of at least 5 students.

The program should:

Add student names.
Display all student names.
Remove a student.
Search for a particular student.
Display the final collection.
*/
import java.util.ArrayList;

public class week4_task02 {
    
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        //Add student names.
        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");
        students.add("Sneha");
        students.add("Rohit");

        //Display all student names.
        System.out.println("All Student Names:");
        for (String student : students) {
            System.out.println(student);
        }

        // Remove a student
        students.remove("Aman");
        System.out.println("\nAfter removing Aman:");
        System.out.println(students);

        // Search for a particular student
        String searchStudent = "Priya";

        if (students.contains(searchStudent)) {
            System.out.println("\n" + searchStudent + " is present in the collection.");
        } else {
            System.out.println("\n" + searchStudent + " is not present in the collection.");
        }

        // Display final collection
        System.out.println("\nFinal Student Collection:");
        System.out.println(students);
    }
}

/*
All Student Names:
Rahul
Priya
Aman
Sneha
Rohit

After removing Aman:
[Rahul, Priya, Sneha, Rohit]

Priya is present in the collection.

Final Student Collection:
[Rahul, Priya, Sneha, Rohit]
*/