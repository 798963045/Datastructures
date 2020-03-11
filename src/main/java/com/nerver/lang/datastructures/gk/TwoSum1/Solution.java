package com.nerver.lang.datastructures.gk.TwoSum1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i = 0 ;i<nums.length;i++){
            int temp = target - nums[i];
            if(map.get(temp)!=null&&map.get(temp)!=i){
                return new int[]{i,map.get(temp)};
            }
        }
        return new int[]{};
    }



    public int[] twoSum2(int[] nums,int target){
        for(int i=0;i<nums.length-1;i++){
            for (int j = i+1;j<nums.length;j++ ){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }



    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 0;
        Solution solution = new Solution();
        int[] result = solution.twoSum2(nums,target);
        System.out.println(result);
    }
}
