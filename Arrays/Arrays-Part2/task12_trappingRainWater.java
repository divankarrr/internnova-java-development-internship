public class task12_trappingRainWater {
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        int n=height.length;
        int maxRight[]=new int[n];
        int maxLeft[]=new int[n];
        for(int i=0;i<n;i++){
            maxLeft[i]=(i==0)?height[i]:Math.max(maxLeft[i-1],height[i]);
        }
        for(int i=n-1;i>=0;i--){
            maxRight[i]=(i==n-1)?height[i]:Math.max(maxRight[i+1],height[i]);
        }
        int width=1;
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(maxRight[i],maxLeft[i]);
            int water=(waterLevel-height[i])*width;
            if(water>0){
                trappedWater+=water;
            }
        }
        System.out.println(trappedWater);

    }
}
/*
1. if there will be one single bar then there will be not water trapped
2. if there will be two bars then also there will be no water trapped
3. if the bars are in increasing order then there will be no water trapped
4. if the bars are int decreasing order then there will be no water trapped

5. water level will be min(maxleft,maxright);

| Trapping Rain Water – Two Pointer | O(n) | O(1) |

*/