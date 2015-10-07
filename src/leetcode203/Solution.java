package leetcode203;

import basic.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ptr = new ListNode(-1);
        ptr.next = head;
        head = ptr;
        ListNode former = ptr;
        ptr = ptr.next;
        while(ptr!=null){
        	if(ptr.val==val){
        		while(ptr!=null&&ptr.val==val)
        			ptr = ptr.next;
        	}
        	former.next = ptr;
        	former = ptr;
        	ptr = ptr.next;
        }
        return head.next;
    }
}