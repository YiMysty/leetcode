package leetcode98;

import basic.TreeNode;

public class Solution {
	boolean result = true;
	long LOW = Long.MIN_VALUE;
	long HIGH = Long.MAX_VALUE;
    public boolean isValidBST(TreeNode root) {
    	if(root==null)
    		return true;
    	return forder(root.left,LOW,root.val)&&forder(root.right,root.val,HIGH); 
    }
    public boolean forder(TreeNode node,long low,long high){
    	if(node==null)
    		return true;
    	if(node.val<high&&node.val>low){
    		return forder(node.left,low,node.val)&&forder(node.right,node.val,high);
    	}
    	return false;
    }
}