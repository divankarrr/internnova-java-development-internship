public class task13_insertionSort {
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
            print(arr);

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
pick the element and place it at its right position;
4 5 1 3 2 
1 4 5 3 2 
1 3 4 5 2 
1 2 3 4 5
*/
