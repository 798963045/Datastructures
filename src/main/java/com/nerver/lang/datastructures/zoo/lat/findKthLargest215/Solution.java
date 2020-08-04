package com.nerver.lang.datastructures.zoo.lat.findKthLargest215;


import java.util.LinkedHashMap;

public class Solution {
    public int finKthLargest(int[] nums,int k){
        //解法1，排序

        //解法2，快速排序选择

        //堆
        int heapSize = nums.length;
        buildMaxHeap(nums,heapSize);
        for (int i= nums.length-1;i>=nums.length-k+1;--i){
            swap(nums,0,i);
            heapSize--;
            maxHeapify(nums,0,heapSize);
        }
        return nums[0];

    }

    public void buildMaxHeap(int[] a,int heapSize){
        for (int i = heapSize/2;i>=0;i--){
            maxHeapify(a,i,heapSize);
        }
    }
    //i 的意思是从第几个开始调整
    public void maxHeapify(int[] a, int i, int heapSize){
        //索引
        int l = i*2+1;
        int r = i*2+2;
        int largest = i;

        if(l<heapSize&&a[l]>a[largest]){
            largest = l;
        }
        if(r<heapSize&&a[r]>a[largest]){
            largest = r;
        }

        if(largest!=i){
            swap(a,i,largest);
            maxHeapify(a,largest,heapSize);
        }


    }

    public void swap(int[]a ,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
