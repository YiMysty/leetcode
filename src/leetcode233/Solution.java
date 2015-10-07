package leetcode233;
public class Solution {
    public int countDigitOne(int n) {
    	int temp = n;
    	int bit = 0;
    	while(temp>0){
    		temp/=10;
    		bit++;
    	}
    	int result = 0;
    	for(int i=0;i<bit;i++){
    		int now = (n/tenPow(i))%10;  //get the process bit..
			int left =   n/tenPow(i+1);
			int right =  n-(n/tenPow(i))*tenPow(i);
    		if(now>1){
    			result  +=(left+1)*tenPow(i);
    		}else if(now==1){
    			result  +=(left)*tenPow(i)+(right+1);
    		}else{
    			result 	+= left*tenPow(i);
    		}
    	}
    	return result;
    }
    public int tenPow(int bit){
    	return (int)Math.pow(10, bit);
    }
}