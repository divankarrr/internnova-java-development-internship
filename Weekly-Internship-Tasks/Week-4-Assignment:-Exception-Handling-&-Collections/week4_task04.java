/*
Task 4: HashMap — Student Records (15 Marks)

Create a Java program using HashMap to store student records.

Use:

Key: Student ID
Value: Student Name

The program should:

Add at least 5 student records.
Display all records.
Search for a student using Student ID.
Remove a student record.
Display the updated records.
*/
import java.util.HashMap;

public class week4_task04 {
    public static void main(String[] args) {

        // Create a HashMap
        // Key = Student ID
        // Value = Student Name
        HashMap<Integer, String> students = new HashMap<>();

        // Add at least 5 student records
        students.put(101, "Rahul");
        students.put(102, "Priya");
        students.put(103, "Aman");
        students.put(104, "Sneha");
        students.put(105, "Rohit");

        // Display all records
        System.out.println("All Student Records:");
        for (HashMap.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Search for a student using Student ID
        int searchId = 103;

        if (students.containsKey(searchId)) {
            System.out.println("\nStudent Found:");
            System.out.println("ID: " + searchId + ", Name: " + students.get(searchId));
        } else {
            System.out.println("\nStudent with ID " + searchId + " not found.");
        }

        // Remove a student record
        students.remove(104);

        // Display updated records
        System.out.println("\nUpdated Student Records:");
        for (HashMap.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
/*
All Student Records:
ID: 101, Name: Rahul
ID: 102, Name: Priya
ID: 103, Name: Aman
ID: 104, Name: Sneha
ID: 105, Name: Rohit

Student Found:
ID: 103, Name: Aman

Updated Student Records:
ID: 101, Name: Rahul
ID: 102, Name: Priya
ID: 103, Name: Aman
ID: 105, Name: Rohit
*/