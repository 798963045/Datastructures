package com.nerver.lang.datastructures.zoo.lat2.a2;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dumyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dumyHead;
        int carry = 0;
        while (p!=null||q!=null){
            int x = (p!=null)? p.val:0;
            int y = (q!=null)? q.val:0;
            int sum = x+y+carry;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            carry = sum/10;
            if(p!=null) p=p.next;
            if(q!=null) q= q.next;
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return dumyHead.next;
    }
}
