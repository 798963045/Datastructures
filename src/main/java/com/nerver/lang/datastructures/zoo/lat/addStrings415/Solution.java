package com.nerver.lang.datastructures.zoo.lat.addStrings415;

public class Solution {


    public String addStrings2(String num1, String num2){
        int i = num1.length()-1;
        int j = num2.length()-1;
        int add = 0;
        StringBuilder ans = new StringBuilder();
        while (i>=0||j>=0||add!=0){
            int x = i>=0?num1.charAt(i)-'0':0;
            int y = j>=0?num2.charAt(j)-'0':0;
            int result = x + y + add;
            ans.append(result%10);
            add = result/10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }

    /**
     * 113
     * 419
     * @param num1
     * @param num2
     * @return
     */

    public String addStrings(String num1,String num2){

        //进位
        int forward = 0;
        int len = num1.length()>num2.length()?num2.length():num1.length();
        int df = Math.abs(num1.length()-num2.length());

        int num1Right = num1.length()-1;
        int num2Right = num2.length()-1;
        StringBuilder res = new StringBuilder();

        for (int i=0;i<len;i++){
            int  temp = (num1.charAt(num1Right)-'0')+(num2.charAt(num2Right)-'0')+forward;
            if(temp>=10){
                forward =1;
                res.append(temp-10);
            }else {
                forward = 0;
                res.append(temp);
            }
            num1Right--;
            num2Right--;
        }
        if(num1Right!=-1){
            for (int i=num1Right;i>=0;i--){
                int temp = (num1.charAt(i)-'0')+forward;
                if(temp>=10){
                    forward =1;
                    res.append(temp-10);
                }else {
                    forward = 0;
                    res.append(temp);
                }
            }
            num1Right=-1;
        }

        if(num2Right!=-1){
            for (int i=num2Right;i>=0;i--){
                int temp = (num2.charAt(i)-'0')+forward;
                if(temp>=10){
                    forward =1;
                    res.append(temp-10);
                }else {
                    forward = 0;
                    res.append(temp);
                }
            }
            num2Right=-1;
        }
        if(num1Right==-1&&num2Right==-1){
            if(forward!=0){
                res.append(1);
            }
        }
        String tt = res.reverse().toString();
        return tt;
    }

    public static void main(String[] args) {
        String num1="99";
        String num2="99";
        Solution solution = new Solution();
        solution.addStrings("9133","0");
        solution.addStrings("9","99");
        solution.addStrings(num1,num2);
        solution.addStrings("0","0");
        solution.addStrings("0","9");
        solution.addStrings("12","1");
        solution.addStrings("12","9");

        System.out.println(9/10);

        System.out.printf("");
    }
}
