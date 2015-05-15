package leetcode109;

import basic.ListNode;
import basic.TreeNode;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
    	if(head==null)
    		return null;
    	ListNode prev = null;
    	ListNode slow = head;
    	ListNode fast = head;
    	while(fast.next!=null&&fast.next.next!=null){
    		prev = slow;
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	TreeNode node = new TreeNode(slow.val);
    	if(prev==null)
    		node.left = null;
    	else{
    		prev.next = null;
    		node.left = sortedListToBST(head);
    	}
    	node.right = sortedListToBST(slow.next);
    	return node;
    }
}