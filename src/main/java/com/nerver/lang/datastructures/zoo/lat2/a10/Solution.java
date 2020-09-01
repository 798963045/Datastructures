package com.nerver.lang.datastructures.zoo.lat2.a10;

public class Solution {
    public int numWays(int n){
        if(n==0||n==1){
            return 1;
        }
        int [] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3;i<=n;i++){
            dp[i] = (dp[i-2]+dp[i-1])%1000000007;
        }
        return dp[n];
    }

    public int numWayss(int n){
        if(n==0||n==1){
            return 1;
        }
        int pre =1;
        int cur =2;
        for (int i=3;i<=n;i++){
            int tmp = (pre+cur)%1000000007;
            pre = cur;
            cur = tmp;
        }
        return cur;
    }
}
