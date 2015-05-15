package leetcode48;

public class Solution {
    public void rotate(int[][] matrix) {
    	//for clockwise swap the up and down, then switch the symmetry.
    	int len = matrix.length;
    	for(int i=0;len>2*i+1;i++){ //this is row
    		for(int j=0;j<len;j++){
    			int temp = matrix[i][j];
    			matrix[i][j] = matrix[len-1-i][j];
    			matrix[len-1-i][j] = temp;
    		}
    	}
    	//rotate the diagnosis
    	for(int i=0;i<len;i++)
    		for(int j=i+1;j<len;j++){
    			int temp = matrix[i][j];
    			matrix[i][j] = matrix[j][i];
    			matrix[j][i] = temp;
    		}
    }
}