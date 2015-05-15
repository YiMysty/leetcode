package leetcode65;
public class Solution{
	public  boolean isNumber(final String s) {
	    if (s.contains("f")) {
	        return false;
	    }
	    if (s.contains("D")) {
	        return false;
	    }
	
	    try {
	        Double.parseDouble(s);
	    } catch (NumberFormatException e) {
	        return false;
	    }
	    return true;
	}
}