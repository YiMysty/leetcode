package lintcode_desrilization;

import basic.TreeNode;

public class Main {
	public static void main(String args[]){
		Solution s = new Solution();
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		System.out.println(s.serialize(tree));
	}
}
