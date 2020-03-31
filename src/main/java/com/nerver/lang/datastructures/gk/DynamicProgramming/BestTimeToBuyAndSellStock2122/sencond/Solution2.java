package com.nerver.lang.datastructures.gk.DynamicProgramming.BestTimeToBuyAndSellStock2122.sencond;

public class Solution2 {
    /**
     * 贪心算法
     */
    public int maxProfit(int[] prices){
        int res = 0;
        int len = prices.length;
        for (int i=0;i<len-1;i++){
            int diff = prices[i+1]-prices[i];
            if(diff>0){
                res+=diff;
            }
        }
        return res;
    }


}
