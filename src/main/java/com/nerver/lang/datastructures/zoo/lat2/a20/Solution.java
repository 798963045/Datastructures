package com.nerver.lang.datastructures.zoo.lat2.a20;

import java.util.HashMap;
import java.util.Random;
import java.util.Stack;

public class Solution {
    HashMap<Character,Character> mappings;
    public Solution(){
        mappings.put(']','[');
        mappings.put(')','(');
        mappings.put('}','{');
    }

    public boolean isVaild(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(this.mappings.containsKey(c)){
                char topElement = stack.empty()?'#':stack.pop();
                if(topElement!=this.mappings.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        double b = Math.random();
        Random random = new Random();
        for (int i =0;i<50;i++){
            //[0.0 - 1.0)
            //System.out.println((int)(Math.random()*100));
            // [0, 99]
            System.out.println(random.nextInt(100)+1);
        }
    }
}
