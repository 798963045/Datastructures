package com.nerver.lang.datastructures.zoo.lat.mergeKLists23;

import com.nerver.lang.datastructures.gk.common.ListNode;

import java.util.*;

class Solution {
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
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(1,1);
        treeMap.put(2,2);
        treeMap.put(3,3);
        /**
         * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
         * 输出：[1,1,2,3,4,4,5,6]
         */
        //
        ListNode list1_1 = new ListNode(1);
        ListNode list1_4 = new ListNode(4);
        ListNode list1_5 = new ListNode(5);
        list1_1.next = list1_4;
        list1_4.next =list1_5;
        //
        //
        ListNode list2_1 = new ListNode(1);
        ListNode list2_3 = new ListNode(3);
        ListNode list2_4 = new ListNode(4);
        list2_1.next = list2_3;
        list2_3.next =list2_4;
        //
        //
        ListNode list3_2 = new ListNode(2);
        ListNode list3_6 = new ListNode(6);
        list3_2.next = list3_6;
        //
       /* List<ListNode> listNodes = new ArrayList<>();
        listNodes.add(list1_1);
        listNodes.add(list2_1);
        listNodes.add(list3_2);*/
        Solution solution = new Solution();
        ListNode[] nums = {list1_1,list2_1,list3_2};
        solution.mergeKLists(nums);
        System.out.println();
    }
}

