public class task23_Containerwithmostwater {
    public static void main(String args[]){
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(bruteForce(height));
        System.out.println(pointerSolution(height));
    }
    public static int bruteForce(int height[]){
        int max=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
            }
        }
        return max;
    }
    public static int pointerSolution(int height[]){
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<=right){
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            max=Math.max(max,(width*h));
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }

        }
        return max;
    }
}
