package leetcode47;
import java.util.ArrayList;
import java.util.List;
public class SolutionI {
    public List<List<Integer>> permuteUnique(int[] num) {
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
    		if(isDuplicate(num,pos,i)){
    			swap(num,pos,i);
    			result.addAll(getPermuteUnique(num,pos+1));
    			swap(num,i,pos);  
    		}
    	}
    	return result;
    }
    public void swap(int num[],int i,int j){
    	int a = num[i];
    	num[i] = num[j];
    	num[j] = a;
    }
    public boolean isDuplicate(int num[],int start,int end){
    	for(int i=start;i<end;i++){
    		if(num[i]==num[end])
    			return false;
    	}
    	return true;
    }
}