package leetcode211;

import java.util.ArrayList;
import java.util.List;

public class WordDictionary {
    TreeNode root = null;
    // Adds a word into the data structure.
    public void addWord(String word) {
        root.addWord(word);
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return root.searchWord(word);
    }
    
    public WordDictionary(){
        root = new TreeNode('#');    
    }
}

class TreeNode{
    char ch;
    List<TreeNode> child;
    public TreeNode(char ch){
        this.ch = ch;
        child = new ArrayList<TreeNode>();
    }
    public TreeNode getChild(char c){
        for(TreeNode node:child){
            if(node.equals(c))
                return node;
        }
        return null;
    }
    
    public boolean equals(char ch){
        return this.ch==ch;
    }
    
    public boolean searchWord(String word){
        if(word==null||word.equals(""))
            return true;
        char ch = word.charAt(0);
        if(ch=='.'){
            for(TreeNode node:child){
                if(node.searchWord(word.substring(1))){
                    return true;
                }
            }
            return false;
        }else{
            TreeNode node = this.getChild(ch);
            if(node==null)
                return false;
            return node.searchWord(word.substring(1));
        }
    }
    
    public void addWord(String word){
        if(word==null||word.equals(""))
            return;
        char ch = word.charAt(0);
        TreeNode node = this.getChild(ch);
        if(node==null){
            node = new TreeNode(ch);
            this.addChild(node);
        }
        node.addWord(word.substring(1));
    }
    
    public void addChild(TreeNode node){
        child.add(node);
    }
    
}