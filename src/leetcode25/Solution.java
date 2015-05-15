package leetcode25;
import java.util.Stack;

import basic.ListNode;
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
    	if(k==1)
    		return head;
    	ListNode vHead = new ListNode(-1);
    	vHead.next = head;
    	ListNode prev = vHead;
    	ListNode ptr  = vHead.next;
    	while(ptr!=null){
    		Stack<ListNode> stack = new Stack<ListNode>();
    		for(int i=0;i<k;i++){ //reverse this scope
    			if(ptr==null)
    				return vHead.next; //Less than k
    			stack.push(ptr);
    			ptr = ptr.next;
    		}
    		while(!stack.isEmpty()){
    			prev.next = stack.pop();
    			prev = prev.next;
    		}
    		prev.next = ptr;
    	}
    	return vHead.next;
    }
}