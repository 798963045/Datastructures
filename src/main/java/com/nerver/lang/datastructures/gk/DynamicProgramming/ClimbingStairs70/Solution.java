package com.nerver.lang.datastructures.gk.DynamicProgramming.ClimbingStairs70;

public class Solution {

    /**
     * 暴力法 遍历所有可能的阶段进行组合
     *
     * time complexity 2^n  满二叉树的节点为2^n-1
     * sapce complexity o(n)
     *
     * @param n
     * @return
     */
    public int climbStairs(int n){
      return   climb_Stairs(0,n);
    }
    public int climb_Stairs(int i,int n){
        if(i>n){
            return 0;
        }
        if(i==n){
            return 1;
        }
        return climb_Stairs(i+1,n)+climb_Stairs(i+2,n);
    }
}
