import java.util.Stack;

public class task27_maxAreaHistogram {
    public static void main(String args[]){
        int heights[]={2,1,5,6,2,3};
        int maxArea=0;
        int n=heights.length;
        int smallerLeft[]=new int[n];
        int smallerRight[]=new int[n];
        nextSmallerLeft(heights,smallerLeft);
        nextSmallerRight(heights,smallerRight);

        for(int i=0;i<heights.length;i++){
            int h=heights[i];
            int width=smallerRight[i]-smallerLeft[i]-1;
            maxArea=Math.max(maxArea,h*width);
        }
        System.out.println(maxArea);

    }
     public static void nextSmallerLeft(int arr[],int nsl[]){
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            nsl[i]=ans[i];
        }

    }
     public static void nextSmallerRight(int arr[],int nsr[]){
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            nsr[i]=ans[i];
        }

    }
    
}
