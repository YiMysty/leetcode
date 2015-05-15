package leetcode9;

public class Solution {
    public boolean isPalindrome(int x) {
    	if(x<0)
    		return false;
    	String s = x+"";
    	int low = 0;
    	int high = s.length()-1;
    	while(low<=high){
    		if(s.charAt(low)!=s.charAt(high))
    			return false;
    		low++;
    		high--;
    	}
    	return true;
    }
}