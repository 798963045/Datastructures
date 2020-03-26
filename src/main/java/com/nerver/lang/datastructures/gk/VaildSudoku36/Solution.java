package com.nerver.lang.datastructures.gk.VaildSudoku36;

import java.util.HashMap;

public class Solution {


    /**
     * 数独
     * 解法1
     * 遍历3遍数组 1.判断行 2 判读列 3 判断 9个区域内
     *
     * 解法2
     * 遍历一遍 ，同时检测这3个条件，只要有重复就代表非法
     *
     *  本题优化解法 数组
     *
     *
     * o(1)
     * o(1)
     *
     * 注意给9*9的盒子分区的技巧
     * @param board
     * @return
     */

    public boolean isVaildSoduku(char[][] board){
        //init data
        HashMap<Integer,Integer> [] rows = new HashMap[9];
        HashMap<Integer,Integer> [] colums = new HashMap[9];
        HashMap<Integer,Integer> [] boxes = new HashMap[9];
        for (int i =0;i<9;i++){
            rows[i] = new HashMap<Integer, Integer>();
            colums[i] = new HashMap<Integer, Integer>();
            boxes[i] = new HashMap<Integer, Integer>();
        }
        //validate a board
        for (int i =0;i<9;i++){
            for (int j=0;j<9;j++){
                char num = board[i][j];
                if(num!='.'){
                    int n = (int)num;
                    int box_index = (i/3)*3 + j/3;

                    //keep the current cell value
                    rows[i].put(n,rows[i].getOrDefault(n,0)+1);
                    colums[j].put(n,colums[j].getOrDefault(n,0)+1);
                    boxes[box_index].put(n,boxes[box_index].getOrDefault(n,0)+1);
                    //check if this value has been already seen before
                    if(rows[i].get(n)>1||colums[j].get(n)>1||boxes[box_index].get(n)>1){
                        return false;
                    }

                }
            }

        }
        return true;
    }

}
