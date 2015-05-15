package leetcode137;

public class Solution2 {
    public int singleNumber(int[] A) {
    	int ones=0,twos=0,threes=0;
    	for(int i=0;i<A.length;i++){
    		twos |= A[i]&ones; //shows twice.
    		ones = A[i]^ones;
    		threes= twos&ones;
    		ones &= ~threes;
    		twos &= ~threes;
    		
    	}
    	return ones;
    }
}
