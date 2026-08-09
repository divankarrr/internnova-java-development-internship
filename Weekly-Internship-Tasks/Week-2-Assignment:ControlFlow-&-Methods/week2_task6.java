/*
Task 6: 2D Array — Matrix Operations (15 Marks)

Create a Java program using a 2D array to store a 3 × 3 matrix.

The program should:

Take matrix elements as input.
Display the matrix in proper format.
Calculate and display the sum of all elements.
*/
import java.util.Scanner;
public class week2_task6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int mat[][]=new int[3][3];
        System.out.println("Enter the elements: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
        }
        System.out.println("Matrix is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nsum : "+sum);
        sc.close();

    }
}
