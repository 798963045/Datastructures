package com.nerver.lang.datastructures.gk.GenerateParentheses22;

import java.util.ArrayList;
import java.util.List;

public class Soltuion {
    /**
     * o(2^2n *n )
     * o(2^2n *n )
     * 注意递归写法
     * @param n
     * @return
     */
    public List<String> generateParentesis(int n){
        List<String> combinations = new ArrayList<>();
        generateAll(new char[2*n],0,combinations);
        return combinations;
    }
    public void generateAll(char[] current,int pos,List<String> result){
        if(pos == current.length){
            if(valid(current)){
                result.add(new String(current));
            }
        }else {
            current[pos] ='(';
            generateAll(current,pos+1,result);
            current[pos] =')';
            generateAll(current,pos+1,result);
        }
    }

    public boolean valid(char[] current){
        int balance = 0;
        for (char c: current){
            if(c == '(') balance++;
            else balance--;
            if(balance<0) return false;
        }
        return (balance==0);
    }
}
