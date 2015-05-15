package leetcode18;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution2 {
    public List<List<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        // the level is used to define the current
        return search(num,target,0,num.length-1,new ArrayList<Integer>());
    }
    public List<List<Integer>> search(int [] num,int target,int low,int high,List<Integer> trace){
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(num.length<4)
    		return result;
    	if(trace.size()>=2){//actually it is just two
    		while(low<high){
    			if(num[low]+num[high]==target){//find the answer
    				trace.add(num[low]);
    				trace.add(num[high]);
    				result.add(new ArrayList<Integer>(trace));
    				trace.remove(trace.size()-1);
    				trace.remove(trace.size()-1);
    				int skip = num[low];
    				while(low<high&&num[low]==skip)
    					low++;
    			}else if(num[low]+num[high]>target){
    				high--;
    			}else{
    				low++;
    			}
    		}
    		return result;
    	}
    	int prev = num[low]-1;
    	for(int i=low;i<num.length-3+trace.size();i++){
    		if(num[i]==prev)
    			continue;
    		prev = num[i];
    		trace.add(num[i]);
    		result.addAll(search(num,target-num[i],i+1,num.length-1,trace));
    		trace.remove(trace.size()-1);
    	}
    	return result;
    }
}