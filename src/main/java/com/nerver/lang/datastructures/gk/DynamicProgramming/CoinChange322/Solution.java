package com.nerver.lang.datastructures.gk.DynamicProgramming.CoinChange322;

public class Solution {

    public int coinChange(int[] coins,int amount){
        return coinChange(0,coins,amount);
    }

    /**
     * [1,2,5]    11
     *
     * 树形
     * 递归
     *
     * @param idxCoin
     * @param conis
     * @param amount
     * @return
     */

    private int coinChange(int idxCoin,int[] conis,int amount){
        if(amount ==0){
            return 0;
        }

        if(idxCoin<conis.length&&amount>0){
            int maxVal = amount /conis[idxCoin];
            int minCost = Integer.MAX_VALUE;
            for (int x =0;x<=maxVal;x++){
                if(amount>=x*conis[idxCoin]){
                    int res = coinChange(idxCoin+1,conis,amount-x*conis[idxCoin]);
                    if(res!=-1){
                        minCost = Math.min(minCost,res+x);
                    }
                }
            }

            return (minCost == Integer.MAX_VALUE)?-1:minCost;

        }

        return -1;

    }
}
