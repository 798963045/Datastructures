package com.nerver.lang.datastructures.zoo.lat2.a236;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    Map<Integer, TreeNode> parent = new HashMap<>();
    Set<Integer> visited  = new HashSet<>();
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        dfs(root);
        while (p!=null){
            visited.add(p.val);
            p=parent.get(p.val);
        }
        while (q!=null){
            if(visited.contains(q.val)){
                return q;
            }
            q = parent.get(q.val);
        }
        return null;
    }

    private void dfs(TreeNode root) {
        if(root.left!=null){
            parent.put(root.left.val,root);
            dfs(root.left);
        }
        if(root.right!=null){
            parent.put(root.right.val,root);
            dfs(root.right);
        }
    }

}
