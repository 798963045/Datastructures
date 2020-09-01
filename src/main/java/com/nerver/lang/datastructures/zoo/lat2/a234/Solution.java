package com.nerver.lang.datastructures.zoo.lat2.a234;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {

    ListNode frontPointer;
    public boolean recursivelyCheck(ListNode currentNode){
        if(currentNode!=null){
            if(!recursivelyCheck(currentNode.next)) return false;
            if(currentNode.val!=frontPointer.val) return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head){
        frontPointer = head;
        return recursivelyCheck(head);
    }
}
