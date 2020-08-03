package com.nerver.lang.datastructures.zoo.lat.reverseKGroup25;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {

    public ListNode reverseKGroup(ListNode head, int k){

        if(head==null){
            return null;
        }

        ListNode a=head;
        ListNode b=head;
        for (int i=0;i<k;i++){
            if(b==null){ return head ;}
            b = b.next;
        }
        ListNode newHead = reverseList(a,b);
        a.next=reverseKGroup(b,k);
        return newHead;

    }

    public ListNode reverseList(ListNode a, ListNode b){

        ListNode pre=null;
        ListNode curr= a;
        ListNode next=a;

        while (curr!=b){
            next = curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;

    }

}
