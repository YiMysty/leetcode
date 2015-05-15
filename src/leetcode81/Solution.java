package leetcode81;

public class Solution {
    public boolean search(int[] A, int target) {
    	if(A.length==0)
    		return false;
    	int low = 0;
    	int high = A.length-1;
    	while(low<high){
    		int mid = low+(high-low)/2;
    		if(A[mid]==target)
    			return true;
    		if(A[mid]>A[low]){
    			if(target<A[mid]&&target>=A[low]){
    				high = mid-1;
    			}else{
    				low = mid+1;
    			}
    		}else if(A[mid]==A[low]){
    			low++;
    		}else{
    			if(target>A[mid]&&target<=A[high])
    				low = mid+1;
    			else
    				high = mid-1;
    		}
    	}
    	return false;
    }
}