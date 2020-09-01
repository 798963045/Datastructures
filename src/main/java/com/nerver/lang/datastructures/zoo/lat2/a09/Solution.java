package com.nerver.lang.datastructures.zoo.lat2.a09;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public int deleteHead(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            return -1;
        }else {
            int deleteItem=stack2.pop();
            return deleteItem;
        }

    }
}
