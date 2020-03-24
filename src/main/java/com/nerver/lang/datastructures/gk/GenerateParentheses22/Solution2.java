package com.nerver.lang.datastructures.gk.GenerateParentheses22;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    /**
     * 回溯法
     * https://leetcode-cn.com/problems/generate-parentheses/solution/gua-hao-sheng-cheng-by-leetcode/
     * 参考这个
     * 例举法 分析 算了多少次 从而得到时间空间复杂度
     * "(()())",
     * @param n
     * @return
     */
    public List<String> generateParentesis(int n){
        List<String> ans = new ArrayList<>();
        backtrack(ans,"",0,0,n);
        return ans;
    }
    public void backtrack(List<String> ans,String cur,int open ,int close,int max){
        if(cur.length()==max*2){
            ans.add(cur);
            return;
        }
        if(open<max){
            backtrack(ans,cur+"(",open+1,close,max);
        }
        if(close<open){
            backtrack(ans,cur+")",open,close+1,max);
        }
    }

    /**
     * 闭合数
     * https://leetcode-cn.com/problems/generate-parentheses/solution/gua-hao-sheng-cheng-by-leetcode/
     */
    public List<String> generateParenthesis2(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis2(c))
                    for (String right: generateParenthesis2(n-1-c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }



}
