package com.nerver.lang.datastructures.gk.DynamicProgramming.LongestIncreasingSubsequence300;

public class Solution {
    /**
     *
     * Input: [10,9,2,5,3,7,101,18]
     * Output: 4
     * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums){
        if(nums.length ==0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0]=1;
        int maxans =1;
        for (int i =1;i<dp.length;i++){
            int maxval =0;
            for (int j =0;j<i;j++){
                if(nums[i]>nums[j]){
                    maxval = Math.max(maxval,dp[j]);
                }
            }
            dp[i] = maxval+1;
            maxans = Math.max(maxans,dp[i]);
        }
        return maxans;
    }
}
