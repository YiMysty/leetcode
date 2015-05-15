package leetcode106;
import java.util.HashMap;
import basic.TreeNode;
public class Solution {

	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		buildMap(inorder);
		return buildTree(postorder,0,postorder.length-1,0,inorder.length-1);
    }
	public void buildMap(int []inorder){
		for(int i=0;i<inorder.length;i++){
			map.put(inorder[i], i);
		}
	}
	TreeNode buildTree(int[] postorder,int ps,int pe,int is,int ie){
		if(ps>pe)
			return null;
		TreeNode node = new TreeNode(postorder[pe]);
		int pos = map.get(postorder[pe]);
		node.left = buildTree(postorder,ps,ps+pos-is-1,is,pos-1);
		node.right = buildTree(postorder,ps+pos-is,pe-1,pos+1,ie);
		return node;
	}
}