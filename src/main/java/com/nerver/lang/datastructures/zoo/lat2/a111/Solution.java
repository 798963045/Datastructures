package com.nerver.lang.datastructures.zoo.lat2.a111;

import com.nerver.lang.datastructures.gk.common.TreeNode;
import javafx.util.Pair;

import java.util.LinkedList;

public class Solution {
    public int minDeptha(TreeNode root){
        if(root==null){
            return 0;
        }
        if((root.left==null)&&(root.right==null)){
            return 1;
        }
        int min_depth = Integer.MAX_VALUE;
        if(root.left!=null){
            min_depth = Math.min(minDeptha(root.left),min_depth);
        }
        if(root.right!=null){
            min_depth=Math.min(minDeptha(root.right),min_depth);
        }
        return min_depth+1;
    }

    public int mindepth(TreeNode root){
        LinkedList<Pair<TreeNode,Integer>> stack = new LinkedList<>();
        if(root==null){
            return 0;
        }
        else {
            stack.add(new Pair<>(root,1));
        }
        int min_depth = Integer.MAX_VALUE;
        while (!stack.isEmpty()){
            Pair<TreeNode,Integer> current = stack.peekLast();
            root = current.getKey();
            int current_depth = current.getValue();
            if(root.left==null&&root.right==null){
                min_depth=Math.min(min_depth,current_depth);
            }
            if(root.left!=null){
                stack.add(new Pair(root.left,current_depth+1));
            }
            if(root.right!=null){
                stack.add(new Pair(root.right,current_depth+1));
            }
        }
        return min_depth;
    }
}

