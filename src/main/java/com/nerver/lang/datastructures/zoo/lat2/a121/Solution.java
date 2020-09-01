package com.nerver.lang.datastructures.zoo.lat2.a121;

public class Solution {
    public int maxProfit(int prices[]){
        int minprices = Integer.MAX_VALUE;
        int maxProfit =0;
        for (int i=0;i<prices.length;i++){
            if(prices[i]<minprices){
                minprices=prices[i];
            }else if (prices[i]-minprices>maxProfit){
                maxProfit = prices[i]-minprices;
            }
        }
        return maxProfit;
    }
}
