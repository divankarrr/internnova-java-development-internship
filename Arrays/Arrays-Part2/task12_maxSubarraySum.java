public class task12_maxSubarraySum{
    public static void main(String args[]){
        int arr[]={2,3,42,-41,21,53,-10};
        int ans=bruteForce(arr);
        System.out.println(ans);
        System.out.println(prefixSum(arr));
        System.out.println(kadaneSum(arr));

    }
    public static int bruteForce(int arr[]){
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int s=0;
                for(int k=i;k<=j;k++){
                    s+=arr[k];
                }
                sum=Math.max(sum,s);
            }
        }
        return sum;
    }
    public static int prefixSum(int arr[]){
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=(prefix[i-1]+arr[i]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                max=Math.max(max,sum);
            }
            
        }
        return max;
    }
    public static int kadaneSum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;

        /*
        when we add two positive number result will be positive
        when we add big positive number to small negative number result will be positive
        when we add small positive number to big negative number result will be negative 
        therefore we replace it with zero,we will only keep the positive output
        */
       /*
       if all the elements of the array is negative then return the small negative number
       */
    }
}