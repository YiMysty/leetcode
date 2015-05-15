package leetcode110;

import basic.TreeNode;

public class Solution {
    boolean isBalance = true;
	public boolean isBalanced(TreeNode root) {
    	preOrder(root);
    	return isBalance;
    }
    public int preOrder(TreeNode root){
    	if(root==null||!isBalance)
    		return 0;
    	int LLevel = preOrder(root.left);
    	int RLevel = preOrder(root.right);
    	if(Math.abs(LLevel-RLevel)>1)
    		isBalance = false;
    	return Math.max(LLevel, RLevel)+1;
    }
}