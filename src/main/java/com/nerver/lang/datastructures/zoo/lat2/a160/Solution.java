package com.nerver.lang.datastructures.zoo.lat2.a160;

import com.nerver.lang.datastructures.gk.common.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA==null||headB==null){
            return null;
        }
        ListNode pA= headA;
        ListNode pB= headB;
        while (pA!=pB){
            pA = pA.next;
            pB = pB.next;
            if(pA==null&&pB==null){
                return null;
            }
            if(pA==null){
                pA = headB;
            }
            if(pB==null){
                pB = headA;
            }
        }
        return pA;

    }
}
