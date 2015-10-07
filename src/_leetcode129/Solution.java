package _leetcode129;

import java.util.ArrayList;
import java.util.List;

import basic.TreeNode;

public class Solution {
    public int sumNumbers(TreeNode root) {
    	if(root==null)
    		return 0;
    	List<String> list= getResult(root);
    	
    	int ans = 0;
    	for(String i:list)
    		ans+=Integer.parseInt(i);
    	return ans;
    	
    }
    public List<String> getResult(TreeNode root){
    	List<String> result = new ArrayList<String>();
    	List<String> left,right = null;
    	if(root.left==null&&root.right==null){
    		result.add(root.val+"");
    		return result;
    	}
    		left = getResult(root.left);
    	if(root.right!=null)
    		right = getResult(root.right);
    	for(String i:left)
    		result.add(root.val+i);
    	for(String i:right)
    		result.add(root.val+i);
    	return result;
    }
}