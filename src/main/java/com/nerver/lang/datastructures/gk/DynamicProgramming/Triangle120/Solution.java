package com.nerver.lang.datastructures.gk.DynamicProgramming.Triangle120;

import java.util.List;

public class Solution {

    /**
     * [
     *      [2],
     *     [3,4],
     *    [6,5,7],
     *   [4,1,8,3]
     * ]
     * @param triangle
     * @return
     */
    int row;

    /**
     * 递归，自顶向下
     * @param triangle
     * @return
     */
    public int miniumTotal(List<List<Integer>> triangle){
     row = triangle.size();
     return helper(0,0,triangle);
    }
    private int helper(int level,int c,List<List<Integer>> triangle){
        if(level == row-1){
            return triangle.get(level).get(c);
        }
        int left = helper(level+1,c,triangle);
        int right = helper(level+1,c+1,triangle);
        return Math.min(left,right)+triangle.get(level).get(c);
    }
}
