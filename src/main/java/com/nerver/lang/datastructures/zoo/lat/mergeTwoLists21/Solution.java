package com.nerver.lang.datastructures.zoo.lat.mergeTwoLists21;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        //1 2 4
        //1 3 4
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if(l1==null&&l2!=null){
            temp.next = l2;
        }
        if(l2==null&&l1!=null){
            temp.next = l1;
        }
        return newHead.next;

    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }


    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        node1.next=node2;
        node2.next=node4;

        ListNode node11 = new ListNode(1);
        ListNode node33 = new ListNode(3);
        ListNode node44 = new ListNode(4);
        node11.next=node33;
        node33.next=node44;

        Solution solution = new Solution();
        ListNode newhead = solution.mergeTwoLists(node1,node11);
        System.out.printf("");

        ListNode nodetest1 = new ListNode(1);

        ListNode newhead2 = solution.mergeTwoLists(node1,node11);

        System.out.printf("");


    }
}
