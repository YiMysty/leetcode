package leetcode86;

import basic.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {
    	ListNode small = new ListNode(-1);
    	ListNode large = new ListNode(-1);
    	ListNode c1  = small;
    	ListNode c2  = large;
    	while(head!=null){
    		if(head.val<x){
    			c1.next = head;
    			c1 = c1.next;
    		}else{
    			c2.next = head;
    			c2 = c2.next;
    		}
    		head = head.next;
    	}
    	c1.next = large.next;
    	c2.next = null;
    	return small.next;
    }
}