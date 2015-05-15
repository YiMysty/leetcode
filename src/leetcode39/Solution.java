package leetcode39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	boolean dp[][]  = new boolean[candidates.length][target];
    	List<List<List<Integer>>> trace = new ArrayList<List<List<Integer>>>();
    	dp[0][0] = true;
    	for(int i=0;i<target;i++){
    		List<List<Integer>> result = new ArrayList<List<Integer>>();
    		
    		trace.add(result);
    	}
    	return trace.get(target-1);
    }
}