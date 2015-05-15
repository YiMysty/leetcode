package leetcode145;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import basic.TreeNode;
public class Solution {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode lastVisit = null;
		while(root!=null||!stack.isEmpty()){
			while(root!=null){
				stack.add(root);
				root = root.left;
			}
			root = stack.peek();
			if(root.right==null||root.right==lastVisit){
				result.add(root.val);
				lastVisit = root;
				stack.pop();
				root = null;
			}else{
				root = root.right;
			}
		}
		return result;
	}
}
