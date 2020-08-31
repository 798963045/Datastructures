package com.nerver.lang.datastructures.zoo.lat2.a112;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum){
        if(root ==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            return sum == root.val;
        }

        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);

    }
}
