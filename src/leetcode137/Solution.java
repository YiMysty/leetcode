package leetcode137;
public class Solution {
	// this solution with constant space
    public int singleNumber(int[] A) {
    	int bit[] = new int [32];
    	int result = 0;
    	for(int k=0;k<32;k++){
    		for(int i=0;i<A.length;i++){
    			bit[k]+=(A[i]>>k&1);
    		}
    		result |= (bit[k]%3<<k);//this number only shows once, if the number perhaps shows twice, then we need consider the result mod 2
    	}
    	return result;
    }
}