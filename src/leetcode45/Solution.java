package leetcode45;

public class Solution {
    public int jump(int[] A) {
    	//Take the biggest each steps
    	int last = 0;
    	int steps = 0;
    	int maxJump  = 0;
    	for(int i=0;i<A.length;i++){
    		if(i>last){ //I can jum out of the space
    			last = maxJump;
    			steps++;
    		}
    		maxJump = Math.max(maxJump, A[i]+i); //the maximum Jump index
    	}
    	return steps;
    }
}