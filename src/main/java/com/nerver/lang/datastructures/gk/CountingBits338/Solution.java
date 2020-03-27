package com.nerver.lang.datastructures.gk.CountingBits338;

public class Solution {

    /*
      解法1 统计每个数字1的个数 汇总

      解法2 动态规划
       1.最高有效位
       2.最低有效位
       3.最后设置位
       https://leetcode-cn.com/problems/counting-bits/solution/bi-te-wei-ji-shu-by-leetcode/
     */
    public int[] countBits(int num){
        int[] ans = new int[num+1];
        for (int i=0;i<=num;++i){
            ans[i] = popcount(i);
        }
        return ans;
    }

    private int popcount(int x){
        int count;
        for (count =0;x!=0;++count){
            x&=x-1;
        }
        return count;
    }
}
