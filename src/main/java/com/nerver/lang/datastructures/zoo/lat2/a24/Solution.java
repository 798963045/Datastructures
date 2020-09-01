package com.nerver.lang.datastructures.zoo.lat2.a24;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head){
        if(head== null||head.next==null){
            return head;
        }
        ListNode firstNode = head;
        ListNode secondNode= head.next;
        firstNode.next = swapPairs(secondNode.next);
        secondNode.next = firstNode;
        return secondNode;

    }
}
