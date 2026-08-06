import java.util.Scanner;
public class task11_Array{
    public static void main(String args[]){
        //list of elements of same type store in a continous memory location
        //creation
        int arr[]=new int[10];
        int arr1[]={1,2,3};
        Scanner sc=new Scanner(System.in);
        //input
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        //output
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        //updation
        arr[1]=10;
        //length of array
        int n=arr.length;
        System.out.println("the length of array"+n);
        //passing array as argument
        updation(arr1);//pass by referance
        sc.close();
    }
    public static void updation(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]+=1;
        }

    }
}