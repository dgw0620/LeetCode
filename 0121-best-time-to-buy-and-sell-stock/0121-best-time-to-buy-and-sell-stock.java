class Solution {
    public int maxProfit(int[] prices) {
        
        int[] dp = new int[prices.length];
        int min = prices[0];
        
        
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) min = prices[i];
            int profit = prices[i] - min;
            dp[i] = dp[i - 1];
            if (dp[i] < profit) dp[i] = profit;
        }
        
        return dp[dp.length - 1];
    }
}