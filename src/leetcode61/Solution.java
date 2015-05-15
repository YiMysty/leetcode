package leetcode61;
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
    public ListNode rotateRight(ListNode head, int n) {
        if(head==null)
        	return head;
        ListNode fast = head;
        ListNode slow = head;
        int len = 1;
        for(int i=0;i<n;i++){
        	fast = fast.next;
        	if(fast==null)
        		return len==n?head:rotateRight(head,(n%len));
        	len++;
        }
        while(fast.next!=null){
        	fast = fast.next;
        	slow = slow.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}