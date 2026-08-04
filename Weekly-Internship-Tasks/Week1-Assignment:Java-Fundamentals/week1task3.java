/*Task 3: Input & Output using Scanner Class (20 Marks)

Create a Java program that accepts the following details from the user:

Full Name
Age
College Name
Branch
City

Display the entered information in a well-formatted manner. */
import java.util.Scanner;
public class week1task3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Full Name: ");
        String name=sc.nextLine();
        System.out.println("Enter your Age: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your CollegeName: ");
        String collegeName=sc.nextLine();
        System.out.println("Enter your Branch: ");
        String branch=sc.nextLine();
        System.out.println("Enter your City: ");
        String city=sc.nextLine();
        System.out.println("Your Details are :\n"+name+"\n"+age+"\n"+collegeName+"\n"+branch+"\n"+city);
        sc.close();

    }
}
