package com.nerver.lang.datastructures.zoo.lat.isBalanced110;

import com.nerver.lang.datastructures.gk.common.TreeNode;
import com.sun.org.apache.xpath.internal.objects.XNull;

public class Solution {

    boolean res=true;

    public boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }
        depth(root,res);
        System.out.println(res);
        return res;
    }

    public int depth(TreeNode root,boolean result){
        if(root ==null) return 0;

        int L = depth(root.left,result);
        int R = depth(root.right,result);
        if(Math.abs(L-R)>1) {
            res = false;
        }
        return Math.max(L,R)+1;
    }
//      1
//    2   2
//  3  3  null null
//4  4
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(2);
        TreeNode root4 = new TreeNode(3);
        TreeNode root5 = new TreeNode(3);
        TreeNode root6 = new TreeNode(4);
        TreeNode root7 = new TreeNode(4);

        root.left=root2;
        root.right=root3;
        root.left.left=root4;
        root.left.right=root5;
        root.left.left.left=root6;
        root.left.left.right=root7;
        Solution solution = new Solution();
        solution.isBalanced(root);
    }


//     1
//   2    2
// 3  3


}
