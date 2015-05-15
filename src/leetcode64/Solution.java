package leetcode64;

public class Solution {
    public int minPathSum(int[][] grid) {
    	int m = grid.length;
    	int n = grid[0].length;
    	int dp[][] = new int[m][n];
    	for(int i=0;i<m;i++)
    		for(int j=0;j<n;j++){
    			if(i-1>=0&&j-1>=0){
    				dp[i][j] = grid[i][j]+Math.min(dp[i-1][j], dp[i][j-1]);
    			}else if(i-1>=0){
    				dp[i][j] = grid[i][j]+dp[i-1][j];
    			}else if(j-1>=0){
    				dp[i][j] = grid[i][j]+dp[i][j-1];
    			}else{
    			    dp[i][j] = grid[i][j];
    			}
    		}
    	return dp[m-1][n-1];
    }
}