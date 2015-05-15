package leetcode113;
import java.util.ArrayList;
import java.util.List;

import basic.TreeNode;
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        return getPath(root,sum,new ArrayList<Integer>());
    }
    public List<List<Integer>> getPath(TreeNode root,int sum,ArrayList<Integer>Path){
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	ArrayList<Integer> copy = new ArrayList<Integer>(Path);
    	if(root==null)
    		return result;
    	else if(root.left==null&&root.right==null){
    		if(sum==root.val){
    			copy.add(root.val);
    			result.add(copy);
    		}
    		return result;
    	}else if(root.left==null){
    		copy.add(root.val);
    		result.addAll(getPath(root.right,sum-root.val,copy));
    		return result;
    	}else if(root.right==null){
    		copy.add(root.val);
    		result.addAll(getPath(root.left,sum-root.val,copy));
    		return result;
    	}else{
    		copy.add(root.val);
    		result.addAll(getPath(root.right,sum-root.val,copy));
    		result.addAll(getPath(root.left,sum-root.val,copy));
    		return result;
    	}
    }
}