package com.nerver.lang.datastructures.gk.ValidPerfectSquare367;

public class Solution {


    /**
     * 牛顿迭代法
     * https://leetcode-cn.com/problems/valid-perfect-square/solution/you-xiao-de-wan-quan-ping-fang-shu-by-leetcode/
     * @param num
     * @return
     */
    public boolean isPerfectSquare2(int num){
        if(num<2) return true;
        long x = num/2;
        while (x*x>num){
            x = (x+num/x)/2;
        }
        return (x*x==num);
    }

    /**
     * 二分查找
     * time compleixty ologn
     * o1
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num){
        if(num<2){
            return true;
        }
        long left =2 ,right = num/2, x,guessSquared;
        while (left<=right){
            x = left+(right-left)/2;
            guessSquared = x*x;
            if(guessSquared==num){
                return true;
            }
            if(guessSquared>num){
                right = x-1;
            }else {
                left=x-1;
            }
        }
        return false;

    }
}
