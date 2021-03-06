package com.nerver.lang.datastructures.dancebyte.path;

import java.util.Stack;

class Solution {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        // 首先将字符串以 “/” 分隔存储到新的字符数组 str 中
        String[] str = path.split("/");
        for (String s : str) {
            // 如果数组非空,且访问到的是 “..” 则说明要返回上一级,要将当前元素出栈
            if ( s.equals("..") ) {
                // 这里用到增强型 for 循环不能同时判断，需要再次判空
                // 而普通 for 循环则可写成( !stack.isEmpty() && s.equals("..") )
                if ( !stack.isEmpty() ) {
                    stack.pop();
                }
                // 如果数组非空并且当前元素不是 “.” 说明当前元素是路径信息，要入栈
            } else if ( !s.equals("") && !s.equals(".") ) {
                stack.push(s);
            }
        }
        // 如果栈内没有元素说明没有路径信息，返回 “/” 即可
        if ( stack.isEmpty() ) {
            return "/";
        }
        // 这里用到 StringBuilder 操作字符串，效率高
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            ans.append( "/" + stack.get(i) );
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s1="/home/";
        String s2="/../";
        String s3="/home//foo/";
        String s4="/a/./b/../../c/";
        String s5="/a/../../b/../c//.//";
        String s6="/a//b////c/d//././/..";

        simplifyPath(s1);
        simplifyPath(s2);
        simplifyPath(s3);
        simplifyPath(s4);
        simplifyPath(s5);
        simplifyPath(s6);



    }
}

