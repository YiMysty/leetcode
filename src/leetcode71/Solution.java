package leetcode71;
import java.util.Stack;
public class Solution {
    public String simplifyPath(String path) {
    	String array[] = path.split("/+");
    	Stack <String> directory = new Stack<String>();
    	for(int i=0;i<array.length;i++){
    		if(array[i].equals("..")){
    			if(!directory.isEmpty()){
    				directory.pop();
    			}
    		}else if(array[i].equals(".")){
    			continue;
    		}else if(!array[i].equals("")){
    			directory.push(array[i]);
    		}
    	}
    	if(directory.isEmpty())
    		return "/";
    	String root = "";
    	while(!directory.isEmpty()){
    		root="/"+directory.pop()+root;
    	}
    	return root;
    }
}