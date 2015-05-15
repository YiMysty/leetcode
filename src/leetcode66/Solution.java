package leetcode66;

public class Solution {
    public int[] plusOne(int[] digits) {
    	int rest = 1;
    	for(int i=digits.length-1;i>=0;i--){
    		digits[i]+=rest;
    		if(digits[i]<10)
    			return digits;
    		digits[i] = 0;
    	}
    	int result[] = new int[digits.length+1];
    	result[0] = 1;
    	return result;
    }
}