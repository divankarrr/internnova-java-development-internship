import java.util.Arrays;
public class task11_binarySearch {
    public static void main(String args[]){
        int arr[]={1,32,12,53,64,23,78};
        Arrays.sort(arr);//array must be sorted
        int key=12;
        int pos=binarySearch(arr,key);
        if(pos==-1){
            System.out.println("not found");
        }else{
            System.out.println("element is present at position"+pos);
        }
    }
    public static int binarySearch(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                return mid;
            }else{
                if(arr[mid]>key){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}
