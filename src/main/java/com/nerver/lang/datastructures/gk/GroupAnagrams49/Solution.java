package com.nerver.lang.datastructures.gk.GroupAnagrams49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        int[] visited = new int[strs.length];
        int count = strs.length;
        List<List<String>> ans = new ArrayList<>();
        while (count>0){
            int temp = getNext(visited);
            List<String> tt = new ArrayList<>();
            if(visited[temp]==0){
                count--;
                visited[temp] = -1;

                String ff = strs[temp];
                tt.add(ff);
                for(int j = getNext(visited);j<strs.length&&j>-1;j++){
                    if(visited[j]==0&&isAnagram(ff,strs[j])){
                        tt.add(strs[j]);
                        visited[j]=-1;
                        count--;
                    }
                }

            }
            ans.add(tt);

        }
        return ans;

    }

    private int getNext(int[] visited){
       for(int i=0;i<visited.length;i++){
           if(visited[i]==0){
               return i;
           }
       }
       return -1;
    }

    private boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        int len = s.length();
        int[] dis = new int[26];
        for(int i = 0;i<len;i++){
            dis[s.charAt(i)-'a']++;
            dis[t.charAt(i)-'a']--;
        }
        for (int temp : dis){
            if(temp<0) return false;
        }
        return true;
    }

    private boolean isAnagram2(String s,String t){
        if(s.length()!=t.length()) return false;
        int len = s.length();

        char[] ss= s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss,tt);
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(new Solution().groupAnagrams(strs));
    }
}
