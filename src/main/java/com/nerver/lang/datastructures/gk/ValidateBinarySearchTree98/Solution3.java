package com.nerver.lang.datastructures.gk.ValidateBinarySearchTree98;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution3 {


    LinkedList<TreeNode> stack = new LinkedList();
    LinkedList<Integer> uppers = new LinkedList(),
            lowers = new LinkedList();


    //注意linkedlist的不同，该深度优先遍历有点像广度优先遍历
    public void update(TreeNode root, Integer lower, Integer upper) {
        stack.add(root);
        lowers.add(lower);
        uppers.add(upper);
    }

    public boolean isValidBST(TreeNode root) {
        Integer lower = null, upper = null, val;
        update(root, lower, upper);

        while (!stack.isEmpty()) {
            root = stack.poll();
            lower = lowers.poll();
            upper = uppers.poll();

            if (root == null) continue;
            val = root.val;
            if (lower != null && val <= lower) return false;
            if (upper != null && val >= upper) return false;
            update(root.right, val, upper);
            update(root.left, lower, val);
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode node5root = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(10);
        TreeNode node3 = new TreeNode(9);
        TreeNode node6 = new TreeNode(12);
        node5root.left = node1;
        node5root.right = node4;
        node4.left = node3;
        node4.right = node6;
        TreeNode node12 = new TreeNode(13);
        node6.right= node12;

        System.out.println();
        System.out.println(new Solution3().isValidBST(node5root));
        System.out.println();

        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println();
        System.out.println();
    }


}
