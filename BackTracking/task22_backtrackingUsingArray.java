public class task22_backtrackingUsingArray{
    public static void main(String args[]){
        int arr[]=new int[5];
        changeArray(arr,0,1);
        print(arr);
    }
    public static void changeArray(int arr[],int index,int val){
        //base case
        if(index==arr.length){
            print(arr);
            return;
        }
        //recursion
        arr[index]=val;
        changeArray(arr,index+1,val+1);
        arr[index]=arr[index]-2;

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}