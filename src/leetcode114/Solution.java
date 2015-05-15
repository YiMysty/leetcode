package leetcode114;
import basic.TreeNode;
public class Solution {
    public void flatten(TreeNode root) {
    	doFlatten(root);
    }
    public TreeNode doFlatten(TreeNode root){
    	if(root==null)
    		return root;
    	TreeNode head = root;
    	TreeNode left = doFlatten(root.left);
    	TreeNode right = doFlatten(root.right);
    	root.left = null;
    	root.right = left;
    	while(root.right!=null)
    		root = root.right;
    	root.right = right;
    	return head;
    }
}