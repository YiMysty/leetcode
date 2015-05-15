package leetcode09;

public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        boolean isValid = false;
        for(int i = len-1;i>=0;i--){
        	digits[i] = digits[i]+1;
        	if(digits[i]>=10){
        		digits[i] = digits[i]%10;
        		if(i==0)
        			isValid = true;
        		continue;
        	}else{
        		break;
        	}
        }
        if(isValid){
        	int [] newdigits = new int[len+1];
        	newdigits[0] = 1;
        	for(int i=0;i<len;i++)
        		newdigits[i+1] = digits[i];
        }
        return digits;
    }
}
