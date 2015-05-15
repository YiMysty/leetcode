package leetcode05;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length==1)
    		return strs[0];
    	String cmp = compare(strs[0],strs[1]);
    	for(int i=2;i<strs.length;i++){
    		cmp = compare(cmp,strs[i]);
    	}
        return cmp;
    }
    String compare(String s1,String s2){
    	String s = "";
    	int length = s1.length()>s2.length()?s2.length():s1.length();
    	for(int i=0;i<length;i++){
    		if(s1.charAt(i)!=s2.charAt(i))
    			break;
    		s = s+ Character.valueOf(s1.charAt(i));
    	}
    	return s;
    }
    
}