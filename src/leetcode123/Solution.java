package leetcode123;

public class Solution {
    public int maxProfit(int[] prices) {
    	int len = prices.length;
    	int profit[] = new int[len];
    	int result = 0;
    	int leftMin = Integer.MAX_VALUE;
    	int leftMaxProfit =0;
    	//pre-process
    	for(int i=0;i<len;i++){
    		if(prices[i]<=leftMin)leftMin= prices[i];
    		if(prices[i]-leftMin>leftMaxProfit)leftMaxProfit = prices[i]-leftMin;
    		profit[i] = leftMaxProfit;
    	}
    	int rightMax  = Integer.MIN_VALUE;
    	for(int i=len-1;i>=0;i--){
    		if(prices[i]>=rightMax)rightMax = prices[i];
    		result = Math.max(result, profit[i]+rightMax-prices[i]);
    	}
    	return result;
    }
}