package com.nerver.lang.datastructures.gk.MaximumSubarray53;

public class Solution2 {
    public int maxSubArray(int[] nums){
        int n = nums.length;
        int cuurrSum = nums[0],maxSum= nums[0];

        for (int i=1;i<n;i++){
            cuurrSum = Math.max(nums[i],cuurrSum+nums[i]);
            maxSum = Math.max(maxSum,cuurrSum);

        }

        return maxSum;

    }
}
