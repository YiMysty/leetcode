package leetcode74;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	int rlow = 0;
    	int rhigh = matrix.length-1;
    	while(rlow<rhigh){
    		int mid = rlow+(rhigh-rlow)/2;
    		if(matrix[mid][0]==target)
    			return true;
    		else if(matrix[mid][0]>target)
    			rhigh = mid-1;
    		else
    			rlow = mid+1;
    	}
    	if(matrix[rlow][0]>target)
    		rlow-=1;
    	if(rlow<0)
    		return false;
    	int low = 0;
    	int high = matrix[0].length-1;
    	while(low<high){
    		int mid = low+(high-low)/2;
    		if(matrix[rlow][mid]==target)
    			return true;
    		else if(matrix[rlow][mid]>target)
    			high = mid-1;
    		else
    			low = mid+1;
    	}
    	if(matrix[rlow][low]==target)
    		return true;
    	return false;
    }
}