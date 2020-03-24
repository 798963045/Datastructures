package com.nerver.lang.datastructures.gk.BestTimeToBuyAndSellStock2122;

public class Solution2 {

    /**
     * time complexity o(n)
     * space complexity o(1)
     * 峰谷法
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices){
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i<prices.length -1){
            while (i<prices.length-1&&prices[i]>=prices[i+1]){
                i++;
            }
            valley = prices[i];
            while (i<prices.length-1&&prices[i]<=prices[i+1]){
                i++;
            }
            peak = prices[i];
            maxprofit += peak -valley;
        }
        return maxprofit;
    }

}
