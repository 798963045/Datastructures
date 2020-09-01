package com.nerver.lang.datastructures.zoo.lat2.a99;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void recoverTree(TreeNode root){
        List<TreeNode> list = new ArrayList<>();
        dfs(root,list);
        TreeNode x = null;
        TreeNode y = null;
        for (int i =0 ;i<list.size()-1;++i){
            if(list.get(i).val>list.get(i+1).val){
                y  = list.get(i+1);
                if(x ==null){
                    x = list.get(i);
                }
            }
        }
        if(x!=null&&y!=null){
            int temp = x.val;
            x.val = y.val;
            y.val = temp;
        }
    }
    private void dfs(TreeNode node, List<TreeNode> list) {
        if(node==null) return;
        dfs(node.left,list);
        list.add(node);
        dfs(node.right,list);
    }
}
