public class task13_countingSort{
    public static void main(String args[]){
        int arr[]={1,4,1,3,5,4,2,3,8};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int freq[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<=max;i++){
            if(freq[i]!=0){
                while(freq[i]>0){
                    arr[j]=i;
                    freq[i]--;
                    j++;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}