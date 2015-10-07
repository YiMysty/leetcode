package leetcode279;

public class Solution {
    public int numSquares(int n) {
        if(isSquare(n)){
        	return 1;
        }
        int result = 0;
        int number = (int)Math.sqrt(n);
        for(int i=number-1;i>=1;i++){
        	result = Math.min(result, 1+numSquares(n-i*i));
        }
        return result;
    }
    public boolean isSquare(int n){
    	int result =(int) Math.sqrt(n);
    	return n==result*result;
    }
}
	
