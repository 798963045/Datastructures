package com.nerver.lang.datastructures.gk.DynamicProgramming.Triangle120;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

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
    /**
     * 自底向上 DP动态规划
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle){
        int row = triangle.size();
        int[] minLen = new int[row+1];
        for (int level = row -1;level>=0;level--){
            for (int i=0;i<=level;i++){
                minLen[i] = Math.min(minLen[i],minLen[i+1])+triangle.get(level).get(i);
            }
        }
        return minLen[0];
    }

    public static void main(String[] args) {
        List<Integer> s0 = new ArrayList<>();
        s0.add(2);

        List<Integer> s1 = new ArrayList<>();
        s1.add(3);
        s1.add(4);

        List<Integer> s2 = new ArrayList<>();
        s2.add(6);
        s2.add(5);
        s2.add(7);

        List<Integer> s3 = new ArrayList<>();
        s3.add(4);
        s3.add(1);
        s3.add(8);
        s3.add(3);

        List<List<Integer>> temp = new ArrayList<>();
        temp.add(s0);
        temp.add(s1);
        temp.add(s2);
        temp.add(s3);

        System.out.println(new Solution3().minimumTotal(temp));
        System.out.println();


    }
}
