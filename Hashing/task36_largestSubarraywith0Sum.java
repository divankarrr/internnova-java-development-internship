import java.util.HashMap;
public class task36_largestSubarraywith0Sum {
    public static void main(String args[]){
        int nums[]={15,-2,2,-8,1,7,10};
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=0;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(map.containsKey(sum)){
                len=Math.max(len,(j-map.get(sum)));
            }else{
                map.put(sum,j);
            }

        }
        System.out.println(len);

    }
    
}
