package leetcode173;

import java.util.Stack;

import basic.TreeNode;
/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
public class BSTIterator {
	TreeNode node;
	Stack<Integer> stack;
    public BSTIterator(TreeNode root) {
        node = root;
        stack = new Stack<Integer>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
    	if(stack.isEmpty()||node==null)
    		return false;
    	return true;
    }

    /** @return the next smallest number */
    public int next() {
        while(node!=null){
        	stack.add(node.val);
        	node = node.left;
        }
        int num = stack.pop();
        node = node.right;
        return num;
    }
}