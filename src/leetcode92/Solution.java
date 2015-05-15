package leetcode92;
import basic.ListNode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if(m==n)
    		return head;
    	ListNode Vhead = new ListNode(-1);
    	Vhead.next = head;
    	ListNode p = head;
    	ListNode prev = Vhead;
    	for(int i=1;i<m;i++){
    		p = p.next;
    		prev = prev.next;
    	}
    	//jump to the point until supposed to reverse
    	for(int i=m;i<n;i++){
    		ListNode next = p.next;
    		ListNode then = next.next;
    		next.next = prev.next;
    		prev.next = next;
    		p.next = then;
    	}
    	return Vhead.next;
    }
}