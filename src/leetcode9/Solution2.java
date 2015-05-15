package leetcode9;

public class Solution2 {
	public class Solution {
	    public boolean isPalindrome(int x) {
	        if(x<10&x>=0)
	            return true;
	        if(x<0||x%10==0)
	        	return false;
	        int rev = 0;
	        while(x>rev){
	        	rev = rev*10+x%10;
	        	x/=10;
	        }
	        if(rev==x||rev/10==x)
	        	return true;
	        return false;
	    }
	}
}
