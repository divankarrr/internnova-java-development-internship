public class task18_lastOccurence {
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        int index=findLastOccurence(arr,key,arr.length-1);
        System.out.println(index);

    }
    public static int findLastOccurence(int arr[],int key,int end){
        if(arr[end]==key){
            return end;
        }
        if(end==0){
            return -1;
        }
        return findLastOccurence(arr, key, end-1);
    }
    
}
