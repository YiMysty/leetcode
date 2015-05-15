package leetcode58;

public class Solution {
    public int lengthOfLastWord(String s) {
    	String ss[] = s.split(" ");
    	if(ss.length==0)
    		return 0;
    	return ss[ss.length-1].length();
    }
}