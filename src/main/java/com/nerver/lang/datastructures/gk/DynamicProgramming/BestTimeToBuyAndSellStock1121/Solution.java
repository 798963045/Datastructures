package com.nerver.lang.datastructures.gk.DynamicProgramming.BestTimeToBuyAndSellStock1121;

public class Solution {

    /**
     * 暴力法
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices){
        int maxProfit =0;
        for (int i=0;i<prices.length-1;i++){
            for (int j =i+1;j<prices.length;j++){
                int profit = prices[j]-prices[i];
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;

    }

    /**
     * 1次遍历
     *
     */
    public int maxProfit2(int[] prices){
        int minprice = Integer.MAX_VALUE;
        int maxProfit =0;
        for (int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice = prices[i];
            }
            else if(prices[i]-minprice>maxProfit){
                maxProfit = prices[i]- minprice;
            }
        }
        return maxProfit;
    }
}
