package com.nerver.lang.datastructures.gk.ValidAnagram242;

import java.util.Arrays;

public class Solution2 {


    public boolean isAnanram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }

    public boolean isAnagram2(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[]  counter = new int[52];
        for (int i=0;i<s.length();i++){
            counter[s.charAt(i)-'A']++;
            counter[t.charAt(i)-'A']--;
        }

        for (int count : counter){
            if(count!=0){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram3(String s,String t){
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0 ;i<t.length();i++){
            table[t.charAt(i)-'a']--;
            if(table[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A";
        String t = "a";

        System.out.println(new Solution2().isAnagram2(s,t));
    }

}
