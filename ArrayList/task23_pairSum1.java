public class task23_pairSum1 {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int target=5;
        bruteForce(arr, target);
        pointersolution(arr, target);
    }
    public static void bruteForce(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair exists");
                    return;
                }
            }
        }
        System.out.println("Pair doesnot Exists");

    }
    public static void pointersolution(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left!=right){
            if(arr[left]+arr[right]==target){
                System.out.println("Pair exist");
                return;
            }else if(arr[left]+arr[right]<target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("Pair doesnot exist");
    }
}
