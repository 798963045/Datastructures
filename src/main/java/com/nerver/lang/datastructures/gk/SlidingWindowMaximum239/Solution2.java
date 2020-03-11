package com.nerver.lang.datastructures.gk.SlidingWindowMaximum239;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    ArrayDeque<Integer> deq = new ArrayDeque<>();
    int[] nums;

    public void clean_deque(int i, int k){
        if(!deq.isEmpty()&&deq.getFirst() == i-k){
            deq.removeFirst();
        }
        while (!deq.isEmpty()&&nums[i]>nums[deq.getLast()])
            deq.removeLast();
    }

    public int[] maxSlidingWindow(int[] nums,int k){
        int n = nums.length;
        if(n*k==0) return new int[0];
        if(k==1) return nums;

        this.nums = nums;
        int max_idx = 0;
        for(int i= 0;i<k;i++){
            clean_deque(i,k);
            deq.addLast(i);
            if(nums[i]>nums[max_idx]) max_idx =i;
        }

        int[] output = new int[n-k+1];
        output[0] = nums[max_idx];

        for (int i=k;i<n;i++){
            clean_deque(i,k);
            deq.addLast(i);
            output[i-k+1] = nums[deq.getFirst()];
        }
        return output;

    }

    public static void main(String[] args) {
        int[] temp = {1,3,-1,-3,5,3,6,7};
        Solution2 solution = new Solution2();
        int[] result = solution.maxSlidingWindow(temp,3);
        List<Integer> oo = new ArrayList<>();
        oo.add(1);
        oo.add(2);
        System.out.println(result.toString());
        System.out.println(oo);
        System.out.println(temp);
        System.out.println(Arrays.asList(temp));
    }
}
