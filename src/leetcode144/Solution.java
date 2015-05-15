package leetcode144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import basic.TreeNode;
public class Solution {
	  public List<Integer> preorderTraversal(TreeNode root) {
			List<Integer> result = new ArrayList<Integer>();
			Stack<TreeNode> stack = new Stack<TreeNode>();
			while(root!=null||!stack.isEmpty()){
				while(root!=null){
					result.add(root.val);
					stack.add(root);
					root = root.left;
				}
				root = stack.pop();
				root = root.right;
			}
			return result;
	   }
}
