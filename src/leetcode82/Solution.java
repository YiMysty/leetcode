package leetcode82;

import basic.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head==null)
    		return head;
    	ListNode vHead = new ListNode(head.val-1);
    	vHead.next = head;
    	ListNode former = vHead;
    	ListNode p      = vHead.next;
    	while(p!=null){
    		if(p.next!=null){
    			if(p.next.val!=p.val){
    				former.next = p;
    				former =p;
    				p = former.next;
    			}else{
    				int val = p.val;
    				while(p!=null&&p.val==val)
    					p = p.next;
    				if(null==p)
    					former.next = p;
    			}
    		}else{
    			former.next = p;
    			former = p;
    			p  =former.next;
    		}
    	}
    	return vHead.next;
    }
}