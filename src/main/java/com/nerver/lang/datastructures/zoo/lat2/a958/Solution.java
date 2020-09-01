package com.nerver.lang.datastructures.zoo.lat2.a958;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isCompleteTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode prev = root;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(prev==null&&node!=null){
                return false;
            }
            if(node!=null){
                queue.add(node.left);
                queue.add(node.right);
            }
            prev= node;
        }
        return true;
    }
}
