package leetcode89;
import java.util.ArrayList;
import java.util.List;
public class Solution {
	int pow  [];
    public List<Integer> grayCode(int n) {
    	int bits [] = new int[n];
    	pow  = new int[n];
    	for(int i=0;i<n;i++){
    		pow[i] = (int) Math.pow(2, i);
    	}
    	List<Integer> result = new ArrayList<Integer>();
    	int count = 1;
    	result.add(0);
    	while(count<Math.pow(2, n)){
    		int changeBits = getChangePos(count);
    		bits[changeBits] = 1-bits[changeBits];//reverse the bit
    		if(bits[changeBits]==1){
    			result.add(result.get(result.size()-1)+pow[changeBits]);
    		}else{
    			result.add(result.get(result.size()-1)-pow[changeBits]);
    		}
    		count++;
    	}
    	return result;
    }
    public int getChangePos(int count){
    	for(int i=pow.length-1;i>=0;i--){
    		if(count%pow[i]==0)
    			return i;
    	}
    	return 0;
    }
}