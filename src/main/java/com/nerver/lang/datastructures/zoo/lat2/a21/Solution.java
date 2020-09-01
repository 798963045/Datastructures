package com.nerver.lang.datastructures.zoo.lat2.a21;

public class Solution {
    public int[] exchange(int[] nums){
        int left =0;
        int right = nums.length-1;
        while (left<right){
            if((nums[left]&1)!=0){
                left++;
                continue;
            }
            if((nums[right]&1)!=1){
                right--;
                continue;
            }
            swap(nums,left,right);
            left++;
            right--;
        }
        return nums;
    }
    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
