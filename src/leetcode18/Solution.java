package leetcode18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> fourSum(int[] num, int target) {
        if(num.length==0)
        	return result;
    	Arrays.sort(num);
        searchAnswer(num,0,num.length-1,target,0,new ArrayList<Integer>());
        return result;
    }
    void searchAnswer(int num[],int start,int end,int target,int level,List<Integer>Trace){
    	if(level==2){
    		while(start<end){
    			if(num[start]+num[end]==target){
    				ArrayList<Integer> tmp = new ArrayList<Integer>();
    				for(Integer i:Trace)
    					tmp.add(i);
    				tmp.add(num[start]);
    				tmp.add(num[end]);
    				result.add(tmp);
    				
    				//skip the same part
    				int old = num[start];
    				while(start<end&&num[start]==old)
    					start++; 
    			}else if(num[start]+num[end]>target){
    				end--;
    			}else{
    				start++;
    			}
    		}
    		return;
    	}
    	// do the recursive
    	int old = num[start]-1;
    	for(int i=start;i<end;i++){
    		if(num[i]!=old){
    			Trace.add(num[i]);
    			searchAnswer(num,i+1,end,target-num[i],level+1,Trace);
    			Trace.remove(Trace.size()-1);
    			old = num[i];
    		}
    	}
    }
}