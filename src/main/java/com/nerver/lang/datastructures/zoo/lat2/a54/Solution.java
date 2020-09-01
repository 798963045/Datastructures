package com.nerver.lang.datastructures.zoo.lat2.a54;

import com.nerver.lang.datastructures.gk.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> order = new ArrayList<>();
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return order;
        }
        int rows =matrix.length;
        int columns = matrix[0].length;
        int total = rows*columns;
        boolean[][] visited = new boolean[rows][columns];
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        int directionIndex = 0;
        int row =0;
        int column =0;
        for (int i=0;i<total;i++){
            order.add(matrix[row][column]);
            visited[row][column] = true;
            int nextRow = row+directions[directionIndex][0];
            int nextColumn = column+directions[directionIndex][1];
            if(nextRow<0||nextRow>=rows||nextColumn<0||nextColumn>=columns||visited[nextRow][nextColumn]){
                directionIndex=(directionIndex+1)%4;
            }
            row+=directions[directionIndex][0];
            column+=directions[directionIndex][1];

        }
        return order;
    }
}
