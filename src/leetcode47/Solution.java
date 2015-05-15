package leetcode47;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] num) {
    	Arrays.sort(num);
    	return getPermuteUnique(num,0);
    }
	public List<List<Integer>> getPermuteUnique(int[] num,int pos){
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(pos==num.length-1){//this is the end of the array
    		ArrayList<Integer> list = new ArrayList<Integer>();
    		for(int n:num)
    			list.add(n);
    		result.add(list);
    		return result;
    	}
    	for(int i=pos;i<num.length;i++){
    		swap(num,pos,i);
    		result.addAll(getPermuteUnique(num,pos+1));
    		swap(num,i,pos);  
    		while(i<num.length-1&&num[i]==num[i+1])
    			i++;
    	}
    return result;
	}
    public void swap(int num[],int i,int j){
    	int a = num[i];
    	num[i] = num[j];
    	num[j] = a;
    }
}