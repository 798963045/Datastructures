package com.nerver.lang.datastructures.zoo.lat2.a124;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Solution {
   int maxSum = Integer.MIN_VALUE;
   public int maxPathSum(TreeNode root){
       maxGain(root);
       return maxSum;
   }

    private int maxGain(TreeNode node) {
       if(node==null){
           return 0;
       }
       int leftGain = Math.max(maxGain(node.left),0);
       int rightGain = Math.max(maxGain(node.right),0);
       int priceNewpath = node.val+leftGain+rightGain;
       maxSum = Math.max(maxSum,priceNewpath);
       return node.val+Math.max(leftGain,rightGain);

    }

}

