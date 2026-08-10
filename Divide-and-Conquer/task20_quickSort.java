public class task20_quickSort {
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        quicksort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            quicksort(arr, low, p-1);
            quicksort(arr, p+1, high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        int j=low;
        while(j<high){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        i++;
        int t=arr[i];
        arr[i]=pivot;
        arr[j]=t;
        return i;
    }

}
//pivot and partition
//worst case occurs when pivot is always the smallest or the largest element
//n square solution
 