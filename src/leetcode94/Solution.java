package leetcode94;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import basic.TreeNode;
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	List<Integer> result = new ArrayList<Integer>();
    	while(root!=null||!stack.isEmpty()){
    		while(root!=null){
    			stack.add(root);
    			root = root.left;
    		}
    		root = stack.pop();
    		result.add(root.val);
    		root = root.right;
    	}
    	return result;
    }
}