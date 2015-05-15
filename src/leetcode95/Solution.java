package leetcode95;
import java.util.ArrayList;
import java.util.List;
import basic.TreeNode;
public class Solution {
    public List<TreeNode> generateTrees(int n) {
    	return generateSubTree(1,n);
    }
    public List<TreeNode> generateSubTree(int s,int e){
    	List<TreeNode> result = new ArrayList<TreeNode>();
    	if(s>e){
    		result.add(null);
    		return result;
    	}
    	for(int i=s;i<=e;i++){
    		List<TreeNode> leftPart = generateSubTree(s,i-1);
    		List<TreeNode> rightPart = generateSubTree(i+1,e);
    		for(TreeNode left:leftPart)
    			for(TreeNode right:rightPart){
    				TreeNode node = new TreeNode(i);
    				node.left = left;
    				node.right = right;
    				result.add(node);
    			}
    	}
    	return result;
    }
}