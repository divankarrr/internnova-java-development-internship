/*
 Task 6: Mini Java Project — Student Record Manager (25 Marks)

Build a console-based Student Record Manager using the concepts covered in Week 4.

Main Menu
===== Student Record Manager =====

1. Add Student
2. View Students
3. Search Student
4. Remove Student
5. Display Unique Courses
6. Exit

Enter your choice:
1. Add Student

Accept:

Student ID
Student Name
Course
Age

Store the student records using an appropriate Collection.

Student ID should be unique.

2. View Students

Display all stored student records in a properly formatted manner.

3. Search Student

Allow the user to search for a student using Student ID.

If the student does not exist, display an appropriate message.

4. Remove Student

Allow the user to remove a student using Student ID.

Display a confirmation message after successful removal.

5. Display Unique Courses

Use HashSet to display all unique course names stored in the system.

If multiple students belong to the same course, the course should appear only once.

6. Exception Handling

Handle appropriate errors such as:

Invalid menu choice
Invalid numeric input
Invalid Student ID
Searching for a non-existing student

The application should not crash unexpectedly.

7. StringBuilder

Use StringBuilder meaningfully for formatting or constructing student information/output.
*/
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class week4_task06 {
    // Student class
    static class Student {
        int id;
        String name;
        String course;
        int age;

        Student(int id, String name, String course, int age) {
            this.id = id;
            this.name = name;
            this.course = course;
            this.age = age;
        }

        // StringBuilder used meaningfully for formatting student information
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            sb.append("ID: ").append(id)
              .append(" | Name: ").append(name)
              .append(" | Course: ").append(course)
              .append(" | Age: ").append(age);

            return sb.toString();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // HashMap: Student ID -> Student Record
        HashMap<Integer, Student> students = new HashMap<>();

        // HashSet: stores unique course names
        HashSet<String> courses = new HashSet<>();

        while (true) {

            System.out.println("\n===== Student Record Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Display Unique Courses");
            System.out.println("6. Exit");

            try {
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    // 1. Add Student
                    case 1:
                        try {
                            System.out.print("Enter Student ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            if (id <= 0) {
                                System.out.println("Error: Student ID must be a positive number.");
                                break;
                            }

                            if (students.containsKey(id)) {
                                System.out.println("Error: Student ID already exists.");
                                break;
                            }

                            System.out.print("Enter Student Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Course: ");
                            String course = sc.nextLine();

                            System.out.print("Enter Age: ");
                            int age = sc.nextInt();
                            sc.nextLine();

                            if (age <= 0) {
                                System.out.println("Error: Age must be a positive number.");
                                break;
                            }

                            Student student = new Student(id, name, course, age);

                            students.put(id, student);
                            courses.add(course);

                            System.out.println("Student added successfully!");

                        } catch (InputMismatchException e) {
                            System.out.println("Error: Please enter valid numeric input.");
                            sc.nextLine();
                        }
                        break;

                    // 2. View Students
                    case 2:
                        if (students.isEmpty()) {
                            System.out.println("No student records available.");
                        } else {
                            System.out.println("\n===== Student Records =====");

                            StringBuilder output = new StringBuilder();

                            for (Student student : students.values()) {
                                output.append(student).append("\n");
                            }

                            System.out.print(output);
                        }
                        break;

                    // 3. Search Student
                    case 3:
                        try {
                            System.out.print("Enter Student ID to search: ");
                            int searchId = sc.nextInt();
                            sc.nextLine();

                            if (searchId <= 0) {
                                System.out.println("Error: Invalid Student ID.");
                                break;
                            }

                            if (students.containsKey(searchId)) {
                                System.out.println("Student Found:");
                                System.out.println(students.get(searchId));
                            } else {
                                System.out.println(
                                    "Student with ID " + searchId + " does not exist."
                                );
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Error: Student ID must be numeric.");
                            sc.nextLine();
                        }
                        break;

                    // 4. Remove Student
                    case 4:
                        try {
                            System.out.print("Enter Student ID to remove: ");
                            int removeId = sc.nextInt();
                            sc.nextLine();

                            if (removeId <= 0) {
                                System.out.println("Error: Invalid Student ID.");
                                break;
                            }

                            if (students.containsKey(removeId)) {

                                Student removedStudent = students.remove(removeId);

                                System.out.println(
                                    "Student '" + removedStudent.name +
                                    "' removed successfully."
                                );

                                // Rebuild courses because the removed student's
                                // course may no longer belong to any student.
                                courses.clear();

                                for (Student student : students.values()) {
                                    courses.add(student.course);
                                }

                            } else {
                                System.out.println(
                                    "Student with ID " + removeId + " does not exist."
                                );
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Error: Student ID must be numeric.");
                            sc.nextLine();
                        }
                        break;

                    // 5. Display Unique Courses
                    case 5:
                        if (courses.isEmpty()) {
                            System.out.println("No courses available.");
                        } else {
                            System.out.println("\n===== Unique Courses =====");

                            for (String course : courses) {
                                System.out.println(course);
                            }
                        }
                        break;

                    // 6. Exit
                    case 6:
                        System.out.println("Thank you for using Student Record Manager!");
                        sc.close();
                        return;

                    // Invalid menu choice
                    default:
                        System.out.println("Error: Invalid menu choice. Please select 1-6.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid numeric menu choice.");
                sc.nextLine();
            }
        }
    }
}