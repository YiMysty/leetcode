package leetcode40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    Set<String> set = new HashSet<String>();
	public List<List<Integer>> combinationSum2(int[] num, int target) {
    	Arrays.sort(num);
    	solve(num,target,new ArrayList<Integer>(),0);
    	return result;
    }
	public void solve(int []num,int target,List<Integer> trace, int startPoint){
		int old = -1;
		for(int i=startPoint;i<num.length;i++){
			if(old==num[i]){
				continue;
			}else{
				old = num[i];
			}
			if(target>num[i]){
				trace.add(num[i]);
				solve(num,target-num[i],trace,i+1);
				trace.remove(trace.size()-1);
			}else if(target==num[i]){
				String S = "";
				List<Integer> s = new ArrayList<Integer>();
				for(Integer a:trace){
					s.add(a);
					S+=a;
				}
				S+=num[i];
				if(set.contains(S))
					return;
				set.add(S);
				s.add(num[i]);
				result.add(s);
			}else{
				return;
			}
		}
	}
}