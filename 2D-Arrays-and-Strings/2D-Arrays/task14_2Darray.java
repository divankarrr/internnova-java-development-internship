import java.util.Scanner;
public class task14_2Darray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int mat[][]=new int[3][4];
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        //searching
        int key =8;
        Search(mat,key);
        sc.close();
    }
    public static void Search(int mat[][],int key){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==key){
                    System.out.println("Key found");
                    return;
                }
            }
        }
        System.out.println("Key not Found");
    }
}
/*

row major
elements are store in continous memory row wise
column major
elements are store in continous memory column wise

java stores 2d array differently
it stores the address of each row array
and each row array has elements row wise

*/