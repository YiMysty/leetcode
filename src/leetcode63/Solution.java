package leetcode63;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
    	int dp[][] = new int[m][n];
    	dp[0][0] = 1; //base case
    	for(int i=0;i<m;i++)
    		for(int j=0;j<n;j++){
    			if(obstacleGrid[i][j]==1) //this is obstacle
    				dp[i][j] = 0;
    			else{
    				if(i-1>=0)
    					dp[i][j]+=dp[i-1][j];
    				if(j-1>=0)
    					dp[i][j]+=dp[i][j-1];
    			}
    	}
    	return dp[m-1][n-1];
    }
}