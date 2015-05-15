package leetcode29;

public class Solution {
    public int divide(int dividend, int divisor) {
    	if(dividend==0)
    		return 0;
    	boolean isNeg = (dividend<0)^(divisor<0);
    	long d1 = dividend;
    	long d2 = divisor;
    	long result = div(Math.abs(d1),Math.abs(d2));
    	result = isNeg?0-result:result;
    	System.out.println(result);
    	if(result>Integer.MAX_VALUE)
    		return Integer.MAX_VALUE;
    	else if(result<Integer.MIN_VALUE)
    		return Integer.MIN_VALUE;
    	else
    		return (int)result;
    }
    public long div(long dividend,long divisor){
    	if(dividend<divisor)
    		return 0;
    	int sum    = 1;
    	int prevSum = sum;
    	long prev   = divisor;
    	long div    = divisor;
    	while(dividend-div>0){
    		prevSum = sum;
    		sum+=sum;
    		prev = div;
    		div+=div;
    	}
    	return prevSum+div(dividend-prev,divisor);
    }
}