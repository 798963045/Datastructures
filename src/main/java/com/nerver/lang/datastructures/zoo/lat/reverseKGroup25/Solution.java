package com.nerver.lang.datastructures.zoo.lat.reverseKGroup25;

import com.nerver.lang.datastructures.gk.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> pq = new PriorityQueue<>((v1, v2) -> v1.val - v2.val);
        for (ListNode node: lists) {
            if (node != null) {
                pq.offer(node);
            }
        }
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (!pq.isEmpty()) {
            ListNode minNode = pq.poll();
            tail.next = minNode;
            tail = minNode;
            if (minNode.next != null) {
                pq.offer(minNode.next);
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode temp4 = new ListNode(4);
        ListNode temp5 = new ListNode(5);
        head1.next=temp4;
        temp4.next =temp5;

        ListNode head2 = new ListNode(1);
        ListNode headtemp3 = new ListNode(3);
        ListNode headtemp4 = new ListNode(4);
        head2.next = headtemp3;
        head2.next.next = headtemp4;

        List<ListNode> listNodes = new ArrayList<>();
        listNodes.add(head1);
        listNodes.add(head2);

        ListNode[] listnum = {head1,head2};

        Solution solution = new Solution();
        solution.mergeKLists(listnum);


    }

}
