package com.nerver.lang.datastructures.zoo.lat.isCompleteTree958;


import java.util.LinkedList;
import java.util.Queue;

class TreeNN{
    int val;
    TreeNN left;
    TreeNN right;
    public TreeNN(int val){
        this.val= val;
    }
}

 class Solution {


    public boolean isCompleteTree(TreeNN root) {
        Queue<TreeNN> queue = new LinkedList<>();
        TreeNN prev = root;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNN node = queue.remove();
            if (prev == null && node != null)
                return false;
            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
            prev = node;
        }
        return true;
    }
    //1 2 3 4 5 null 7 null null null null

    public static void main(String[] args) {
        TreeNN root = new TreeNN(1);
        TreeNN node2 =new TreeNN(2);
        TreeNN node3 =new TreeNN(3);
        TreeNN node4 =new TreeNN(4);
        TreeNN node5 =new TreeNN(5);
        TreeNN node7 =new TreeNN(7);

        root.left=node2;
        root.left.left=node4;
        root.left.right=node5;
        root.right=node3;
        root.right.right=node7;

        Solution solution = new Solution();
        System.out.println(solution.isCompleteTree(root));
        System.out.println();
    }


}


