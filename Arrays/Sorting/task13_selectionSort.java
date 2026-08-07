public class task13_selectionSort {
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minPos]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
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
pick the smallest in unsorted array
place it in the beginning
1st smallest at 0th index
2nd samllest at 1 th index
....
....

*/
/*
1 4 5 3 2 
1 2 5 3 4 
1 2 3 5 4 
1 2 3 4 5 
*/
