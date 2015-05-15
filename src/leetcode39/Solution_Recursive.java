package leetcode39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_Recursive {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
        return calculateCombinationSum(candidates,target,0,new ArrayList<Integer>());
    }
    public List<List<Integer>> calculateCombinationSum(int[] candidates,int target,int pos,ArrayList<Integer> trace){
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(target==0){
    		result.add(trace);
    		return result;
    	}
    	int prev = -1;
    	for(int i=pos;i<candidates.length;i++){
    		if(prev==candidates[i])
    			continue;
    		prev = candidates[i];
    		if(target>=candidates[i]){
    			trace.add(candidates[i]);
    			result.addAll(calculateCombinationSum(candidates,target-candidates[i],i,new ArrayList<Integer>(trace)));
    			trace.remove(trace.size()-1);
    		}else{
    			break;
    		}
    	}
    	return result;
    }
}