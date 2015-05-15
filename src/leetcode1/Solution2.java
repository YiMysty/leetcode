package leetcode1;

import java.util.HashMap;

public class Solution2 {
	 public int[] twoSum(int[] numbers, int target) {
		 HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
		 int result[]  = new int[2];
		 for(int i=0;i<numbers.length;i++){
			 if(set.containsKey(target-numbers[i])){
				 result[0] = set.get(target-numbers[i]);
				 result[1] = i+1;
				 return result;
			 }else{
				 set.put(numbers[i], i+1);
			 }
		 }
		 return result;
	 }
}
