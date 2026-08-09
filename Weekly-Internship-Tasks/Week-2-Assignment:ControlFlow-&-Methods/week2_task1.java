/*
Task 1: Conditional Statements — Student Result (15 Marks)

Create a Java program that:

Takes marks of a student in 3 subjects as input.
Calculates the total marks and percentage.
Uses conditional statements to determine the result.
Display:
Student Name
Total Marks
Percentage
Result
*/
import java.util.Scanner;
public class week2_task1 {
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your Math marks: ");
        float math=sc.nextFloat();
        System.out.println("Enter your Physics marks: ");
        float physics=sc.nextFloat();
        System.out.println("Enter your Chemistry marks: ");
        float chemistry=sc.nextFloat();
        float total=math+physics+chemistry;
        float percent=(total*100)/300;
        System.out.println("Student name: "+name);
        System.out.println("Total marks: "+total);
        System.out.println("Percentage: "+percent);
        if(percent>33){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        sc.close();
    }
    
}
