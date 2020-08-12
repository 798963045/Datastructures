package com.nerver.lang.datastructures.zoo.lat.isPalindrome234;

import com.nerver.lang.datastructures.gk.common.ListNode;

class Solution3 {

    private ListNode frontPointer;
    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) return false;
            if (currentNode.val != frontPointer.val) return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }
}

