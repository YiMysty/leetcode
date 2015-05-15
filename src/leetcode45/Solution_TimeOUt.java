package leetcode45;

public class Solution_TimeOUt {
	//Time out
    public int jump(int[] A) {
    	int dp[] = new int[A.length];
    	for(int i=0;i<A.length;i++)
    		dp[i] = Integer.MAX_VALUE;
    	dp[0] = 0;
    	for(int i=0;i<A.length;i++){
    		if(dp[i]==Integer.MAX_VALUE) //unreachable
    			continue;
    		for(int j=1;j<A[i];j++){
    			if(j+i>=A.length)
    				break;
    			dp[j+i] = Math.min(dp[i]+1, dp[j+i]);
    		}
    	}
    	return dp[A.length-1];
    }
}