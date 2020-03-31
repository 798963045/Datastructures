package com.nerver.lang.datastructures.gk.DynamicProgramming.Triangle120;

import java.util.List;

public class Solution2 {
    int row;
    Integer [][] memo;

    /**
     * 自顶向下，记忆化搜索
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle){
        row = triangle.size();
        memo = new Integer[row][row];
        return helper(0,0,triangle);
    }
    private int helper(int level,int c,List<List<Integer>> triangle){
        if(memo[level][c]!=null){
            return memo[level][c];
        }
        if(level == row-1){
            return memo[level][c] = triangle.get(level).get(c);
        }
        int left = helper(level+1,c,triangle);
        int right = helper(level+1,c+1,triangle);
        return memo[level][c] = Math.min(left,right) + triangle.get(level).get(c);
    }
}
