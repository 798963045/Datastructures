package com.nerver.lang.datastructures.gk.DynamicProgramming.BestTimeToBuyAndSellStock2122.sencond;


/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/solution/tan-xin-suan-fa-by-liweiwei1419-2/
 */
public class Solution {
    private int res;

    /**
     * 暴力搜索
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices){
        int len = prices.length;
        if(len<2){
            return 0;
        }
        this.res = 0;
        dfs(prices,0,len,0,res);
        return this.res;
    }

    private void dfs(int[] prices,int index,int len,int status,int profit){
        if(index == len){
            this.res = Math.max(this.res,profit);
            return;
        }
        dfs(prices,index+1,len,status,profit);
        if(status==0){
            dfs(prices,index+1,len,1,profit-prices[index]);
        }else {
            dfs(prices,index+1,len,0,profit+prices[index]);
        }

    }

    public static void main(String[] args) {
        int[] test = new int[]{7,1,5,3,6,4};
        System.out.println();
        System.out.println(new Solution().maxProfit(test));
        System.out.println();
    }

}
