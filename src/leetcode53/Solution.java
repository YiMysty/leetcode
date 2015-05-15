package leetcode53;

public class Solution {
	//divide and conquer?
    public int maxSubArray(int[] A) {
    	if(A.length==0)
    		return 0;
    	int max = A[0];
    	int sum = A[0];
    	for(int i=1;i<A.length;i++){
    		if(sum<0)
    			sum = A[i];
    		else{
    			sum+=A[i];
    		}
    		max = Math.max(sum, max);
    	}
    	return max;
    }
}