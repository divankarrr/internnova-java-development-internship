/*
Task 5: 1D Array — Student Marks (15 Marks)

Create a Java program that:

Stores marks of 5 students in a 1D array.
Takes marks as input from the user.
Displays all the marks.
Calculates and displays:
Total marks
Average marks
Highest marks
Lowest marks
*/
import java.util.Scanner;
public class week2_task5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
        System.out.println("Enter your marks: ");
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<5;i++){
            total+=marks[i];
        }
        System.out.println("Total marks "+total);
        System.out.println("Average marks "+(total/5.0));
        int max=findMaximum(marks);
        System.out.println("Highest marks : "+max);
        int low=findLowest(marks);
        System.out.println("Lowest Marks: "+low);
        sc.close();

    }
    public static int findMaximum(int arr[]){
        int max=arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findLowest(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<5;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    
}
