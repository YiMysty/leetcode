package leetcode94;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import basic.TreeNode;
public class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while(!stack.isEmpty()||root!=null){
    		while(root!=null){
    			stack.push(root);
    			root = root.left;
    		}
    		//the left is null
    		root = stack.pop();
    		result.add(root.val);
    		root = root.right;
    	}
    	return result;
    }
}
