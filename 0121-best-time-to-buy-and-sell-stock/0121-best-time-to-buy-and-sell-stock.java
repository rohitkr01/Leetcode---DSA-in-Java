class Solution {
    /*
    -->> Time complexity: O(n^2)
    public int maxProfit(int[] prices) {
        int ans =0;
        int maxProfit = 0;
        int n = prices.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int prof = prices[j]-prices[i];
                maxProfit = Math.max(maxProfit, prof);
            }
        }
        return maxProfit;
    }  */
    
     public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}