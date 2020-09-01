package com.nerver.lang.datastructures.zoo.lat2.a206;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {
    public ListNode reverList(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }

    public ListNode rever(ListNode head){
        if(head == null|| head.next ==null) return  head;

        ListNode p = reverList(head.next);
        head.next.next = head;
        head.next = null;
        return  p;
    }
}
