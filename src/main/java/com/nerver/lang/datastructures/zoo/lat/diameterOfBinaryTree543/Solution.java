package com.nerver.lang.datastructures.zoo.lat.diameterOfBinaryTree543;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Solution {

    int ans;
    public int diameterOfBinaryTree(TreeNode root){
        ans=1;
        dethtree(root);
        return ans-1;
    }
    /*
      时间复杂度 o(n)
      空间复杂度 o(Height)
     */
    public int dethtree(TreeNode root){
        if(root==null) return 0;
        int L = dethtree(root.left);
        int R =dethtree(root.right);
        ans = Math.max(ans,L+R+1);
        return Math.max(L,R)+1;
    }
}
