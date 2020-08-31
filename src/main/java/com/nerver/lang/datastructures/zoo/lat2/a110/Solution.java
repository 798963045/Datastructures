package com.nerver.lang.datastructures.zoo.lat2.a110;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Solution {
    boolean res=true;
    public int depth(TreeNode root){
        if(root == null) return 0;
        int L = depth(root.left);
        int R = depth(root.right);
        if(Math.abs(L-R)>1){
            res = false;
        }
        return Math.max(L,R)+1;
    }
}
