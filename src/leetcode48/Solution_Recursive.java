package leetcode48;

public class Solution_Recursive {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        if(n==1)
        	return;
        doRotate(matrix,0,n);
    }
    public void doRotate(int[][] matrix,int level,int n){
    	//we change at the up up->right
    	for(int i=level;i<n-level;i++){ 
    		int buffer = matrix[level][i];
    		matrix[level][i] = matrix[i][n-1-level];
    		matrix[i][n-1-level] = buffer;
        }
    	//we change the up->bottom
    	for(int i=level;i<n-level;i++){
    		int buffer = matrix[n-1-level][n-1-i];
    		matrix[n-1-level][n-1-i] = matrix[level][i];
    		matrix[level][i] = buffer;
    	}
    	//we change the up->right
    	for(int i=level;i<n-level;i++){
    		int buffer = matrix[n-1-i][level];
    		matrix[n-1-i][level] = matrix[level][i];
    		matrix[level][i] = buffer;
    	}
    	if(level<n/2-1)
    		doRotate(matrix,level+1,n);
    	
    }
}