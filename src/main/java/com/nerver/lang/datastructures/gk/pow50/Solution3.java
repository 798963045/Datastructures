package com.nerver.lang.datastructures.gk.pow50;

public class Solution3 {


    /**
     * time complex o(n)
     * space complex o(n)
     * @param x
     * @param n  快速幂算法 迭代  递归都可以
     * @return
     */

    public double myPow(double x ,int n){
        long N= n;
        if(N<0){
            x = 1/x;
            N=-N;
        }
        double ans = 1;
        double current_product = x;
        for(long i = N;i>0;i/=2){

            if(i%2==1){
                ans = ans*current_product;
            }
            current_product = current_product*current_product;

        }
        return ans;
    }
}
