package leetcode168;

public class Solution {
    public String convertToTitle(int n) {
    	if(n==1)
    		return "A";
    	int num = n;
    	int pow = 1;
    	if(n%26==0){
    		while(n>1){
    			n/=26;
    			pow*=26;
    		}
    	}else{
    		while(n>0){
    			n/=26;
    			pow*=26;
    		}
    	}
    	pow/=26;
    	String result = "";
    	while(num>0){
    		int index = num/pow;
    		result+=Character.valueOf((char)('A'-1+index));
    		num-=index*pow;
    		pow/=26;
    	}
    	return result;
    }
}