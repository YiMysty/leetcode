package leetcode128;
import java.util.HashMap;
import java.util.HashSet;
public class Solution_C {
    public int longestConsecutive(int[] num) {
    	int max  = 1;
    	HashMap<Integer,Integer> leftMap = new HashMap<Integer,Integer>();
    	HashMap<Integer,Integer> rightMap  =  new HashMap<Integer,Integer>();
    	HashSet<Integer> set = new HashSet<Integer>();
    	for(int i=0;i<num.length;i++){
    		if(set.contains(num[i]))
    			continue;
    		set.add(num[i]);
    		int small = num[i];
    		int big   = num[i];
    		if(rightMap.containsKey(num[i]-1)){
    			//merge this part
    			small = num[i]-1-rightMap.get(num[i]-1)+1; //this is small part
    			rightMap.remove(num[i]-1);
    		}
    		if(leftMap.containsKey(num[i]+1)){
    			//merge this part
    			big = num[i]+1+leftMap.get(num[i]+1)-1;
    			leftMap.remove(num[i]+1);
    		}
    		leftMap.put(small, big-small+1);
    		rightMap.put(big, big-small+1);
    		max = Math.max(max, big-small+1);
    		System.out.println(small+","+big);
    	}
    	return max;
    }
}