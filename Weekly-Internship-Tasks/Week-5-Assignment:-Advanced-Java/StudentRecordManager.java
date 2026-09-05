/*
Task 4: File Handling — Student Records (20 Marks)

Create a Java program that stores student information in a text file.

The program should:

Create a file.
Write student information into the file.
Read the information from the file.
Display the file contents in the console.

Use appropriate exception handling for file operations.

Student Information

Store details such as:

Student ID
Student Name
Course
Marks
Requirements

Demonstrate both:

Writing to a file
Reading from a file
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StudentRecordManager {
    public static void main(String[] args) {
        String fileName = "student_records.txt";

        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);

            writer.write("ID: STU001 | Name: Aarav Sharma | Course: Computer Science | Marks: 88.5\n");
            writer.write("ID: STU002 | Name: Diya Patel | Course: Data Science | Marks: 92.0\n");
            writer.write("ID: STU003 | Name: Rohan Das | Course: IT | Marks: 79.5\n");
            
            writer.close();
            System.out.println("File created and student records saved successfully!\n");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        System.out.println("Reading and displaying file contents:");

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}

