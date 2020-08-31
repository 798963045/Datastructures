package com.nerver.lang.datastructures.zoo.lat2.a23;

import com.nerver.lang.datastructures.gk.common.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public ListNode mergeKlists(ListNode[] lists){
        Queue<ListNode> pq = new PriorityQueue<>((v1,v2)->v1.val-v2.val);
        for (ListNode node:lists){
            if(node!=null){
                pq.offer(node);
            }
        }
        ListNode dumyHead = new ListNode(0);
        ListNode tail = dumyHead;
        while (!pq.isEmpty()){
            ListNode minNode = pq.poll();
            tail.next = minNode;
            tail = minNode;
            if(minNode.next!=null){
                pq.offer(minNode.next);
            }
        }
        return dumyHead.next;
    }
}
