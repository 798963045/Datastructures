package com.nerver.lang.datastructures.zoo.lat.reverseList25;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head){

        //迭代法
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){

            ListNode next = cur.next;

            cur.next = pre;
            pre = cur;
            cur = next;

        }
        return pre;

    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        Solution solution = new Solution();
        solution.reverseList(node1);

        System.out.println();

        int temp = 7;
        if(temp<7){
            System.out.println(111);

        }else if(temp>7){
            System.out.println(222);
        }else if(temp==7){
            System.out.println(333);
        }


    }



}
