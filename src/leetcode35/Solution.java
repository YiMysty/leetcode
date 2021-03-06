package leetcode35;

public class Solution {
    public int searchInsert(int[] A, int target) {
    	if(A.length==0)
    		return 0;
    	int low = 0;
    	int high = A.length-1;
    	while(low<high){
    		int mid = low+(high-low)/2;
    		if(target>A[mid]){
    			low = mid+1;
    		}else{
    			high = mid-1;
    			
    		}
    	}
    	if(low<0)
    		return 0; 
    	if(A[low]<target)
    		return low+1;
    	return low;
    }
}