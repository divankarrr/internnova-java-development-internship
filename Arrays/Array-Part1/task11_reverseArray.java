public class task11_reverseArray {
    public static void main(String args[]){
        int arr[]={1,2,32,45,21,55,65};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArray(int arr[]){
        // int n=arr.length;
        // for(int i=0;i<arr.length/2;i++){
        //     int temp=arr[i];
        //     arr[i]=arr[n-i-1];
        //     arr[n-i-1]=temp;
        // }

        int low=0,high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

}
