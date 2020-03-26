package com.nerver.lang.datastructures.gk.Sqrt69;

public class Solution {


    /**
     * 牛顿迭代法 公式
     * https://leetcode-cn.com/problems/sqrtx/solution/x-de-ping-fang-gen-by-leetcode/
     * @param x
     * @return
     */
    public int mySqrt4(int x){
        if(x<2) return x;
        double x0=x;
        double x1 = (x0+x/x0)/2.0;
        while (Math.abs(x0-x1)>=1){
            x0 =x1;
            x1 = (x0+x/x0)/2.0;
        }
        return (int)x1;
    }

    /**
     * 递归+位运算
     * logn
     */
    public int mySqrt3(int x){
        if(x<2) return x;
        int left = mySqrt(x>>2)<<1;
        int rigth = left+1;
        return (long)rigth*rigth>x?left:rigth;

    }

    /**
     * 二分查找
     * time complexity o(logN)
     * space comlexity o(1)
     *
     * @param x
     * @return
     */
    public int mySqrt2(int x){
        if(x<2) return x;
        long num;
        int pivot ,left =2,right = x/2;
        while (left<=right){
            pivot = left+(right-left)/2;
            num = (long) pivot*pivot;
            if(num>x) {
                right = pivot -1;
            }else if(num<x){
                left = pivot+1;
            }

        }
        return right;
    }


    /**
     * 袖珍计算器算法
     * https://leetcode-cn.com/problems/sqrtx/solution/x-de-ping-fang-gen-by-leetcode/
     * @param x
     * @return
     * o(1)
     * o(1)
     *
     */
    public int mySqrt(int x){
        if(x<2) return x;
        int left = (int)Math.pow(Math.E,0.5*Math.log(x));
        int right = left+1;
        return (long)right*right>x?left:right;
    }
}
