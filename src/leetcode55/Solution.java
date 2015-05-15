package leetcode55;

public class Solution {
    public boolean canJump(int[] A) {
    	if(A.length==1)
    		return true;
    	int cur = 0;
    	int maxSteps = 0;
    	for(int i=0;i<A.length;i++){
    		if(i>maxSteps){
    			if(cur<=maxSteps)
    				return false;
    			maxSteps = cur;
    		}
    		cur = Math.max(cur, i+A[i]);
    		if(cur>=A.length-1)
    			return true;
    	}
    	return true;
    }
}