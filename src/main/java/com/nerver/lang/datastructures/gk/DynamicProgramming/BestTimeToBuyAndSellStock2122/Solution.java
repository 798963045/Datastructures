package com.nerver.lang.datastructures.gk.DynamicProgramming.BestTimeToBuyAndSellStock2122;

public class Solution {

    public int maxProfit(int[] prices){
        return calculate(prices,0);
    }

    public int calculate(int prices[], int s) {
        if (s >= prices.length)
            return 0;
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if (profit > maxprofit)
                        maxprofit = profit;
                }
            }
            if (maxprofit > max)
                max = maxprofit;
        }
        return max;
    }


    public static void main(String[] args) {
        int[] test = new int[]{7,1,5,3,6,4};
        System.out.println();
        System.out.println(new Solution().maxProfit(test));
        System.out.println();
    }

}
