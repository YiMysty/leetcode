package leetcode104;

import basic.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
    	if(root==null)
    		return 0;
    	return countDepth(root,1);
    }
    public int countDepth(TreeNode root,int level){
    	int result = level;
    	if(root==null)
    		return level;
    	if(root.left!=null)
    		result = Math.max(result, countDepth(root.left,level+1));
    	if(root.right!=null)
    		result = Math.max(result, countDepth(root.right,level+1));
    	return result;
    }
}