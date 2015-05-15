package leetcode46;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public List<List<Integer>> permute(int[] num) {
    	if(num.length==0)
    		return new ArrayList<List<Integer>>();
    	return getPermute(num,0);
    }
    public List<List<Integer>> getPermute(int[] num,int pos){
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(pos==num.length-1){
    		ArrayList<Integer> array = new ArrayList<Integer>();
    		for(int i=0;i<num.length;i++)
    			array.add(num[i]);
    		result.add(array);
    		return result;
    	}
    	for(int i=pos;i<num.length;i++){
    		swap(num,pos,i);
    		result.addAll(getPermute(num,pos+1));
    		swap(num,i,pos);
    	}  	
    	return result;
    }
    public void swap(int num[],int i,int j){
    	int a = num[i];
    	num[i] = num[j];
    	num[j] = a;
    }
}