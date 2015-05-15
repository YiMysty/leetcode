package leetcode71;

import java.util.Stack;

public class Solution_1 {
    public String simplifyPath(String path) {
    	Stack<String> stack = new Stack<String>();
    	String file[] = path.split("/+");
    	for(String s:file){
    		if(s.equals("."))
    			continue;
    		else if(s.equals("..")){
    			if(!stack.isEmpty())
    				stack.pop();
    		}else if(!s.equals("")){
    			stack.add(s);
    			System.out.println(s);
    		}
    	}
    	String result = "";
    	if(stack.isEmpty())
    		return "/";
    	while(!stack.isEmpty())
    		result = "/"+stack.pop()+result;
    	return result;
    }
}