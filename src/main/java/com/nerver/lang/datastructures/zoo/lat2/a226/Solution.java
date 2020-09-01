package com.nerver.lang.datastructures.zoo.lat2.a226;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;

    }
}
