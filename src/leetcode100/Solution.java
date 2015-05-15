package leetcode100;
import basic.TreeNode;
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p==null&&q==null)
    		return true;
    	if(p==null&&q!=null||q==null&&p!=null)
    		return false;
    	if(p.val!=q.val)
    		return false;
    	return isSameTree(p.left,q.left)&&isSameTree(q.right,p.right);
    }
}