package leetcode06;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
    	Integer[] container = new Integer[rowIndex+1];
    	for(int i=0;i<container.length;i++)
    		container[i] = 0;
    	container[0] = 1;
    	int old = 0;
    	int now  =0;
    	for(int i=0;i<rowIndex;i++){
    		old = 1;
    		for(int j=0;j<=i;j++){
    			if(j-1>=0){
    				now = container[j];
    				container[j] = container[j]+old;
    				old = now;
    			}
    		}
    		container[i+1] = 1;
    	}
    	return Arrays.asList(container);
    }
}
