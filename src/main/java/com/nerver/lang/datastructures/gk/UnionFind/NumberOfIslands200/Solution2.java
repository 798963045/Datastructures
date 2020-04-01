package com.nerver.lang.datastructures.gk.UnionFind.NumberOfIslands200;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    /**
     * BFS 广度优先搜素 队列实现
     *
     * //建维处理
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid){
        if(grid==null||grid.length==0){
            return 0;
        }
        int nr =grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r=0;r<nr;++r){
            for (int c =0;c<nc;++c){
                if(grid[r][c]=='1'){
                    ++num_islands;
                    grid[r][c] ='0';
                    Queue<Integer> neighbours = new LinkedList<>();
                    neighbours.add(r*nc+c);
                    while (!neighbours.isEmpty()){
                        int id = neighbours.remove();
                        int row = id/nc;
                        int col = id%c;
                        if(row-1>=0&&grid[row-1][col]=='1'){
                            neighbours.add((row-1)*nc+col);
                            grid[row-1][col]='0';
                        }
                        if(row+1>=0&&grid[row+1][col]=='1'){
                            neighbours.add((row+1)*nc+col);
                            grid[row+1][col]='0';
                        }
                        if(col-1>=0&&grid[row][col-1]=='1'){
                            neighbours.add(row*nc+col-1);
                            grid[row][col-1]='0';
                        }
                        if(col+1>=0&&grid[row][col+1]=='1'){
                            neighbours.add(row*nc+col+1);
                            grid[row][col+1]='0';
                        }

                    }
                }


            }

        }

        return num_islands;

    }

}
