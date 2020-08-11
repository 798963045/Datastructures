package com.nerver.lang.datastructures.zoo.lat.wordBreak139;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            Set<String> wordDictSet = new HashSet(wordDict);
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true;
            for (int i = 1; i <= s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[s.length()];
        }

    public static void main(String[] args) {
        String s="leetcode";
        String w1="leet";
        String w2="code";
        List<String> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        Solution solution = new Solution();
        solution.wordBreak(s,list);
        System.out.println("ssss");
    }
}
