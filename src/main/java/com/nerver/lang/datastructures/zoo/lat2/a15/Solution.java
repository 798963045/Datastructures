package com.nerver.lang.datastructures.zoo.lat2.a15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> three(int[] nums,int target){
        List<List<Integer>> finresult = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int expect = target -nums[i];
            two(nums,expect,nums[i],finresult,i+1);
            while(i<nums.length-1&&nums[i]==nums[i+1]){
                i++;
            }
        }
        return finresult;
    }

    public void  two(int[] nums,int expect,int first,List<List<Integer>> finresult,int start ){
        int lo = start;
        int hi = nums.length-1;
        while (lo<hi){
            int temp = nums[lo]+nums[hi];
            int left = nums[lo];
            int right = nums[hi];
            if(temp==expect){
                List<Integer> tempres = new ArrayList<>();
                tempres.add(first);
                tempres.add(nums[lo]);
                tempres.add(nums[hi]);
                while (lo<hi&&nums[lo]==left){
                    lo++;
                }
                while (lo<hi&&nums[hi]==right){
                    hi--;
                }
            }else if(temp>expect){
                while (lo<hi&&nums[hi]==right) hi--;
            }else if(temp<expect){
                while (lo<hi&&nums[lo]==left) lo++;
            }
        }

    }


}
