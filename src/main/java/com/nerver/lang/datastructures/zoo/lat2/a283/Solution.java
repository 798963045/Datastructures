package com.nerver.lang.datastructures.zoo.lat2.a283;

public class Solution {
    public void moveZeroes(int[] nums){

        for (int lastNonZeroFoundAt =0 ,cur =0;cur<nums.length;cur++){

            if(nums[cur]!=0){
                swap(nums,lastNonZeroFoundAt,cur);
                lastNonZeroFoundAt++;
            }

        }


    }

    private void swap(int[] nums, int lastNonZeroFoundAt, int cur) {
        int temp = nums[lastNonZeroFoundAt];
        nums[lastNonZeroFoundAt]= cur;
        cur = temp;
    }
}
