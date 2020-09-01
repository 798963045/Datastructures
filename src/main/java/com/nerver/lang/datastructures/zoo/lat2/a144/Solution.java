package com.nerver.lang.datastructures.zoo.lat2.a144;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<Integer> preorderTravelsal(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if(root==null){
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if(node.right!=null){
                stack.add(node.right);
            }
            if(node.left!=null){
                stack.add(node.left);
            }


        }
        return output;
    }
}
