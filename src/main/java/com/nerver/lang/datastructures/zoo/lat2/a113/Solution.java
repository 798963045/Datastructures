package com.nerver.lang.datastructures.zoo.lat2.a113;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        pathSum(root,sum,path,res);
        return res;
    }

    private void pathSum(TreeNode node, int sum, Deque<Integer> path, List<List<Integer>> res) {
        if(node == null){
            return;
        }
        sum = sum - node.val;
        path.addLast(node.val);
        if(sum==0&&node.left==null&&node.right==null){
            res.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }
        pathSum(node.left,sum,path,res);
        pathSum(node.right,sum,path,res);
        path.removeLast();

    }
}
