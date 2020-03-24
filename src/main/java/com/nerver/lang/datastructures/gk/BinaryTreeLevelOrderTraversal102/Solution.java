package com.nerver.lang.datastructures.gk.BinaryTreeLevelOrderTraversal102;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    /**
     * dfs 递归
     * time complexity o(n)
     * space complexity o(n)
     *
     * @param node
     * @param level
     */
    public void helper(TreeNode node ,int level){
        if(levels.size()==level){
            levels.add(new ArrayList<Integer>());
        }
        //fulfil the current level
        levels.get(level).add(node.val);

        //process child nodes for the next level
        if(node.left!=null){
            helper(node.left,level+1);
        }
        if(node.right!=null){
            helper(node.right,level+1);
        }

    }

    public List<List<Integer>> levelOrder(TreeNode root){
        if(root == null) return levels;
        helper(root,0);
        return levels;
    }
}
