package com.nerver.lang.datastructures.gk.DynamicProgramming.EditDistance72;

public class Solution {

    /**
     * 编辑距离 常用于统计两个字符串单词之间的距离
     * 编辑距离算法被数据科学家广泛应用，是用作机器翻译和语音识别评价标准的基本算法。
     *
     * 最简单的方法是检查所有可能的编辑序列，从中找出最短的一条。但这个序列总数可能达到指数级，但完全不需要这么多，因为我们只要找到距离最短的那条而不是所有可能的序列。
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/edit-distance/solution/bian-ji-ju-chi-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param word1
     * @param word2
     * @return
     */
    public int minDistance(String word1,String word2){
        int n  =word1.length();
        int m = word2.length();
        //if one of the string is empty
        if(n*m==0){
            return n+m;
        }
        //array to store the convertion historty
        int [][] d = new int[n+1][m+1];
        //init boundaries
        for (int i =0;i<n+1;i++){
            d[i][0] =i;
        }
        for (int j= 0;j<m+1;j++){
            d[0][j] = j;
        }
        //DP compute
        for (int i =1;i<n+1;i++){
            for (int j=1;j<m+1;j++){
                int left = d[i-1][j+1] +1;
                int down = d[i][j-1]+1;
                int left_down = d[i-1][j-1];
                if (word1.charAt(i-1)!=word2.charAt(j-1)){
                    left_down+=1;
                }
                d[i][j] = Math.min(left,Math.min(down,left_down));

            }


        }
        return d[n][m];
    }
}
