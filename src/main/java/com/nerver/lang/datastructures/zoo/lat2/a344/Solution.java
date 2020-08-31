package com.nerver.lang.datastructures.zoo.lat2.a344;

public class Solution {
    public void reverseaString(char[] s){
        int left =0;
        int rigth = s.length-1;
        while (left<rigth){
            char temp = s[left];
            s[left++] = s[rigth];
            s[rigth--] = temp;
        }
    }

    public void helper(char[] s, int left,int right){
        if(left>=right) return;
        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
        helper(s,left,right);
    }
}
