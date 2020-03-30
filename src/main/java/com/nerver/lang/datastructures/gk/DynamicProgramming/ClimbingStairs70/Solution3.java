package com.nerver.lang.datastructures.gk.DynamicProgramming.ClimbingStairs70;

public class Solution3 {

    /**
     * 解法3 Binets 方法 矩阵相乘 https://leetcode-cn.com/problems/climbing-stairs/solution/pa-lou-ti-by-leetcode/
     * 解法4 斐波那契公式
     */
    public int climbStairs5(int n){
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/5,n+1);
        return (int)(fibn/sqrt5);
    }

    /**
     * 动态规划
     * 初始化数组为n+1是为了直接和坐标对上
     * time complexity o(n)
     * space complexity o(n)
     * @param n
     * @return
     */
    public int climbStairs(int n){
        if(n==1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] =2;
        for (int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    /**
     * 斐波那契数
     * time complexity o(n)
     * space compleixty o(1)
     */
    public int climbStairs2(int n){
        if(n==1){
            return 1;
        }
        int first =1;
        int second =2;
        for (int i=3;i<=n;i++){
            int third = first+second;
            first = second;
            second = third;
        }
        return second;
    }


}
