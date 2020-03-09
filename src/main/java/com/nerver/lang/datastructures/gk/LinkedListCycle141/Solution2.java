package com.nerver.lang.datastructures.gk.LinkedListCycle141;

import com.nerver.lang.datastructures.gk.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    //暴力解法
    //时间复杂度 __
    //空间复杂度
    public boolean hasCycle(ListNode head) {
        try {
            long start = System.currentTimeMillis();
            while (head!=null){
                head = head.next;
                if(System.currentTimeMillis() - start == 100){
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            return true;
        }
        return false;
    }

    // 额外空间做法
    // 时间复杂度 o(n)
    //空间复杂度 o(n)
    public boolean hasCycle2(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head!=null){
            if(set.contains(head)){
                return true;
            }else {
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }

    //双链表法
    //时间复杂度 o(n)
    // 空间复杂度o(1)
    public boolean hasCycle3(ListNode head) {
        //特殊情况处理
        if(head == null || head.next == null){
            return false;
        }
        if(head.next == head){
            return true;
        }
        if(head.next.next == head){
            return true;
        }

        ListNode first = head;
        ListNode sencond = head;

        int i = 0;

        try {
            do {
                if (first == sencond && i > 0) {
                    return true;
                }
                i++;
                first = first.next;
                if (sencond.next.next == null) {
                    return false;
                }
                sencond = sencond.next.next;

            } while (first != null && sencond != null);
        }catch (Exception e) {
            return false;
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


        Solution2 temp = new Solution2();
        System.out.println(temp.hasCycle3(head));

    }


}
