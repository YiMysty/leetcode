package leetcode41;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int firstMissingPositive(int[] A) {
    	int min = 1;
    	if(A.length==0)
    		return 1;
    	Set<Integer> mySet = new HashSet<Integer>();
    	for(int i:A){
    		if(i>0){
    			mySet.add(i);
    		}
    	}
    	while(true){
        	if(!mySet.contains(min))
        		return min;
        	min++;
    	}
    }
}