public class task20_mergeSort{
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        split(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void split(int arr[],int low,int high){
    
        if(low<high){
            int mid=low+(high-low)/2;
            split(arr,low,mid);
            split(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int arr[],int low,int mid,int high){
        int i=low,j=mid+1,k=low;
        int temp[]=new int[high+1];
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        for(int r=low;r<=high;r++){
            arr[r]=temp[r];
        }
    }
}