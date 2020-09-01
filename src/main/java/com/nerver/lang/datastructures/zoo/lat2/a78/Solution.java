package com.nerver.lang.datastructures.zoo.lat2.a78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> output = new ArrayList<>();
    int n,k;
    public List<List<Integer>> subSets(int[] nums){
        n = nums.length;
        for (k =0;k<n+1;++k){
            backtrack(0,new ArrayList<Integer>(),nums);
        }
        return output;
    }

    private void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        if(curr.size()==k){
            output.add(new ArrayList<>(curr));
        }
        for (int i=first;i<n;++i){
            curr.add(nums[i]);
            backtrack(i+1,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
}
