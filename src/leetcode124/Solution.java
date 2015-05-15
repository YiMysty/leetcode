package leetcode124;
import basic.TreeNode;
public class Solution {
	int result = Integer.MIN_VALUE;
    int min = Integer.MIN_VALUE/2;
	public int maxPathSum(TreeNode root) {
    	findMax(root);
    	return result;
    }
    
    public int findMax(TreeNode root){
    	if(root==null)
    		return min;
    	int leftValue = findMax(root.left);
    	result = Math.max(result, leftValue);
    	int rightValue = findMax(root.right);
    	result = Math.max(result, rightValue);
    	result = Math.max(result, leftValue+rightValue+root.val);
    	int returnValue = Math.max(root.val, Math.max(root.val+leftValue, root.val+rightValue));
    	result=Math.max(result, returnValue);
    	return returnValue;
    }
}