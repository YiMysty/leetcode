package leetcode75;

public class Solution {
    public void sortColors(int[] A) {
        int low = 0;
        int high = A.length-1;
        for(int i=0;i<A.length&&low<high;i++){
        	if(A[i]==0&&i>=low){
        		swap(i,low,A);
        		low++;
        		i-=1;
        	}else if(A[i]==2&&i<=high){
        		swap(i,high,A);
        		high--;
        		i-=1;
        	}
        }
    }
    public void swap(int i,int j,int[]A){
    	int buff = A[i];
    	A[i] = A[j];
    	A[j] = buff;
    }
}