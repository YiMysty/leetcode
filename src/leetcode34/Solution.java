package leetcode34;

public class Solution {
    public int[] searchRange(int[] A, int target) {
    	int low = 0;
    	int high = A.length-1;
    	int result[] = new int[]{-1,-1};
    	int left = -1;
    	int right = -1;
    	//search for the left part
    	while(low<=high){
    		int mid = low+(high-low)/2;
    		if(A[mid]>target){
    			high = mid-1;
    		}else if(A[mid]<target){
    			low = mid+1;
    		}else{
    			left = mid;
    			high = mid-1;
    		}
    	}
    	if(left<0)
    		return result;
    	//search for the right part
    	low = 0;
    	high = A.length-1;
    	while(low<=high){
    		int mid = low+(high-low)/2;
    		if(A[mid]>target){
    			high = mid-1;
    		}else if(A[mid]<target){
    			low = mid+1;
    		}else{
    			right = mid;
    			low = mid+1;
    		}
    	}
    	result[0] = left;
    	result[1] = right;
    	return result;
    }
}