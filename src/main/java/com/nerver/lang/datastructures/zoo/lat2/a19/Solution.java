package com.nerver.lang.datastructures.zoo.lat2.a19;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummy =new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode sencond = dummy;

        for (int i=1;i<=n;i++){
            first = first.next;
        }
        while (first!=null){
            first = first.next;
            sencond = sencond.next;
        }

        sencond.next=sencond.next.next;
        return dummy.next;

    }


}

