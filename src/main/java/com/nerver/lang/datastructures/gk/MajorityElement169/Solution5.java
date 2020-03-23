package com.nerver.lang.datastructures.gk.MajorityElement169;

public class Solution5 {

    /**
     * time compleixty o(n)
     * space complexity o(1)
     * Boyer-Moore 算法
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums){
        int count = 0;
        Integer candidate = null;
        for (int num :nums){
            if(count==0){
                candidate = num;
            }
            count += (num == candidate)?1:-1;
        }
        return candidate;
    }
}
