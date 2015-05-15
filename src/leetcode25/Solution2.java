package leetcode25;
import basic.ListNode;

public class Solution2 {
    public ListNode reverseKGroup(ListNode head, int k) {
    	ListNode curr = head;
    	int count = 0;
    	while(curr!=null&&count<k){
    		curr = curr.next;
    		count++;
    	}
    	if(k==count){ //means there is k+1 ListNode here
    		curr = reverseKGroup(curr,k);//reverse the rest n-k part
    		while(count>0){
    			ListNode tmp = head.next;
    			head.next = curr;
    			curr = head;
    			head = tmp;
    			count--;
    		}
    		head = curr;
    	}
    	return head;
    }
}