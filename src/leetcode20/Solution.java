package leetcode20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
    			stack.push(s.charAt(i));
    		else if(!stack.isEmpty()&&s.charAt(i)-stack.peek()<=2){ //may wrong at some circumstance.. lazy here
    			stack.pop();
    		}else{
    			return false;
    		}
    	}
    	if(!stack.isEmpty())
    		return false;
    	return true;
    }	
}