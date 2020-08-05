package com.nerver.lang.datastructures.zoo.lat.isValid20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s){
        if(s=="") return true;
        if(s.length()==1){
            return false;
        }
        int len = s.length();
        Stack<Character> stack = new Stack();
        for (int i=0;i<len;i++){
            char temp = s.charAt(i);
            if(temp=='('||temp=='['||temp=='{'){
                stack.push(temp);
            }
            if(temp==')'||temp==']'||temp=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                char temp2 = stack.pop();
                if(temp==')'&&temp2=='('){
                    continue;
                }
                if(temp==']'&&temp2=='['){
                    continue;
                }
                if(temp=='}'&&temp2=='{'){
                    continue;
                }
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid(""));
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("{[]}"));

        System.out.println();

    }



}
