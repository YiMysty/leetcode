package leetcode77;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
    	return getCombine(n,1,k,new ArrayList<Integer>());
    }
    public List<List<Integer>> getCombine(int n,int start,int pickNum,ArrayList<Integer>trace){
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(pickNum==0){
    		result.add(trace);
    		return result;
    	}
    	for(int i=start;i<=n-pickNum+1;i++){
    		trace.add(i);
    		result.addAll(getCombine(n,i+1,pickNum-1,new ArrayList<Integer>(trace)));
    		trace.remove(trace.size()-1);
    	}
    	return result;
    }
}