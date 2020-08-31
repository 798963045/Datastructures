package com.nerver.lang.datastructures.zoo.lat2.a215;

public class Solution {
    public int findKthLargest(int[] nums,int k){
        int headSize = nums.length;
        buildMaxHeap(nums,headSize);
        for (int i = nums.length-1;i>=nums.length-k+1;--i){
            swap(nums,0,i);
            headSize--;
            maxHeapify(nums,0,headSize);
        }
        return nums[0];
    }

    private void buildMaxHeap(int[] a, int headSize) {
        for (int i=headSize/2;i>=0;i--){
            maxHeapify(a,i,headSize);
        }
    }

    private void maxHeapify(int[] a, int i, int headSize) {
        int l = i*2+1;
        int r = i*2+2;
        int largest = i;
        if(l<headSize&&a[l]>a[largest]){
            largest = l;
        }
        if(r<headSize&&a[r]>a[largest]){
            largest = r;
        }
        if(largest!=i){
            swap(a,i,largest);
            maxHeapify(a,largest,headSize);
        }
    }

    private void swap(int[] a, int i, int largest) {
        int temp = a[i];
        a[i] = a[largest];
        a[largest] = temp;
    }
}
