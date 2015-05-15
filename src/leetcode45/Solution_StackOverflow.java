package leetcode45;

public class Solution_StackOverflow {
	int steps = Integer.MAX_VALUE;
    public int jump(int[] A) {
    	quickJump(0,A,0);
    	return steps;
    }
    public boolean quickJump(int pos,int []A,int step){
    	if(pos+A[pos]>=A.length){
    		steps = step+1;
    		return true;
    	}else{
    		for(int i=A[pos];i>0;i--){
    			if(quickJump(i+A[pos],A,step+1))
    				return true;
    		}
    	}
    	return false;
    }
}