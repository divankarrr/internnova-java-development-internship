public class task11_linearSearch {
    public static void main(String args[]){
        int arr[]={1,42,12,34,121,90,35,66,11,66};
        int key=34;
        int pos=linearSearch(arr, key);
        if(pos==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found the key at position"+pos);
        }

    }
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
