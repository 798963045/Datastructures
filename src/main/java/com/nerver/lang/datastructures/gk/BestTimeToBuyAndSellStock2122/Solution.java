package com.nerver.lang.datastructures.gk.BestTimeToBuyAndSellStock2122;

import com.sun.org.apache.regexp.internal.RE;

public class Solution {

    /**
     * Input: [7,1,5,3,6,4]
     * Output: 7
     * 暴力法
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices){
        return calculate(prices,0);
    }

    public int calculate(int prices[],int s){
        if(s>=prices.length){
            return 0 ;
        }
        int max = 0;
        for (int start = s; start<prices.length;start++){
            int maxprofit= 0;
            for (int i = start+1;i<prices.length;i++){
                if(prices[start]<prices[i]){
                    int profit = calculate(prices,i+1)+prices[i]-prices[start];
                    if(profit>maxprofit){
                        maxprofit = profit;
                    }
                }
            }
            if(maxprofit>max)
                max = maxprofit;


        }
        return max;
    }

}