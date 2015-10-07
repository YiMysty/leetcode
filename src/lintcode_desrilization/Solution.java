package lintcode_desrilization;

import java.util.LinkedList;
import java.util.Queue;

import basic.TreeNode;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
class Solution {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        String s = "";
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            root = queue.poll();
        	if(root==null){
        		s+=",#";
        	}else{
        		s+=","+root.val;
        		queue.add(root.left);
        		queue.add(root.right);
        	}
        }
        return s.substring(1);
        
    }
    
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        TreeNode root = null;
        String [] num = data.split(",");
        int index = 0;
        if(num[index].equals("#"))
            return root;
        TreeNode node = genTreeNode(num[index++]);
        root = node;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);
        while(index<num.length){
            node = queue.poll();
            node.left = genTreeNode(num[index++]);
            if(node.left!=null)
                queue.add(node.left);
            node.right = genTreeNode(num[index++]);
            if(node.right!=null)
                queue.add(node.right);
        }
        return root;
    }
    
    public TreeNode genTreeNode(String s){
        if(s.equals("#"))
            return null;
        return new TreeNode(Integer.parseInt(s));
    }
}

