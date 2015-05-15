package leetcode31;

import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] num) {
    	int index = -1;
    	int i = 0;
    	for(i = num.length-1;i>=0;i--){
    		int n = num[i];
    		for(int j = i+1;j<num.length;j++){
    			if(num[j]>n){
    				if(index==-1)
    					index = j; //switch the number at this position.
    				else
    					index = num[index]<num[j]?index:j;
    			}
    		}
    		if(index!=-1)
    			break;
    	}
    	if(index==-1)
    		Arrays.sort(num);
    	else{
    		//do quick sort here
    		int swap = num[index];//index>=i
    		num[index] = num[i];
    		num[i] = swap;
    		for(i+=1;i<num.length;i++)
    			for(int j=i+1;j<num.length;j++){ //sort the array from small to big
    				if(num[i]>num[j]){
    					swap = num[j];
    					num[j] = num[i];
    					num[i] = swap;
     				}
    			}
    	}
    }
}