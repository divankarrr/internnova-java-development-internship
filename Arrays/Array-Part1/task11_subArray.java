public class task11_subArray {
    public static void main(String args[]){
        int arr[]={2,32,44,12,43};
        int n=arr.length;
        int total=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                total++;
            }
            System.out.println();
        }
        System.out.println("total no of subarray "+total);
    }
}
//continous part of array n*(n+1)/2
/*
2 
2 32 
2 32 44 
2 32 44 12 
2 32 44 12 43 

32 
32 44 
32 44 12 
32 44 12 43 

44 
44 12 
44 12 43 

12 
12 43 

43 
total no of subarray 15
*/
