package leetcode105;
import java.util.HashMap;
import basic.TreeNode;
public class Solution2 {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		buildMap(inorder);
		return TreeBuilder(preorder,0,0,preorder.length-1);
    }

	void buildMap(int []inorder){
		for(int i=0;i<inorder.length;i++)
			map.put(inorder[i], i);
	}
	
	public TreeNode TreeBuilder(int[]preorder,int pos,int down,int up){
		if(down>up)
			return null;
		TreeNode node = new TreeNode(preorder[pos]);
		int orderPos = map.get(preorder[pos]);//How many left at the left part.
		node.left = TreeBuilder(preorder,pos+1,down,orderPos-1);
		node.right = TreeBuilder(preorder,pos+orderPos-down+1,orderPos+1,up);
		return node;
	}
}