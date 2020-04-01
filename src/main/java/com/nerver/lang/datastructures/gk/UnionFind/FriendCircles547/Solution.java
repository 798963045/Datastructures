package com.nerver.lang.datastructures.gk.UnionFind.FriendCircles547;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     * Input:
     * [[1,1,0],
     *  [1,1,1],
     *  [0,1,1]]
     * Output: 1
     */

    /**
     * 深度优先搜索DFS
     * @param M
     * @return
     */
    public int findCircleNum(int[][] M){
        int[] visited = new int[M.length];
        int count =0;
        for (int i=0;i<M.length;i++){
            if(visited[i]==0){
                dfs(M,visited,i);
            }
        }
        return count;
    }

    public void dfs(int[][] M,int[] visited,int i){
        for (int j=0;j<M.length;j++){
            if(M[i][j]==1&&visited[j]==0){
                visited[j]=1;
                dfs(M,visited,j);
            }


        }


    }


    /**
     * 广度优先搜索
     */

    public int findCircleNum2(int[][] M){
        int[] visited = new int[M.length];
        int count =0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i =0;i<M.length;i++){
            if(visited[i]==0){
                queue.add(i);
                while (!queue.isEmpty()){
                    int s= queue.remove();
                    visited[s] =1;
                    for (int j =0;j<M.length;j++){
                        if(M[s][j]==1&&visited[j]==0){
                            queue.add(j);
                        }
                    }
                }
                count++;
            }

        }
        return count;
    }
}
