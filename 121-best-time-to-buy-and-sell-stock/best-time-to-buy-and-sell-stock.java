class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0];
       int maxprofit=0;

       for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
            min=prices[i];
        }else{
            int tempProfit=prices[i]-min;
            if(tempProfit>maxprofit){
                maxprofit=tempProfit;
            }
        }
       }
       return maxprofit;
    }
}
