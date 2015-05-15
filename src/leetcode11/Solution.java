package leetcode11;
public class Solution {
    public int[] searchRange(int[] A, int target) {
    	int returnValue[] = new int[2];
    	returnValue[0] = searchRangeUpLimit(A,target);
    	returnValue[1] = searchRangeDownLimit(A,target);
    	return returnValue;
    }
    public int searchRangeUpLimit(int[] A, int target) {
        int  start = 0;
        int end = A.length-1;
        int i = start;
        int j = end;
        while(i<j){
            int mid = (i+j)/2;
            if(A[mid]==target)
            	j = mid;
            else if(A[mid]>target)
                j = mid-1;
            else if(A[mid]<target)
                i = mid+1;
        }
        if(A[i]!=target)
        	return -1;
        return i;
    }
    public int searchRangeDownLimit(int[]A,int target){
        int  start = 0;
        int end = A.length-1;
        int i = start;
        int j = end;
        while(i<j){
            int mid = (i+j)/2;
            if(A[mid]==target)
            	i = mid+1;
            else if(A[mid]>target)
                j = mid-1;
            else if(A[mid]<target)
                i = mid+1;
        }
        if(A[i]==target)
        	return i;
        if(A[i-1]!=target)
        	return -1;
        return i-1;
    }
}