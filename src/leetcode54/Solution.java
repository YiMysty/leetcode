package leetcode54;
import java.util.ArrayList;
import java.util.List;
public class Solution {
	int nRows = 0;
	int nCols  = 0;
    public List<Integer> spiralOrder(int[][] matrix) {
    	if(matrix.length==0)
    		return new ArrayList<Integer>();
    	nRows = matrix.length;
    	nCols = matrix[0].length;
    	return doSpiral(0,matrix);
    }
    public List<Integer> doSpiral(int level,int[][] matrix){
    	List<Integer> result = new ArrayList<Integer>();
    	if(2*level+1>nRows||2*level+1>nCols) // the end of the recursion
    		return result;
    	for(int i=level;i<nCols-level;i++){ //the upper part
    		result.add(matrix[level][i]);
    	}
    	for(int i=level+1;i<nRows-level;i++){ //the right part
    		result.add(matrix[i][nCols-level-1]);
    	}
    	for(int i=nCols-level-2;i>=level&&nRows-1-level>level;i--){ //the down part
    		System.out.println(matrix[nRows-1-level][i]);
    		result.add(matrix[nRows-1-level][i]);
    	}
    	for(int i=nRows-2-level;i>level&&level<nCols-level-1;i--){//the left part
    		result.add(matrix[i][level]);
    	}
    	result.addAll(doSpiral(level+1,matrix));
    	return result;
    }
}