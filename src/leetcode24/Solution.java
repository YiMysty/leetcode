package leetcode24;
import basic.ListNode;
public class Solution {
	public ListNode swapPairs(ListNode head) {
		ListNode vHead =new ListNode(-1);
		vHead.next = head;
		ListNode ptr = head;
		ListNode prev = vHead;
		while(ptr!=null&&ptr.next!=null){
			ListNode l = ptr.next.next;
			prev.next = ptr.next;
			ptr.next = l;
			prev.next.next = ptr;
			prev  = prev.next.next;
			ptr = prev.next;
		}
		return vHead.next;
    }
}