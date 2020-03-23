package com.nerver.lang.datastructures.gk.MajorityElement169;

import java.util.Random;

public class Solution3 {
    private int randRange(Random rand,int min,int max){
        return rand.nextInt(max-min)+min;
    }

    private int countOccurences(int[] nums,int num){
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }

    /**
     * time complexity o(n)
     * space comlexity o(1)
     * @param nums
     * @return
     */

    public int majorityElment(int[] nums){
        Random rand = new Random();
        int majorityCount = nums.length/2;
        while (true){
            int candidate = nums[randRange(rand,0,nums.length)];
            if(countOccurences(nums,candidate)>majorityCount){
                return candidate;
            }
        }

    }
}
