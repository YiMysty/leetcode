package leetcode23;
import java.util.ArrayList;
import java.util.List;
import basic.ListNode;
public class Main {
	public static void main(String args[]){
		Solution s = new Solution();
		List<ListNode> lists = new ArrayList<ListNode>();
		ListNode a = new ListNode(1);
		lists.add(a);
		s.mergeKLists(lists);
	}
}
