public class task12_buysellStock {
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        int maxProfit=Integer.MIN_VALUE;
        int buyPrice=prices[0];
        for(int i=0;i<prices.length;i++){
            
            if(buyPrice<prices[i]){
               int p=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,p);
            }else{
                buyPrice=prices[i];
            }
        }
        System.out.println(maxProfit);
    }
}
