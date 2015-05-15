package leetcode145;
import java.util.ArrayList;
import java.util.List;
import basic.TreeNode;
public class Solution_r {
    List<Integer> result = new ArrayList<Integer>();
	public List<Integer> postorderTraversal(TreeNode root) {
    	if(root==null)
    		return result;
    	postorder(root);
    	return result;
    }
	public void postorder(TreeNode root){
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		result.add(root.val);
		
	}
}