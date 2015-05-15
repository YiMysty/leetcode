package leetcode07;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generatea(int numRows) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if(numRows==0)
    		return list;
    	Integer a[][] = new Integer[numRows+1][numRows+2];
    	for(int i=0;i<=numRows;i++)
    		a[i][0] = 0;
    	a[0][1] = 1;
    	a[0][2] = 0;
    	//calculate
    	for(int i=1;i<numRows;i++){
    		for(int j=1;j<=i;j++){
    			a[i][j] = a[i-1][j-1]+a[i-1][j];
    		}
    	}
    	// return the list
    	List<Integer> tmp = new ArrayList<Integer>();
    	tmp.add(1);
    	list.add(tmp);
    	for(int i=1;i<numRows;i++){
    		tmp = new ArrayList<Integer>();
    		for(int j=1;j<=i+1;j++){
    			tmp.add(a[i][j]);
    		}
    		list.add(tmp);
    	}
		return list;
        
    }
    
}
