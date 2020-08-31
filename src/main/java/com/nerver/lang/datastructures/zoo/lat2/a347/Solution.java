package com.nerver.lang.datastructures.zoo.lat2.a347;

import java.util.*;

public class Solution {

    public List<Integer> topKFrequent(int[] nums,int k){
        HashMap<Integer,Integer> cout = new HashMap<>();
        for (int n: nums){
            cout.put(n,cout.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2)->cout.get(n2)-cout.get(n1));
        for (int n: cout.keySet()){
            heap.add(n);
        }
        List<Integer> top_k = new LinkedList<>();
        while (!heap.isEmpty()){
            top_k.add(heap.poll());
            if(heap.size()>k) {
                heap.poll();
            }
        }
        Collections.reverse(top_k);
        return top_k;

    }
}
