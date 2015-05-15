package leetcode83;
import basic.ListNode;
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode vHead = new ListNode(-9);
    	vHead.next = head;
    	ListNode p = vHead.next;
    	ListNode former = vHead;
    	while(p!=null){
    		if(p.val!=former.val){
    			 p = p.next;
    			 former = former.next;
    		}else{
    			while(p!=null&&p.val==former.val){
    				p = p.next;
    			}
    			former.next = p;
    			former = p;
    			if(former!=null)
    				p = former.next;
    		}
    	}
    	return vHead.next;
    }
}