package com.nerver.lang.datastructures.zoo.lat2.a3;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s){
        int left = 0;
        int right =0;
        int res =0;
        HashMap<Character,Integer> window = new HashMap<>();
        while (right<s.length()){
            char cc = s.charAt(right);
            right++;
            window.put(cc,window.getOrDefault(cc,0)+1);
            while (window.get(cc)>1){
                char d = s.charAt(left);
                left++;
                window.put(d,window.get(d)-1);
            }
            res = Math.max(res,right-left);
        }
        return res;
    }
}
