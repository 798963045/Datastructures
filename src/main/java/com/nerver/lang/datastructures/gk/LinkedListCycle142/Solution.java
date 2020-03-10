package com.nerver.lang.datastructures.gk.LinkedListCycle142;

import com.nerver.lang.datastructures.gk.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * 迭代 - 双指针法
     *
     * time complexity o(n)
     * space complexity o(1)
     * @param head
     * @return
     */
    public ListNode detectCycle2(ListNode head){
        if(head == null){
            return null;
        }
        ListNode intersect = getIntersect(head);
        if(intersect ==null ){
            return null;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1!=ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }

    private ListNode getIntersect(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;
        while (hare!=null&&hare.next!=null){
            tortoise = tortoise.next;
            hare = head.next.next;
            if(tortoise == hare){
                return tortoise;
            }
        }
        return null;
    }


    //迭代法
    // 时间复杂度   time complexity o(n) space complexity 空间复杂度 o(n)
    public ListNode detectCycle(ListNode head){
        if(head==null||head.next==null){
            return null;
        }
        Set<ListNode> visited = new HashSet<>();
        while (head!=null){
            if(visited.contains(head)){
                return head;
            }else {
                visited.add(head);
                head = head.next;
            }
        }
        return null;
    }

}
