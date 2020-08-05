package com.nerver.lang.datastructures.zoo.lat.stock.first121;

public class Solution {
    public int maxProfit(int[] prices){
        if(prices.length<1) return 0;
        int minprice ;
        int maxProfit =0;
        minprice = prices[0];
        for (int i=1;i<prices.length;i++){
            minprice = Math.min(prices[i],minprice);
            int porfit = prices[i]-minprice;
            maxProfit= Math.max(maxProfit,porfit);

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution solution = new Solution();
        solution.maxProfit(prices);
        System.out.println();
    }
}
