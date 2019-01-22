class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int profit=0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            profit= Math.max(0,profit+=prices[i]-prices[i-1]);
            max=Math.max(profit,max);
        }
        return max;
    }
}