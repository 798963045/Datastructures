package com.nerver.lang.datastructures.gk.pow50;

public class Solution2 {


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
        return fastPow(x,N);
    }

    /**
     * time complex o(logn)
     * space complex o(logn)
     * @param x
     * @param n
     * @return
     */

    private double fastPow(double x, long n){
        if(n==0){
            return 1.0;
        }
        double half = fastPow(x,n/2);
        if(n%2==0){
            return half*half;
        }else {
            return half*half*x;
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(new Solution2().myPow(2,2));


        //2 3
       // 2  4  4*4    2  3  2*2*x
    }




}
