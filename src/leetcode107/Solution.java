package leetcode107;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import basic.TreeNode;
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(root==null)
    		return result;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	int layer = 1;
    	int rest  = 0;
    	List<Integer> buffer = new ArrayList<Integer>();
    	while(!queue.isEmpty()){
    		TreeNode node = queue.poll();
    		layer--;
    		buffer.add(node.val);
    		if(node.left!=null){
    			rest++;
    			queue.add(node.left);
    		} 
    		if(node.right!=null){
    			rest++;
    			queue.add(node.right);
    		}
    		if(layer==0){
    			result.add(buffer);
    			buffer = new ArrayList<Integer>();
    			layer = rest;
    			rest = 0;
    		}
    	}
    	Collections.reverse(result);
    	return result;
    }
}