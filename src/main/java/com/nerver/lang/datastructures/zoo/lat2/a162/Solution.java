package com.nerver.lang.datastructures.zoo.lat2.a162;

public class Solution {
    public int findPeakElement(int[] nums){
        int l =0;
        int r = nums.length-1;
        while (l<r){
            int mid = (l+r)/2;
            if(nums[mid]>nums[mid+1]){
                r = mid;
            }else {
                l = mid+1;
            }

        }
        return l;
    }
}
