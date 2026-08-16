import java.util.Stack;
public class task26_nextGreater {
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        nextGreater(arr);

    }
    public static void bruteForce(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int pos=-1;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    pos=j;
                    break;
                }
            }
            ans[i]=pos;
        }
    }
    public static void nextGreater(int arr[]){
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
