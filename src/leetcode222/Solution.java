package leetcode222;
import basic.TreeNode;
public class Solution {
    public int countNodes(TreeNode root) {
    	if(root==null)
    		return 0;
    	if(root.left==null&root.right==null)
    		return 1;
    	int count = 0;
    	int h1 = leftH(root.left);
    	while(root!=null){
    		int h2 = leftH(root.right);
    		if(h1==h2){
    			count += 1<<h1;
    			root = root.right;
    		}else{
    			count += 1<<h2;
    			root = root.left;
    		}
    		h1--;
    	}
    	return count;
    }
    public int leftH(TreeNode root){
    	int count = 0;
    	while(root!=null){
    		root = root.left;
    		count++;
    	}
    	return count;
    }
}