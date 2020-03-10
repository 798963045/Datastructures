package com.nerver.lang.datastructures.gk.ValidParentheses;

import java.util.Stack;

public class Solution {


    public boolean isValid(String s) {
        if(s.equals("")){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        if(chars.length%2>0){
            return false;
        }
        if(chars[0]==')'||chars[0]==']'||chars[0]=='}')
            return false;

        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('||chars[i]=='['||chars[i]=='{'){
                stack.push(chars[i]);
            }else{
                if(chars[i]==')'){
                    if(stack.pop() == '('){
                        continue;
                    }else {
                        return false;
                    }
                }

                if(chars[i]==']'){
                    if(stack.pop() == '['){
                        continue;
                    }else {
                        return false;
                    }
                }

                if(chars[i]=='}'){
                    if(stack.pop() == '{'){
                        continue;
                    }else {
                        return false;
                    }
                }

            }

        }
        if(stack.empty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution temp = new Solution();
        System.out.println(temp.isValid(""));
        System.out.println(temp.isValid("()"));
        System.out.println(temp.isValid("()[]{}"));
        System.out.println(temp.isValid("(]"));
        System.out.println(temp.isValid("([)]"));
    }



}
