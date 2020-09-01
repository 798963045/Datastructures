package com.nerver.lang.datastructures.zoo.lat2.a103;

import com.nerver.lang.datastructures.gk.common.ListNode;
import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> results = new ArrayList<>();
        LinkedList<TreeNode> node_queue = new LinkedList<>();
        node_queue.addLast(root);
        node_queue.addLast(null);
        LinkedList<Integer> level_list = new LinkedList<>();
        boolean is_order_left = true;
        while (node_queue.size()>0){
            TreeNode curr_node= node_queue.pollFirst();
            if(curr_node!=null){
                if(is_order_left)
                    level_list.addLast(curr_node.val);
                else
                    level_list.addFirst(curr_node.val);
                if(curr_node.left!=null){
                    node_queue.addLast(curr_node.left);
                }
                if(curr_node.right!=null){
                    node_queue.addLast(curr_node.right);
                }
            }else {
                results.add(level_list);
                level_list = new LinkedList<>();
                if(node_queue.size()>0){
                    node_queue.addLast(null);
                }
                is_order_left = ! is_order_left;
            }


        }

        return results;
    }
}
