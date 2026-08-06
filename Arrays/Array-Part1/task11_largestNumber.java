public class task11_largestNumber {
    public static void main(String args[]){
        int arr[]={1,2,3,45,5,12,9,56};
        int largest=findMax(arr);
        System.out.println("The largest element in the array is "+largest);
    }
    public static int findMax(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
