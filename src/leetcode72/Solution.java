package leetcode72;

public class Solution {
    public int minDistance(String word1, String word2) {
    	if(word1.length()<word2.length())
    		return minDistance(word2,word1);
    	if(word2.length()==0)
    		return word1.length();
    	int dp[][] = new int[word1.length()+1][word2.length()+1];
    	for(int i=0;i<=word2.length();i++){
    		dp[0][i] = i;
    	}for(int i=0;i<=word1.length();i++){
    		dp[i][0] = i;
    	}
    	for(int i=1;i<=word1.length();i++){
    		for(int j=1;j<=word2.length();j++){
    			if(word1.charAt(i-1)==word2.charAt(j-1))
    				dp[i][j] = returnSmall(dp[i-1][j-1],dp[i][j-1],dp[i-1][j]);
    			else{
    				dp[i][j] =1+ returnSmall(dp[i-1][j-1],dp[i][j-1],dp[i-1][j]);
    			}
    		}
    	}
    	return dp[word1.length()][word2.length()];
    }
    public int returnSmall(int a,int b,int c){
    	int small = a;
    	if(small>b)
    		small= b;
    	if(small>c)
    		small = c;
    	return small;
    }
}