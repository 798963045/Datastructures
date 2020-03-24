package com.nerver.lang.datastructures.gk.MaximumDepthOfBinaryTree104;

import com.nerver.lang.datastructures.gk.common.TreeNode;
import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     * 递归 DFS
     * time complexity o(n)
     * space complexity
     * o(n)极端情况下
     * 树完全平衡log(n)
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root){
        if(root ==null){
            return 0;
        }else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return Math.max(left_height,right_height)+1;
        }
    }

    /**
     *  DFS 迭代版本 用堆栈
     *  time complexity o(n)
     *  space complexity o(n)
     * @param root
     * @return
     */
    public int maxDepth2(TreeNode root){
        Queue<Pair<TreeNode,Integer>> stack = new LinkedList<>();
        if(root!=null){
            stack.add(new Pair<>(root,1));
        }
        int depth = 0;
        while (!stack.isEmpty()){
            Pair<TreeNode,Integer> current = stack.poll();
            root = current.getKey();
            int current_depth = current.getValue();
            if(root!=null){
                depth = Math.max(depth,current_depth);
                stack.add(new Pair<>(root.left,current_depth+1));
                stack.add(new Pair<>(root.right,current_depth+1));
            }

        }
        return depth;
    }



}
