package com.nerver.lang.datastructures.zoo.lat.postorderTraversal145;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.addFirst(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2= new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node2;
        node2.left = node3;
        Solution solution = new Solution();
        solution.postorderTraversal(root);
        LinkedList<Integer> output = new LinkedList<>();
        output.add(1);

    }
}

