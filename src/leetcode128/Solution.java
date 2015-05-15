package leetcode128;

import java.util.HashMap;

public class Solution {
    public int longestConsecutive(int[] num) {
    	int result = 1;
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i=0;i<num.length;i++){
    		if(map.containsKey(num[i]))
    			continue;
    		map.put(num[i], 1);
    		int start = num[i];
    		int end   = num[i];
    		if(map.containsKey(start-1)){
    			start = start-map.get(start-1);
    		}
    		if(map.containsKey(end+1)){
    			end   = end+map.get(end+1);
    		}
    		map.put(start, end-start+1);
    		map.put(end, end-start+1);
    		result = Math.max(result, end-start+1);
    	}
    	return result;
    }
}