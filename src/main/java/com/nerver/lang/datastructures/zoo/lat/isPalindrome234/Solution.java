package com.nerver.lang.datastructures.zoo.lat.isPalindrome234;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head){
        if(head==null){
            return false;
        }
        ListNode temp = head;
        ListNode reverList = reverseList(temp);
        while (head!=null){
            if(head.val==reverList.val){
                head = head.next;
                reverList = reverList.next;
            }else {
                return false;
            }
        }
        return true;

    }

    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode next =null;

        while (cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution solution = new Solution();
        solution.isPalindrome(node);

        System.out.printf("");

    }
}
