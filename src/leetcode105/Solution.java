package leetcode105;

import java.util.HashMap;

import basic.TreeNode;

public class Solution {
	HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		map(inorder);
		return TreeBuilder(preorder,0,0,preorder.length-1); //just WTF length 
    }
	public TreeNode TreeBuilder(int[] preorder,int order,int u,int d){
		if(order>d)
			return null;
		TreeNode root = new TreeNode(preorder[order]);
		int offset = (int) map.get(preorder[order]);
		root.left = TreeBuilder(preorder,order+1,u,offset-1);
		root.right = TreeBuilder(preorder,order+offset-u+1,offset+1,d);
		
		return root;
	}
	public void map(int[] inorder){
		for(int i=0;i<inorder.length;i++)
			map.put(inorder[i], i);
		return;
	}
}