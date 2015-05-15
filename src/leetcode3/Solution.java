package leetcode3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int num = 0;
        Set<Character> container = new HashSet<Character>();
        int startPointer = 0;
        for(int i=0;i<s.length();i++){
        	if(!container.contains(s.charAt(i))){
        		num++;
        		result = Math.max(num, result);
        		container.add(s.charAt(i));
        	}else{
        		for(int j=startPointer;j<s.length();j++){
        			container.remove(s.charAt(j));
        			num--;
        			startPointer++;
        			if(s.charAt(j)==s.charAt(i))
        				break;
        		}
        		num++;
        		container.add(s.charAt(i));
        	}
        }
        return result;
    }
}