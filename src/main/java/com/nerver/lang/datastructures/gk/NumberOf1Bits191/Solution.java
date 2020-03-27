package com.nerver.lang.datastructures.gk.NumberOf1Bits191;

public class Solution {

    /**
     * 循环和位移动
     * a&a 只有两个都为1才是1 参考&&
     * a|a 有1则为1 参考||
     * a^b 只有相异才为1
     *
     * time complexity o(1)
     * space complexity o(1)
     *
     * @param n
     * @return
     */

    //you need to treat n as an unsigned value
    public int hammingWeight(int n){
        int bits = 0;
        int mask = 1;
        for (int i=0;i<32;i++){
            if((n&mask)!=0){
                bits++;
            }
            mask<<=1;
        }
        return bits;
    }

    /**
     *
     * n&(n-1) 运算总能把最低温的1变成0，并保持其他不变
     * time complexity o(1)
     * space complexity o(1)
     * @param n
     * @return
     */

    public int hammingWeight2(int n){
        int sum =0;
        while (n!=0){
            sum++;
            n = n&(n-1);
        }
        return sum;

    }

}
