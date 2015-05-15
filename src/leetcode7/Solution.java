package leetcode7;

public class Solution {
    public int reverse(int x) {
    	boolean isNeg = Math.abs(x)==x?false:true;
    	x = Math.abs(x);
    	long result = 0;
    	while(x>0){
    		result = result*10+x%10;
    		x/=10;
    	}
    	if(result>Integer.MAX_VALUE)
    		return 0;
    	if(isNeg)
    		result = 0-result;
    	return (int)result;
    }
}