package com.nerver.lang.datastructures.gk.pow50;

public class Solution {


    /**
     * time complex o(n)
     * space comlex o(1)
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x,int n){
        long N = n;
        if(N <0 ){
            x = 1 / x;
            N = -N;
        }

        double ans = 1;
        for(long i =0;i<N;i++){
            ans = ans * x;
        }
        return ans;
    }






}
