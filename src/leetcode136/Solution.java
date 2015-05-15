package leetcode136;

public class Solution {
    public int singleNumber(int[] A) {
    	int number = A[0];
    	for(int i=1;i<A.length;i++){
    		number^=A[i];
    	}
    	return number;
    }
}