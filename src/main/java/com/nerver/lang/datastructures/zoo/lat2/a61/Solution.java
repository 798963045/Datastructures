package com.nerver.lang.datastructures.zoo.lat2.a61;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isStraight(int[] nums){
        Set<Integer> repeat = new HashSet<>();
        int max =0;
        int min = 14;

        for (int num:nums){
            if(num==0) continue;

            max = Math.max(max,num);
            min = Math.min(min,num);
            if(repeat.contains(num)) return false;
            repeat.add(num);

        }
        return max-min<5;
    }
}
