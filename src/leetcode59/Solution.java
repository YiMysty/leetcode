package leetcode59;

public class Solution {
    public int[][] generateMatrix(int n) {
    	int matrix[][] = new int[n][n];
    	generateMatrix(matrix,1,0);
    	return matrix;
    }
    public void generateMatrix(int[][]matrix,int count,int level){
    	if(2*level+1>matrix.length)
    		return;
    	int n = matrix.length;
    	for(int i=level;i<n-level;i++){ //this is the upperside
    		matrix[level][i] = count++;
    	}
    	for(int i=level+1;i<n-level;i++){ //this is right side
    		matrix[i][n-level-1] = count++;
    	}
    	for(int i=n-level-2;i>=level&&2*level+1<n;i--){ //this is the downside
    		matrix[n-level-1][i] = count++;
    	}
    	for(int i=n-level-2;i>level&&2*level+1<n;i--){ //this is the left part
    		matrix[i][level] = count++;
    	}
    	generateMatrix(matrix,count,level+1);
    }
}