package com.nerver.lang.datastructures.gk.LinkedListCycle141;

import com.nerver.lang.datastructures.gk.common.ListNode;

import java.util.HashSet;
import java.util.Set;


public class Solution {



    //2.set 方法 快慢指针
    public boolean hasCycle2(ListNode head){
        if(head==null||head.next==null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&slow!=null){
            if(fast.next==null){
                return false;
            }
            if(fast.next.next==null){
                return false;
            }

            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    //1.set 方法
    public boolean hasCycle(ListNode head){
        Set<ListNode> set = new HashSet<>();
        while (head!=null){
            if(set.contains(head)){
                return true;
            }else {
                set.add(head);
            }
            head=head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode t2 = new ListNode(2);
        /*ListNode t3 = new ListNode(0);
        ListNode t4 = new ListNode(4);
        ListNode t5 = new ListNode(5);*/

        head.next = t2;
        //t2.next = t3;


        Solution temp = new Solution();
        temp.hasCycle2(head);

    }

}
