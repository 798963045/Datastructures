package com.nerver.lang.datastructures.gk.DynamicProgramming.FirstTimeBestTimeToBuyAndSellStock2122;

public class Solution3 {
    /**
     * time complexity o(n)
     * space complexity o(1)
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices){
        int maxprofit = 0;
        for (int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxprofit += prices[i]-prices[i-1];
            }
        }
        return maxprofit;
    }

}
