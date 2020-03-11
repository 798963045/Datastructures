package com.nerver.lang.datastructures.gk.ValidAnagram242;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++ ){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i),1);
            }
        }

        for(int i= 0 ;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
                if(map.get(t.charAt(i))<0){
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="";
        String t = "";
        System.out.println(new Solution().isAnagram(s,t));
    }
}
