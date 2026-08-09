public class task18_firstOccurence {
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        int index=findOccurence(arr,key,0);
        System.out.println(index);
    }
    public static int findOccurence(int arr[],int key,int start){
        if(arr[start]==key){
            return start;
        }
        if(start==arr.length-1){
            return -1;
        }
        return findOccurence(arr, key, start+1);
    }
}
