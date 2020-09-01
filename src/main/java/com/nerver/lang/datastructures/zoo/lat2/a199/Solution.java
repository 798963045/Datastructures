package com.nerver.lang.datastructures.zoo.lat2.a199;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.*;

public class Solution {
    public List<Integer> rightSideView(TreeNode root){
        Map<Integer,Integer> rightmostValueDepth = new HashMap<>();
        int max_depth = -1;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> depthQueue = new LinkedList<>();
        nodeQueue.add(root);
        depthQueue.add(0);
        while (!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.remove();
            int depth = depthQueue.remove();
            if(node!=null){
                max_depth = Math.max(max_depth,depth);
                rightmostValueDepth.put(depth,node.val);
                nodeQueue.add(node.left);
                nodeQueue.add(node.right);
                depthQueue.add(depth+1);
                depthQueue.add(depth+1);
            }
        }
        List<Integer> rightViews = new ArrayList<>();
        for (int depth =0;depth<=max_depth;depth++){

            rightViews.add(rightmostValueDepth.get(depth));
        }

        return rightViews;

    }
}
