public class task20_searchRotated {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int key=0;
        int index=search(arr,0,arr.length-1,key);
        System.out.println(index);
    }
    public static int search(int arr[],int low,int high,int key){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[low]<=arr[mid]){
            if(arr[low]<=
                key && key<=arr[mid]){
                return search(arr, low, mid-1, key);
            }else{
                return search(arr, mid+1, high, key);
            }

        }else{
            if(arr[mid]<=key && key<=arr[high]){
                return search(arr, mid+1, high, key);
            }else{
                return search(arr, low, mid-1, key);
            }

        }

    }
    
}
//search in rotated sorted array
/*


*/