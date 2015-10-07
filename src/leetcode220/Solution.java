package leetcode220;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    	HashMap<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
    	for(int i=0;i<nums.length;i++){
    		Iterator iter = map.entrySet().iterator(); 
    		while (iter.hasNext()) { 
				Map.Entry entry = (Map.Entry) iter.next(); 
    		    int key = (int) entry.getKey();
    		    if(Math.abs(key-nums[i])<=t){
	    		    for(int m:map.get(key)){
	    		    	if(i-m<=k)
	    		    		return true;
	    		    }
    		    }
    		}
    		if(map.containsKey(nums[i])){
    			map.get(nums[i]).add(i);
    		}else{
    			ArrayList<Integer> list = new ArrayList<Integer>();
    			list.add(i);
    			map.put(nums[i], list);
    		}
    	}
        return false;
    }
}