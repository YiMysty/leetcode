package leetcode67;

public class Solution {
    public String addBinary(String a, String b) {
    	if(a.length()<b.length())
    		return addBinary(b,a);
    	StringBuilder aa = new StringBuilder(a).reverse();
    	StringBuilder bb = new StringBuilder(b).reverse();
    	StringBuilder result = new StringBuilder();
    	int rest = 0;
    	for(int i=0;i<bb.length();i++){
    		int num = aa.charAt(i)+bb.charAt(i)-'0'-'0'+rest;
    		rest = num/2; //for the next number
    		result.append(num%2);
    	}
    	for(int i=bb.length();i<aa.length();i++){
    		int num = aa.charAt(i)-'0'+rest;
    		rest  =num/2;
    		result.append(num%2);
    	}
    	if(rest>0)
    		result.append(1);
    	return result.reverse().toString();
    }
}