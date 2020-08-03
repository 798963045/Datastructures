package com.nerver.lang.datastructures.zoo.lat.threeSum15;





import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums ,int target){

        List<List<Integer>> finresult = new ArrayList<>();
        Arrays.sort(nums);
        for (int i =0;i<nums.length;i++){
            int expect=target-nums[i];
            twoSum(nums,expect,nums[i],finresult,i+1);
            while (i<nums.length-1&&nums[i]==nums[i+1]){
             i++;
            }
            System.out.println("aaaaa"+i);

        }
        return finresult;
    }

    public void twoSum(int[] nums,int target,int first,List<List<Integer>> finresult,int start){
        int lo=start;
        int hi=nums.length-1;
        while (lo<hi){
            int temp = nums[lo]+nums[hi];
            int left= nums[lo];
            int right=nums[hi];
            if(temp==target){
                List<Integer> tempres= new ArrayList<>();
                tempres.add(first);
                tempres.add(nums[lo]);
                tempres.add(nums[hi]);
                finresult.add(tempres);
                while (lo<hi&&nums[lo]==left) {
                    lo++;
                }
                while (lo<hi&&nums[hi]==right){
                    hi--;
                }
            }else if(temp >target){
                while (lo<hi&&nums[hi]==right) hi--;
            }else if(temp<target){
                while (lo<hi&&nums[lo]==left) lo++;
            }

        }

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums={-1,0,1,2,-1,-4};
        solution.threeSum(nums,0);

        System.out.println("aaa");

    }

}
