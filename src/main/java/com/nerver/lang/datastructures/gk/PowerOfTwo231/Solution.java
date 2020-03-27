package com.nerver.lang.datastructures.gk.PowerOfTwo231;

public class Solution {


    /**
     * 去除最右边的1
     * 去除最右边的1然后检测是不是与零相等，如果相等则代表有多余的1
     * o(1)
     * o(1)
     * @param n
     * @return
     */
    public boolean isPowerOfTwo3(int n){
        if(n==0) return false;
        long x = (long)n;
        return (x&(x-1)) ==0;

    }


    /**
     *
     *获取最右边的1
     * 位运算：获取二进制中最右边的1
     * 不是 2 的幂的二进制中有一个以上的 1
     * 我们通过 x & (-x) 保留了最右边的 1，并将其他位设置为 0 若 x 为 2 的幂，则它的二进制表示中只包含一个 1，则有 x & (-x) = x。
     *
     * 若 x 不是 2 的幂，则在二进制表示中存在其他 1，因此 x & (-x) != x
     *
     * o(1)
     * o(1)
     * @param n
     * @return
     */
    public boolean isPowerOfTwo2(int n){
        if(n==0) return false;
        long x =(long)n;
        return (x&(-x)) ==x;
    }


    /**
     * logN时间复杂度
     * 判断是不是奇数
     * 不是除以二，若最后等于1则代表是，因为2/2等1
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n){
        if(n==0){
            return false;
        }
        while (n%2 ==0 ){
            n/=2;
        }
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(1));
        System.out.println(new Solution().isPowerOfTwo(16));
        System.out.println(new Solution().isPowerOfTwo(17));
        System.out.println(new Solution().isPowerOfTwo(218));
    }
}
