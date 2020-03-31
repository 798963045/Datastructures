package com.nerver.lang.datastructures.gk.DynamicProgramming.BestTimeToBuyAndSellStock2122.sencond;

public class Solution3 {
    /**
     * 动态规划
     * 注意两个状态
     *
     * 动态规划可以做状态压缩
     */
    public int maxProfit(int[] prices){
        int len = prices.length;
        if(len<2){
            return 0;
        }
        //0 持有现金
        // 1 持有股票
        //状态转移 0->1->0->1->0
        int[][] dp = new int[len][2];

        dp[0][0] =0;
        dp[0][1] = -prices[0];

        for (int i =1;i<len;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }

        return dp[len-1][0];
    }

    /**
     * 数组分开写法
     */
    public int maxProfit3(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }

        // cash：持有现金
        // hold：持有股票
        // 状态数组
        // 状态转移：cash → hold → cash → hold → cash → hold → cash
        int[] cash = new int[len];
        int[] hold = new int[len];

        cash[0] = 0;
        hold[0] = -prices[0];

        for (int i = 1; i < len; i++) {
            // 这两行调换顺序也是可以的
            cash[i] = Math.max(cash[i - 1], hold[i - 1] + prices[i]);
            hold[i] = Math.max(hold[i - 1], cash[i - 1] - prices[i]);
        }
        return cash[len - 1];
    }



    /**
     * 状态压缩写法
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }

        // cash：持有现金
        // hold：持有股票
        // 状态转移：cash → hold → cash → hold → cash → hold → cash

        int cash = 0;
        int hold = -prices[0];

        int preCash = cash;
        int preHold = hold;
        for (int i = 1; i < len; i++) {
            cash = Math.max(preCash, preHold + prices[i]);
            hold = Math.max(preHold, preCash - prices[i]);

            preCash = cash;
            preHold = hold;
        }
        return cash;
    }

}
