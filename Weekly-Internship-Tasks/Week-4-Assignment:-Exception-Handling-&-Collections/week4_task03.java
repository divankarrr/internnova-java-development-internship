
/*
Task 3: HashSet — Unique Courses (15 Marks)

Create a Java program using HashSet to store course names.

Requirements
Add at least 7 course entries.
Include duplicate course names.
Display the final HashSet.
Demonstrate that duplicate values are not stored.
Search for a particular course
*/
import java.util.HashSet;

public class week4_task03 {
        public static void main(String[] args) {

        // Create a HashSet to store course names
        HashSet<String> courses = new HashSet<>();

        // Add at least 7 course entries
        courses.add("Java");
        courses.add("Python");
        courses.add("Data Structures");
        courses.add("Database Management");
        courses.add("Operating Systems");
        courses.add("Computer Networks");
        courses.add("Artificial Intelligence");

        // Add duplicate course names
        courses.add("Java");
        courses.add("Python");

        // Display final HashSet
        System.out.println("Final Course HashSet:");
        System.out.println(courses);

        // Demonstrate that duplicates are not stored
        System.out.println("\nTotal unique courses: " + courses.size());
        System.out.println("Duplicate courses are not stored because HashSet stores only unique values.");

        // Search for a particular course
        String searchCourse = "Java";

        if (courses.contains(searchCourse)) {
            System.out.println("\n" + searchCourse + " is present in the HashSet.");
        } else {
            System.out.println("\n" + searchCourse + " is not present in the HashSet.");
        }
    }
}
/*
Final Course HashSet:
[Computer Networks, Java, Data Structures, Artificial Intelligence, Database Management, Python, Operating Systems]

Total unique courses: 7
Duplicate courses are not stored because HashSet stores only unique values.

Java is present in the HashSet.
*/