package leetcode32;

public class Solution2 {
    public int longestValidParentheses(String s) {
    	int dp[] = new int[s.length()];
    	int open = 0;
    	int result = 0;
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)=='(')
    			open++;
    		if(s.charAt(i)==')'&&open>0){
    			dp[i] = dp[i-1]+2+i-dp[i-1]-2>=0?dp[i-dp[i-1]-2]:0;
    			open--;
    		}
    		result = Math.max(result, dp[i]);
    	}
    	return result;
    }
}