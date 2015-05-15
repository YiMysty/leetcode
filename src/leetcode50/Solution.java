package leetcode50;

public class Solution {
    public double pow(double x, int n) {
    	if(x==0)
    		return 0;
    	if(n<0){
    		x = 1/x;
    		n = Math.abs(n);
    	}
    	double result = 1;
    	while(n>0){
    		if((n&1)==1){
    			result *=x;
    		}
    		x*=x;
    		n = n>>1;
    	}
    	return result;
    }
}