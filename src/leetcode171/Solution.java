package leetcode171;

public class Solution {
    public int titleToNumber(String s) {
    	int result = 0;
    	int pow = 1;
    	for(int i=s.length()-1;i>=0;i--){
    		result+=pow*(s.charAt(i)-'A'+1);
    		pow*=26;
    	}
    	return result;
    }
}