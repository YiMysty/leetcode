package leetcode143;

import basic.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        ListNode vhead = new ListNode(-1);
        vhead.next = head;
        ListNode pslow = vhead;
        ListNode pfast = vhead.next.next;
        while(pfast!=null&&pfast.next!=null){
        	pslow = pslow.next;
        	pfast = pfast.next.next;
        }
    }
}