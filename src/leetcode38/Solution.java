package leetcode38;

public class Solution {
    public String countAndSay(int n) {
        StringBuilder result = new StringBuilder("1");
        for(int i=1;i<n;i++){
        	int count = 1;
        	char prev  = result.charAt(0);
        	StringBuilder buff = new StringBuilder();
        	for(int j=1;j<result.length();j++){
        		if(result.charAt(j)==prev)
        			count++;
        		else{
        			buff.append(count);
        			buff.append(prev);
        			count = 1;
        			prev = result.charAt(j);
        		}
        	}
        	buff.append(count);
        	buff.append(prev);
        	result = buff;
        }
        return result.toString();
    }
}