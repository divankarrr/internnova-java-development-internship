/*
Task 2: Loops — Number Practice (20 Marks)

Create a Java program using loops to:

Print numbers from 1 to 100.
Print all even numbers between 1 and 100.
Print all odd numbers between 1 and 100.
Calculate the sum of numbers from 1 to 100.

Use appropriate loops such as for, while, or do-while.

*/

public class week2_task2 {
    public static void main(String args[]){
    
        //Print numbers from 1 to 100.
        System.out.println("Number from 1 to 100");
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //Print all even numbers between 1 and 100.
        System.out.println("Even numbers between 1 to 100");
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //Print all odd numbers between 1 and 100.
        System.out.println("Odd numbers between 1 to 100");
        for(int i=0;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //Calculate the sum of numbers from 1 to 100.
        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum "+sum);




    }
    
}
