package com.nerver.lang.datastructures.gk.ValidateBinarySearchTree98;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution4 {

    public boolean isValidBST(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<>();
        double inorder = Double.MIN_VALUE;
        while (!stack.isEmpty()||root!=null){
            while (root!=null){
                stack.add(root);
                root = root.left;
            }
            root = stack.pollLast();
            if(root.val<=inorder) return false;
            inorder = root.val;
            root = root.right;

        }

        return true;
    }

    public boolean isValidBST2(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        double inorder = - Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            // If next element in inorder traversal
            // is smaller than the previous one
            // that's not BST.
            if (root.val <= inorder) return false;
            inorder = root.val;
            root = root.right;
        }
        return true;
    }



    public static void main(String[] args) {
        /*LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println();*/

        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        root.left= node1;
        root.right = node2;

        TreeNode root2= new TreeNode(0);
        System.out.println(new Solution4().isValidBST(root2));
        System.out.println();

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.NEGATIVE_INFINITY);
    }

}


