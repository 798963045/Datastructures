package com.nerver.lang.datastructures.gk.BinaryTreeLevelOrderTraversal102;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {

    /**
     * bfs 用队列实现
     * time complexity o(n)
     * space complexity o(1)
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if(root == null) return levels;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){
            levels.add(new ArrayList<>());
            int level_length = queue.size();
            for (int i =0;i<level_length;++i){
                TreeNode node = queue.remove();
                levels.get(level).add(node.val);

                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            level++;

        }

        return levels;
    }
}
