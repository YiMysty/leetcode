package leetcode14;


public class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length<=0)
    		return "";
    	StringBuilder result = new StringBuilder();
    	boolean isEnd = false;
    	for(int i=0;!isEnd;i++){
    		if(i==strs[0].length())
    			break;
    		boolean isSame = true;
    		char c = strs[0].charAt(i);
    		for(String s:strs){
    			if(i==s.length()||s.charAt(i)!=c){
    				isSame = false;
    				break;
    			}
    		}
    		if(isSame)
    			result.append(c);
    		else
    			break;
    	}
    	return result.toString();
    }
}