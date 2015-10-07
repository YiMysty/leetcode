package leetcode236;

import basic.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if(root==null)
    		return null;
    	TreeNode node = lowestCommonAncestor(root.left,p,q);
    	if(node!=null)
    		return node;
    	node = lowestCommonAncestor(root.right,p,q);
    	if(node!=null)
    		return node;
    	if(FindNode(root,p)&&FindNode(root,q))
    		return root;
    	return node;
    }
    public boolean FindNode(TreeNode src,TreeNode dst){
    	if(src==null)
    		return false;
    	if(src.val==dst.val)
    		return true;
    	if(FindNode(src.left,dst))
    		return true;
    	if(FindNode(src.right,dst))
    		return true;
    	return false;
    }
}