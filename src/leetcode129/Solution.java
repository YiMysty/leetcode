package leetcode129;
import basic.TreeNode;
public class Solution {
	public int sumNumbers(TreeNode root) {
    	return traverseAnswer(root,0);
    }
    public int traverseAnswer(TreeNode root,int num){
    	if(root==null) //this is the leaves
    		return 0;
    	num = num*10+root.val;
    	if(root.left==null&&root.right==null)
    		return num;
    	return traverseAnswer(root.left,num)+traverseAnswer(root.right,num);
    }
}