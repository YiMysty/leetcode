package leetcode19;
import basic.ListNode;
public class Solution {
//	Given a linked list, remove the nth node from the end of list and return its head.
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode virtualHead = new ListNode(-1);
		virtualHead.next = head;
		ListNode sptr = virtualHead; //the pointer is slow
		ListNode qptr = virtualHead; //the pointer is quick
		for(int i=0;i<n+1;i++)
			qptr = qptr.next;
		while(qptr!=null){
			qptr = qptr.next;
			sptr = sptr.next;
		}
		sptr.next = sptr.next.next;
		return virtualHead.next;
	}
}
