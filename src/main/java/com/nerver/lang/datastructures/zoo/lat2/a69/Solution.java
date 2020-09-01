package com.nerver.lang.datastructures.zoo.lat2.a69;

public class Solution {
    public int mySqrt(int x){
        int l =0;
        int r =x;
        int ans = -1;
        while (l<r){
            int mid = l+(r-l)/2;
            if((long)mid*mid<=x){
                ans = mid;
                l=mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return ans;
    }
}
