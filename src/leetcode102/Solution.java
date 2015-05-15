package leetcode102;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import basic.TreeNode;
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<Integer> buffer = new ArrayList<Integer>();
    	int count = 1;
    	int total = 0;
    	while(!queue.isEmpty()){
    		TreeNode node = queue.poll();
    		buffer.add(node.val);
    		count--;
    		if(node.left!=null){
    			queue.add(node.left);
    			total++;
    		}
    		if(node.right!=null){
    			queue.add(node.right);
    			total++;
    		}
    		if(count==0){
    			result.add(buffer);
    			buffer = new ArrayList<Integer>();
    			count = total;
    			total = 0;
    		}
    	}
    	return result;
    }
}