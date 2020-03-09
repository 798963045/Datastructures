package com.nerver.lang.datastructures.gk.ReverseLinkedList206.sencond;


import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {

    //示例:
    //输入: 1->2->3->4->5->NULL
    // null<-1 2->3->4->5->Null
    //输出: 5->4->3->2->1->NULL
    public ListNode reverseList2(ListNode head) {
        ListNode cur = head; //可以节省一个变量
        ListNode pre = null;
        while (head!=null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public ListNode reverseList(ListNode head) {
        //递归
        //终止条件
        if(head == null || head.next ==null) return head;
        //递归前逻辑处理
        //递归下一层，沉睡下去
        ListNode p = reverseList(head.next);
        //返回上一层的时候的逻辑处理，醒来
        //当前的head 为 4 ,沉睡上来的 p 为 5
        head.next.next = head;
        head.next = null;
        return p;
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
        ListNode result = temp.reverseList2(head);

        System.out.println(result);
    }
}
