package leetcode23;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import basic.ListNode;
public class Solution {
    public ListNode mergeKLists(List<ListNode> lists) {
    	PriorityQueue <ListNode> queue = new PriorityQueue<ListNode>(new Comparators());
    	for(ListNode list:lists){
    		ListNode next = list;
    		while(next!=null){
    		    queue.add(next);
    		    next = next.next;
    		}
    	}
        ListNode head = new ListNode(-1);
        ListNode point = head;
        while(!queue.isEmpty()){
        	point.next = new ListNode(queue.poll().val);
        	point = point.next;
        }
        return head.next;
    }
    class Comparators implements Comparator<Object>{
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			int val1 = ((ListNode)o1).val;
			int val2 = ((ListNode)o2).val;
			return val1-val2;
		}
    	
    }
}
