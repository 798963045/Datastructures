package com.nerver.lang.datastructures.gk.SwapPairs24;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }

        ListNode s1 = head;
        ListNode s2 = head.next;

        

    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = null;
        swapPairs(h1);
        System.out.println();

    }

}
