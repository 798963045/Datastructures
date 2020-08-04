package com.nerver.lang.datastructures.zoo.lat.maxSubArray53;

import java.util.Arrays;

public class Solution {
    public int maxSubArray(int[] nums){

        if(nums==null){
            return 0;
        }

        int ans = Integer.MIN_VALUE;
        Integer fi =Integer.MIN_VALUE;


        for (int i=0;i<nums.length;i++){
            if(i ==0){
                fi = nums[0];
                ans = nums[0];
                continue;

            }


            if(fi< 0){
                ans = Math.max(ans,nums[i]);
                fi = nums[i];
            }else {
                fi = fi+nums[i];
                ans = Math.max(ans,fi);
            }

        }

        return ans;
    }


    //动态规划
    // 定义好 dp代表什么意思
    //dp[i] 代表以num[i]结尾的最大连续和
    //dp[i]=max(dp[i-1]+num[i],num[i]);
    //[-2,1,-3,4,-1,2,1,-5,4]
    // -2,1,-2,4,3,5,6,1,5


    public int maxSubArray2(int[] nums){

        int[] temp = new int[nums.length];
        //Arrays.fill(temp,-1);

        if(nums.length==0){
            return 0;
        }

        int first = nums[0];
        int ans = first;
        int result = first;

        for (int i=1;i<nums.length;i++){

            ans = Math.max(first+nums[i],nums[i]);

            first = ans;

            result = Math.max(ans,result);

        }
        return result;

    }



    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        solution.maxSubArray2(nums);
        System.out.println();
    }

}
