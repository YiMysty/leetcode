package leetcode111;

import basic.TreeNode;

public class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
        	return 0;
        int LDepth = minDepth(root.left);
        int RDepth = minDepth(root.right);
        if(LDepth==0&&RDepth==0) //this is the leaves
        	return 1;
        else if(LDepth==0||RDepth==0)
        	return LDepth+RDepth+1;
        else
        	return Math.min(LDepth, RDepth)+1;
    }
}