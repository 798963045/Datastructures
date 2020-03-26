package com.nerver.lang.datastructures.gk.NQueens51;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * 八皇后问题
     * 注意主对角线的 相减可以得到常数constant 但是注意有负数，可以通过加 n-1来处理成为正数
     * 次对角线 相加可以得到常数constant 这个没有负数，可以直接使用
     * queens[]数组可以同时保存行列信息，注意该处理技巧
     * 字符串处理可以用StringBuffer
     * 全局变量可以定义在类的属性上面
     * time comlexity o(N!) 树的展开
     * 空间复杂度o(N)
     */

    private List<List<String>> output = new ArrayList<>();
    //用于标记是否被列方向的皇后被攻击
    int[] rows;
    //用于标记是否被主对角线方向的皇后攻击
    int[] mains;
    //用于标记是否被次对角线方向的皇后攻击
    int[] secondary;
    //用于存储皇后放置的位置
    int[] queens;

    int n;


    private void backtrack(int row){
        if(row>=n) return;

        for (int col = 0;col<n;col++){
            if(isNotUnderAttack(row,col)){
                placeQueen(row,col);
                if(row==n-1) addSolution();
                backtrack(row+1);
                removeQueen(row,col);
            }
        }
    }

    private boolean isNotUnderAttack(int row,int col){
        int res = rows[col] + mains[row-col+n-1] + secondary[row +col];
        return res ==0;
    }
    private void placeQueen(int row,int col){
        queens[row] = col;
        rows[col] = 1;
        mains[row-col+n-1] =1;
        secondary[row+col] =1;
    }

    private void removeQueen(int row,int col){
        queens[row] = 0;
        rows[col] = 0;
        mains[row - col +n -1] = 0;
        secondary[row+col] =0;
    }

    public void  addSolution(){
        List<String> solution = new ArrayList<>();
        for (int i =0;i<n;++i){
            int col =queens[i];
            StringBuffer sb = new StringBuffer();
            for (int j=0;j<col;++j){
                sb.append(".");
            }
            sb.append("Q");
            for (int j= 0;j<n-col-1;++j){
                sb.append(".");
            }
            solution.add(sb.toString());
        }
        output.add(solution);
    }

    public List<List<String>> solveNQueens(int n){
        // 初始化
        rows = new int[n];
        mains = new int[2*n-1];
        secondary = new int[2*n-1];
        queens = new int[n];
        this.n = n;
        backtrack(0);
        return output;
    }



    public static void main(String[] args) {
        int[] temp = new int[3];
        System.out.println(temp);
    }

}
