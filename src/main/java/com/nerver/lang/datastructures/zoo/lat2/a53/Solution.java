package com.nerver.lang.datastructures.zoo.lat2.a53;

public class Solution {
    public int MaxSubArray(int[] nums){
        int pre = 0;
        int maxAns = nums[0];
        for (int x:nums){
            pre = Math.max(pre+x,x);
            maxAns = Math.max(maxAns,pre);
        }
        return maxAns;
    }
}
