/*
Task 5: StringBuilder — Text Manipulation (10 Marks)

Create a Java program using StringBuilder.

Perform the following operations:

Create a string.
Append additional text.
Insert text at a specific position.
Replace a portion of the text.
Reverse the final string.

Display the result after performing the operations.
*/
public class week4_task05 {
    public static void main(String[] args) {

        // Create a StringBuilder
        StringBuilder text = new StringBuilder("Hello Java");

        // Display original string
        System.out.println("Original: " + text);

        // Append additional text
        text.append(" Programming");
        System.out.println("After Append: " + text);

        // Insert text at a specific position
        text.insert(6, "Core ");
        System.out.println("After Insert: " + text);

        // Replace a portion of the text
        text.replace(0, 5, "Hi");
        System.out.println("After Replace: " + text);

        // Reverse the final string
        text.reverse();
        System.out.println("After Reverse: " + text);
    }
}
/*
Original: Hello Java
After Append: Hello Java Programming
After Insert: Hello Core Java Programming
After Replace: Hi Core Java Programming
After Reverse: gnimmargorP avaJ eroC iH
*/