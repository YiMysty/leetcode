package leetcode90;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] num) {
    	Arrays.sort(num);
    	ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
    	result.add(new ArrayList<Integer>());
    	if(num.length==0)
    		return result;
    	int prev = num[0]-1;
    	int total = 0;
    	for(int i=0;i<num.length;i++){
    		if(prev!=num[i]){
    			total = result.size();
    			for(int j=0;j<total;j++){
    				List<Integer> tmp = new ArrayList<Integer>(result.get(j));
    				tmp.add(num[i]);
    				result.add(tmp);
    			}
    			prev = num[i];
    		}else{
    			int curLen = result.size(); 
    			for(int j=curLen-total;j<curLen;j++){
    				List<Integer> tmp = new ArrayList<Integer>(result.get(j));
    				tmp.add(num[i]);
    				result.add(tmp);
    			}
    		}
    	}
    	return result;
    }
}