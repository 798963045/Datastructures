package com.nerver.lang.datastructures.zoo.lat2.a48;

public class Solution {
    public void rotate(int[][] matrix){
        int n = matrix.length;

        for (int i=0;i<n;i++){
            for (int j=i;j<n;i++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j]= temp;
            }

        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] =temp;
            }
        }
    }
}
