package com.nerver.lang.datastructures.zoo.lat2.a129;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Solution {
    public int sumNumbers(TreeNode root){
        return heper(root,0);
    }

    private int heper(TreeNode root, int i) {
        if(root==null) return 0;
        int temp = i*10+root.val;
        if(root.left==null&&root.right==null){
            return temp;
        }
        return heper(root.left,temp)+heper(root.right,temp);
    }
}
