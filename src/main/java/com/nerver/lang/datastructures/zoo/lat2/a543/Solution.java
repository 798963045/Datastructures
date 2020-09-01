package com.nerver.lang.datastructures.zoo.lat2.a543;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Solution {
    int ans;
    public int diameterOfBinaryTree(TreeNode root){
        ans =1;
        depth(root);
        return ans-1;
    }

    private int depth(TreeNode node) {
        if(node==null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans,L+R+1);
        return Math.max(L,R)+1;
    }

}
