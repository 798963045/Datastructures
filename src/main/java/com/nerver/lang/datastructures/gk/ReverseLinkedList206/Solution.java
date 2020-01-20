package com.nerver.lang.datastructures.gk.ReverseLinkedList206;

public class Solution {


    //Input: 1->2->3->4->5->NULL
    //Output: 5->4->3->2->1->NULL
    //递归
    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    //迭代
    public ListNode reverseList2(ListNode head){
        if(head==null) return null;
        if(head.next==null) return head;

        ListNode pre = null;
        ListNode curr = head;

        while (curr!=null){
            ListNode nextTemp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextTemp;

        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(4);
        ListNode t5 = new ListNode(5);

        head.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        t5.next = null;

        Solution temp = new Solution();
        ListNode result = temp.reverseList(head);

        System.out.println(result);
    }

}
