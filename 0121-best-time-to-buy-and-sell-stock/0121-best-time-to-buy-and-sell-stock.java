class Solution {
    public int maxProfit(int[] prices) {
        int bPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0 ; i < prices.length; i++){
            if(bPrice < prices[i]){
                int profit = prices[i] - bPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                bPrice = prices[i];
            }
        }return maxProfit;
        
    }
}