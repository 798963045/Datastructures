package com.nerver.lang.datastructures.gk.FourSum18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> list = new LinkedList<>();
        int len = nums.length;
        if(nums == null|| len <4) return list;
        Arrays.sort(nums);
        if(4*nums[len-1]<target) return list;
        if(4*nums[0]>target) return list;

        for(int i=0 ;i< len-3;i++){
            for(int j = i+1 ;j <len- 2 ;j++){
                int k = j+1;
                int t = len-1;
                while (k<t){
                    if(nums[i]+nums[j]+nums[k]+nums[t]==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[t]));
                        while (i<len-3&&nums[i]==nums[i+1]) i++;
                        while (j<len-2&&nums[j]==nums[j+1]) j++;
                        while (k<t&&nums[k] == nums[k+1]) k++;
                        while (k<t&&nums[t] == nums[t-1]) t--;
                        k++;
                        t--;
                    }else if(nums[i]+nums[j]+nums[k]+nums[t]>target) t--;
                    else k++;
                }
            }
        }
        return list;
    }
}
