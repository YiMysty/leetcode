package leetcode78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] S) {
    	Arrays.sort(S);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int number = 0;
        int upLimit = 1;
        for(int i=0;i<S.length-1;i++){
        	upLimit = (upLimit<<1)|1;
        }
        while(number<=upLimit){
        	ArrayList<Integer> buffer = new ArrayList<Integer>();
        	int indicate = number;
        	for(int i=0;i<S.length;i++){
        		if((indicate&1)==1){
        			buffer.add(S[i]);
        		}
        		indicate = indicate>>1;
        	}
        	result.add(buffer);
        	number++;
        }
        return result;
    }
}