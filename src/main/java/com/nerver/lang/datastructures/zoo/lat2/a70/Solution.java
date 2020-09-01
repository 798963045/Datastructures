package com.nerver.lang.datastructures.zoo.lat2.a70;

public class Solution {
    public int climbStairs(int n){
        int p=0;
        int q=0;
        int r=1;
        for (int i=1;i<=n;++i){
            p = q;
            q = r;
            r = p+q;
        }
        return r;
    }
}
