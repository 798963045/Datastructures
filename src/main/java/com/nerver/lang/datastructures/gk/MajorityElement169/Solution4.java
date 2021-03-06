package com.nerver.lang.datastructures.gk.MajorityElement169;

public class Solution4 {


    /**
     * time complexity nlogn
     * space complexity logn
     * @param nums
     * @return
     */

    public int majorityElement(int[] nums){
        return majorityElementRec(nums,0,nums.length-1);
    }

    private int majorityElementRec(int[] nums, int lo, int hi) {
        if(lo == hi){
            return nums[lo];
        }

        int mid = (hi-lo)/2+lo;
        int left =  majorityElementRec(nums,lo,mid);
        int right = majorityElementRec(nums,mid+1,hi);
        if(left == right){
            return left;
        }
        int leftCount = countInRange(nums,left,lo,hi);
        int rightCount = countInRange(nums,right,lo,hi);
        return leftCount>rightCount?left:right;

    }

    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i= 0;i<=hi;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }

}
