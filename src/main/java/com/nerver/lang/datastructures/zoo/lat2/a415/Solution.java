package com.nerver.lang.datastructures.zoo.lat2.a415;

public class Solution {

    public String add(String num1,String num2){
        int i = num1.length()-1;
        int j = num2.length()-1;
        int add =0;
        StringBuilder ans = new StringBuilder();
        while (i>=0||j>=0||add!=0){
            int x = i >=0 ? num1.charAt(i)-'0':0;
            int y = j >=0 ? num2.charAt(j)-'0':0;
            int result = x + y +add;
            ans.append(result%10);
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = new String();
    }

}
