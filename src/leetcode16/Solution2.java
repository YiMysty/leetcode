package leetcode16;

import java.util.Arrays;

//this is nlgn solution not pass
public class Solution2 {
    public int threeSumClosest(int[] num, int target) {
    	Arrays.sort(num);
    	//the length of num shall be greater than 3
    	int low = 0;
    	int high = num.length-1;
    	int delta = num[0]+num[1]+num[2]-target;
    	while(low<high-1){
    		delta = binarySearch(num,low+1,high-1,num[low]+num[high]-target);
    		System.out.println("--"+delta);
    		if(delta<0)
    			low++;
    		else if(delta>0)
    			high--;
    		else
    			return target;
    	}
    	return delta+target;
    }
    public int binarySearch(int num[],int low,int high,int target){
    	int delta = num[low]+target;
    	int n = 0-target;//search direction is error.
    	while(low<=high){
    		int mid = low+(high-low)/2;
    		if(num[mid]>n){
    			delta = Math.abs(delta)<Math.abs(num[mid]+target)?delta:num[mid]+target;
    			high = mid-1;
    		}else if(num[mid]<n){
    			delta = Math.abs(delta)<Math.abs(num[mid]+target)?delta:num[mid]+target;
    			low = mid+1;
    		}else{
    			return 0;
    		}
    	}
    	return delta;
    }
}
