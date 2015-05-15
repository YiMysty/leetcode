package leetcode101;
import java.util.Stack;

import basic.TreeNode;
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
    	if(root==null)
    		return true;
    	Stack<TreeNode> node = new Stack<TreeNode>();
    	node.add(root.left);
    	node.add(root.right);
    	while(!node.isEmpty()){
    		TreeNode left = node.pop();
    		TreeNode right = node.pop();
    		if(left==null||right==null){
    			if(left!=null||right!=null)
    				return false;
    		}
    		if(left!=null&&right!=null){
    			if(left.val!=right.val)
    				return false;
    			node.add(left.left);
    			node.add(right.right);
    			node.add(left.right);
    			node.add(right.left);
    		}
    	}
        return true;
    }
}