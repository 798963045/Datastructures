package com.nerver.lang.datastructures.gk.MajorityElement169;

import java.util.Arrays;

public class Solution2 {

    /**
     * time complexity nlogn
     * space complexity logn
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}
