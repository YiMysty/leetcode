package leetcode33;

public class Solution {
    public int search(int[] A, int target) {
    	if(A.length==0)
    		return -1;
    	int low = 0;
    	int high = A.length-1;
    	while(low<high){
    		int mid = low+(high-low)/2;
    		if(A[mid]==target)
    			return mid;
    		if(A[mid]<A[low]){ // this is the right part
    			if(target>A[mid]&&target<=A[high]){
    				low = mid+1;
    			}else{
    				high = mid-1;
    			}
    		}else{   //this is the left part
    			if(target>=A[low]&&target<A[mid]){
    				high = mid-1;
    			}else{
    				low = mid+1;
    			}
    		}
    	}
    	if(A[low]==target)
    		return low;
    	return -1;
    }
}