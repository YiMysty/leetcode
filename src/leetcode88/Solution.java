package leetcode88;

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
    	int pointA = m-1;
    	int pointB = n-1;
    	int lastPoint = m+n-1;
    	while(lastPoint>=0){
    		if(pointA<0){
    			A[lastPoint] = B[pointB];
    			pointB--;
    		}else if(pointB<0){
    			A[lastPoint] = A[pointA];
    			pointA--;
    		}else if(A[pointA]>B[pointB]){
    			A[lastPoint] = A[pointA];
    			pointA--;
    		}else{
    			A[lastPoint] = B[pointB];
    			pointB--;
    		}
    		lastPoint--;
    	}
   }
}