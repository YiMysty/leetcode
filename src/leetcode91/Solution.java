package leetcode91;

public class Solution {
    public int numDecodings(String s) {
    	if(s.length()==0||s.charAt(0)=='0')
    		return 0;
    	int dp[] = new int[s.length()+1];
    	dp[0] = 1;
    	dp[1] = 1;
    	for(int i=2;i<=s.length();i++){
    		if(s.charAt(i-1)=='0'){
    			if(!isValid(s.charAt(i-2),s.charAt(i-1)))
    				return 0;
    			dp[i] = dp[i-2]; //it must combine the number with the former two
    			
    		}else if(isValid(s.charAt(i-2),s.charAt(i-1))){
    			dp[i] = dp[i-1]+dp[i-2];
    		}else{
    			dp[i] = dp[i-1];
    		}
    	}
    	return dp[s.length()];
    }
    public boolean isValid(char tens,char ones){
    	if(tens=='0')
    		return false;
    	int  num = (tens-'0')*10+(ones-'0');
    	if(num>=10&&num<=26)
    		return true;
    	return false;
    }
}