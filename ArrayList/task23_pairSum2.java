public class task23_pairSum2 {
    public static void main(String args[]){
        //Sorted and Rotated array
        int arr[]={11,15,6,8,9,10};
        int target=17;
        pointerSolution(arr, target);

    }
    public static int findPivot(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return i;
            }
        }
        return arr.length-1;
    }
    public static void pointerSolution(int arr[],int target){
        int pivot=findPivot(arr);
        int left=pivot+1;
        int right=pivot;
        int n=arr.length;
        while(left!=right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("Solution exists");
                return;
            }else if(sum<target){
                left=(left+1)%n;
            }else{
                right=(right+n-1)%n;
            }
        }
        System.out.println("Solution doesnot exist");
    }
    
}
