package com.nerver.lang.datastructures.gk.MinimumDepthOfBinaryTree111;

import com.nerver.lang.datastructures.gk.common.TreeNode;
import javafx.util.Pair;

import java.util.LinkedList;

public class Solution {

    /**
     * DFS 递归
     * time complexity o(n)
     * space complexity logn
     * o(n)
     * @param root
     * @return
     */
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if((root.left==null)&&(root.right==null)){
            return 1;
        }
        int min_depth = Integer.MAX_VALUE;
        if(root.left!=null){
            min_depth=Math.min(minDepth(root.left),min_depth);
        }
        if(root.right!=null){
            min_depth = Math.min(minDepth(root.right),min_depth);
        }
        return min_depth+1;
    }

    public int minDepth2(TreeNode root){
        LinkedList<Pair<TreeNode,Integer>> stack = new LinkedList<>();
        if(root ==null){
            return 0;
        }else {
            stack.add(new Pair<>(root,1));
        }
        int min_depth = Integer.MAX_VALUE;
        while (!stack.isEmpty()){
            Pair<TreeNode,Integer> current = stack.pollLast();
            root = current.getKey();
            int current_depth = current.getValue();
            if((root.left==null)&&(root.right==null)){
                min_depth = Math.min(min_depth,current_depth+1);
            }
            if(root.left!=null){
                stack.add(new Pair<>(root.left,current_depth+1));
            }
            if(root.right!=null){
                stack.add(new Pair<>(root.right,current_depth+1));
            }

        }
        return min_depth;
    }

    /**
     * BFS
     * 队列实现
     * o(n)
     * o(n)
     * @param root
     * @return
     */
    public int minDepthBFS(TreeNode root){
        LinkedList<Pair<TreeNode,Integer>> stack = new LinkedList<>();
        if(root == null) return 0;
        else stack.add(new Pair<>(root,1));

        int current_depth=0;
        while (!stack.isEmpty()){
            Pair<TreeNode,Integer> current = stack.poll();
            root = current.getKey();
            current_depth = current.getValue();
            if((root.left==null)&&(root.right==null)){
                break;
            }
            if(root.left!=null){
                stack.add(new Pair<>(root.left,current_depth+1));
            }
            if(root.right!=null){
                stack.add(new Pair<>(root.right,current_depth+1));
            }

        }
        return current_depth;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println();
        System.out.println();
    }

}
