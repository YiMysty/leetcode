package leetcode23;
import java.util.List;
import basic.ListNode;
public class Solution2 {
    public ListNode mergeKLists(List<ListNode> lists) {
    	//Actually this part of merge sort.
    	ListNode head = null;
    	if(lists.size()>2){
    		ListNode left = mergeKLists(lists.subList(0, lists.size()/2));
    		ListNode right= mergeKLists(lists.subList(lists.size()/2, lists.size()));
    		head = merge(left,right);
    	}else if(lists.size()==2){
    		head = merge(lists.get(0),lists.get(1));
    	}else if(lists.size()==1){
    		head = lists.get(0);
    	}
    	return head;
    }
    public ListNode merge(ListNode l1,ListNode l2){
    	ListNode head = new ListNode(-1);
    	ListNode ptr = head;
    	while(l1!=null&&l2!=null){
    		if(l1.val<l2.val){
    			ptr.next = l1;
    			l1 = l1.next;
    		}else{
    			ptr.next = l2;
    			l2 = l2.next;
    		}
			ptr = ptr.next;
    	}
    	while(l1!=null){
    		ptr.next = l1;
    		ptr = ptr.next;
    		l1 = l1.next;
    	}while(l2!=null){
    		ptr.next = l2;
    		ptr =ptr.next;
    		l2 =l2.next;
    	}
    	return head.next;
    }
}