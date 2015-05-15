package leetcode32;
public class Solution {
	//(()(((()
    public int longestValidParentheses(String s) {
    	int num[] = new int[s.length()];
    	int open = 0;
    	int result = 0;
    	
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)=='('){
    			open++;
    		}else if(open>0){
    			num[i] = num[i-1]+(i-num[i-1]-2>0?num[i-num[i-1]-2]:0);
    			open--;
    		}
    		result = Math.max(result, num[i]);
    	}
    	return result;
    }
}
