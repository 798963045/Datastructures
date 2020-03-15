package com.nerver.lang.datastructures.gk.ValidateBinarySearchTree98;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Solution2 {

    //递归，注意上下边界
    public boolean helper(TreeNode node,Integer lower,Integer upper){
        if(node == null) return true;
        int val = node.val;
        if(lower != null&&val<=lower) return false;
        if(upper!=null&&val>=upper) return false;

        if(!helper(node.right,val,upper)) return false;
        if(!helper(node.left,lower,val)) return false;
        return true;

    }

    public boolean isValidBST(TreeNode root){
        return helper(root,null,null);
    }

    public static void main(String[] args) {
        TreeNode node5root = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(7);
        node5root.left = node1;
        node5root.right = node4;
        node4.left = node3;
        node4.right = node6;

        System.out.println();
        System.out.println(new Solution2().isValidBST(node5root));
        System.out.println();
    }
}
