class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxprofit = 0;
        while(right < prices.length){
            if(prices[left]<prices[right]){
                int a = prices[right]-prices[left];
                maxprofit = Math.max(a,maxprofit);
            }
            else{
                left = right;
            }
            right++;
        }
        return maxprofit;
        
    }
}
