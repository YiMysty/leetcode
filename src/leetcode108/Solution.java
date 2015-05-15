package leetcode108;

import basic.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
    	return buildTree(num,0,num.length-1);
    }
    public TreeNode buildTree(int num[],int start,int end){
    	if(start>end)
    		return null;
    	int middle = start+(end-start)/2;
    	TreeNode node = new TreeNode(num[middle]);
    	node.left = buildTree(num,start,middle-1);
    	node.right = buildTree(num,middle+1,end);
    	return node;
    }
}