package leetcode101;
import java.util.Stack;
import basic.TreeNode;
public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
    	if(root==null)
    		return true;
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(root.left);
    	stack.push(root.right);
    	while(!stack.isEmpty()){
    		TreeNode left = stack.pop();
    		TreeNode right = stack.pop();
    		if(left==null&&right!=null||left!=null&&right==null)
    			return false;
    		else if(left!=null&&right!=null){
    			if(left.val!=right.val)
    				return false;
    			stack.push(left.left);
    			stack.push(right.right);
    			stack.push(left.right);
    			stack.push(right.left);
    		}
    	}
    	return true;
    }
}
