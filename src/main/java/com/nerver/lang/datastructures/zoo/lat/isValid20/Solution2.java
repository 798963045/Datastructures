package com.nerver.lang.datastructures.zoo.lat.isValid20;

import java.util.*;

class Solution2 {

    private HashMap<Character,Character> mappings;
    public Solution2(){
        this.mappings= new HashMap<>();
        this.mappings.put(')','(');
        this.mappings.put(']','[');
        this.mappings.put('}','{');

    }
    public boolean isValid(String s){
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
}

