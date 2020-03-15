package com.nerver.lang.datastructures.gk.ValidateBinarySearchTree98;

import com.nerver.lang.datastructures.gk.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isValidBST(TreeNode  root){
        List<Integer> list = new ArrayList<>();
        try {
            med(root,list);
        }catch (Exception e){
            return false;
        }
        return true;

    }

    private void med(TreeNode root,List<Integer> result) throws Exception{
        if(root==null){
            return;
        }
        med(root.left,result);
        if(result.size()>=1&&root.val<=result.get(result.size()-1)){
            throw new Exception("false");
        }else {
            result.add(root.val);
        }
        //System.out.println(root.val);
        med(root.right,result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(new Solution().isValidBST(root));
        System.out.println();
    }

}
