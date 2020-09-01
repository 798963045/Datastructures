package com.nerver.lang.datastructures.zoo.lat2.a104;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight =  maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
