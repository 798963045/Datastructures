package com.nerver.lang.datastructures.zoo.lat2.a142;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {
    public ListNode getIntersect(ListNode head){
        ListNode torttois = head;
        ListNode hare = head;
        while (hare!=null&&hare.next!=null){
            torttois = torttois.next;
            hare = hare.next.next;
            if(torttois == hare){
                return torttois;
            }

        }
        return null;
    }

    public ListNode detectCycle(ListNode head){
        if(head==null){
            return null;
        }
        ListNode intersect = getIntersect(head);
        if(intersect==null){
            return null;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1!=ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }

}
