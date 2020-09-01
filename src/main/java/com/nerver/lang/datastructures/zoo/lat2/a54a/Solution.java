package com.nerver.lang.datastructures.zoo.lat2.a54a;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Solution {
    int res;
    int k;
    public int kthLargest(TreeNode root,int k){
        this.k = k;
        dfs(root);
        return res;

    }

    private void dfs(TreeNode root) {
        if(root==null) return;
        dfs(root.right);
        if(k==0) return;
        if(--k==0) res = root.val;
        dfs(root.left);
    }
}
