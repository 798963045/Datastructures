package com.nerver.lang.datastructures.gk.SwapPairs24;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {

    // 1->2->3->4
    //递归解法
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }

        ListNode first = head;
        ListNode sencond = head.next;

        ListNode p = swapPairs(sencond.next);
        first.next = p;
        sencond.next = first;
        return sencond;

    }

    //迭代解法
    public static ListNode swapPairs2(ListNode head) {
        // Dummy node acts as the prevNode for the head node
        // of the list and hence stores pointer to the head node.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prevNode = dummy;

        while ((head != null) && (head.next != null)) {

            // Nodes to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            // Swapping
            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // Reinitializing the head and prevNode for next swap
            prevNode = firstNode;
            head = firstNode.next; // jump
        }

        // Return the new head node.
        return dummy.next;


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
        ListNode result = swapPairs2(h1);
        System.out.println();

    }

}
