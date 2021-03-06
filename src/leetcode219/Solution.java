package leetcode219;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	HashMap<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
    	for(int i=0;i<nums.length;i++){
    		if(map.containsKey(nums[i])){
    			for(int m:map.get(nums[i])){
    				if(i-m==k)
    					return true;
    			}
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