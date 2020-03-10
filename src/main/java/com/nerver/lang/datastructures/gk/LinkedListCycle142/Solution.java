package com.nerver.lang.datastructures.gk.LinkedListCycle142;

import com.nerver.lang.datastructures.gk.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {






    //迭代法
    // 时间复杂度 o(n) 空间复杂度 o(n)
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
