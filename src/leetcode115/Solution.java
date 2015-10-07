package leetcode115;

public class Solution {
    public int numDistinct(String S, String T) {
    	int len = T.length();
    	int result[] = new int[len-1];
    	for(int i=0;i<S.length();i++){
    		for(int j=len-1;j>=0;j--){
    			if(S.charAt(i)==T.charAt(j)){
    				if(j==0)
    					result[0]++;
    				else
    					result[j] = result[j-1];
    			}
    		}
    	}
    	return result[len-1];
    }
}