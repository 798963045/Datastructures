package com.nerver.lang.datastructures.gk.MaximumSubarray53;

public class Solution3 {

    /**
     * time complexity o(n)
     * space complexity o1
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums){
        int n = nums.length, maxSum = nums[0];
        for (int i= 1;i<n;++i){
            if(nums[i-1]>0) nums[i] += nums[i-1];
            maxSum = Math.max(nums[i],maxSum);
        }
        return maxSum;
    }
}
