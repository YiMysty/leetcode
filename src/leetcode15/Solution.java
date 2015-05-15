package leetcode15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(num.length<3)
    		return result;
    	Arrays.sort(num);
    	int prev = num[0]-1;
    	for(int i=0;i<num.length-2;i++){ //remain the last two
    		if(prev==num[i])//remove the duplicate part
    			continue;
    		prev = num[i];
    		int low = i+1;
    		int high = num.length-1;
    		int sum  = 0 - num[i];
    		while(low<high){
    			if(num[low]+num[high]>sum)
    				high--;
    			else if(num[low]+num[high]<sum)
    				low++;
    			else{ //that means this two add to zero
    				List<Integer> res = new ArrayList<Integer>();
    				res.add(num[i]);
    				res.add(num[low]);
    				res.add(num[high]);
    				result.add(res);
    				int skip = num[low];
    				while(low<high&&skip==num[low]) //remove the duplicate part.
    					low++;
    			}
    		}
    	}
    	return result;
    }
}