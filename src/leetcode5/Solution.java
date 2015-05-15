package leetcode5;

public class Solution {
	public String longestPalindrome(String s) {
		boolean dp[][] = new boolean[s.length()][s.length()];
		int left = 0;
		int right = 0;
		int max = 1;
		for(int k=0;k<s.length();k++){
			for(int i=0;i+k<s.length();i++){
				int j = i+k;
				if(j<=i)
					dp[i][j] = true;
				else if(s.charAt(j)==s.charAt(i)){
					if(i+1>j-1)
						dp[i+1][j-1] = true;
					dp[i][j] = dp[i+1][j-1];
					if(dp[i][j]){
						if(j-i+1>max){
							left = i;
							right= j;
							max = j-i+1;
						}
					}
				}else{
					dp[i][j] = false;
				}
			}
		}
		if(left-right+1==s.length())//this is the extreme situation
			return s;
		return s.substring(left,right+1);
	}
}
