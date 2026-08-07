public class task13_bubbleSort {
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                print(arr);
            }
            System.out.println();
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
/*
4 5 1 3 2 
4 1 5 3 2 
4 1 3 5 2 
4 1 3 2 5 

1 4 3 2 5 
1 3 4 2 5 
1 3 2 4 5 

1 3 2 4 5 
1 2 3 4 5 

1 2 3 4 5 

*/