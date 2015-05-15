package leetcode39;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution_1 {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates,target,new ArrayList<Integer>(),0);
        return result;
    }
    public void solve(int[] candidates,int target,List<Integer>trace,int startPoint){
    	for(int i=startPoint;i<candidates.length;i++){
    		if(target>candidates[i]){
    			trace.add(candidates[i]);
    			solve(candidates,target-candidates[i],trace,i);
    			trace.remove(trace.size()-1);//remove last one
    		}else if(target==candidates[i]){
    			List<Integer> s = new ArrayList<Integer>();
    			for(Integer a:trace)
    				s.add(a);
    			s.add(candidates[i]);
    			result.add(s);
    			return;
    		}else{
    			return;
    		}
    	}
    }
}