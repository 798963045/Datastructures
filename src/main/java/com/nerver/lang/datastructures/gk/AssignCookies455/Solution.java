package com.nerver.lang.datastructures.gk.AssignCookies455;

import java.util.Arrays;

public class Solution {

    /**
     * time complexity o(n)
     * space complexity o(1)
     * @param grid
     * @param size
     * @return
     */
    public int findContentChildren(int[] grid,int[] size){
        if (grid ==null || size ==null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0 , si = 0;
        while (gi<grid.length&&si<size.length){
            if(grid[gi]<=size[si]){
                gi++;
            }
            si++;
        }
        return gi;
    }
}
