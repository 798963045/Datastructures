package com.nerver.lang.datastructures.zoo.lat2.a33;

public class Solution {
    public int search(int[] nums,int target){
        int lo=0;
        int hi = nums.length-1;
        int mid =0;
        while (lo<=hi){
            mid = lo+(hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[lo]){
                if(target>=nums[lo]&&target<nums[mid]){
                    hi = mid-1;
                }else {
                    lo = mid+1;
                }
            }else {
                if(target>nums[mid]&&target<=nums[hi]){
                    lo= mid+1;
                }else {
                    hi = mid-1;
                }

            }
        }
        return  -1;
    }
}
