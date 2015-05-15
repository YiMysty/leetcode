package leetcode69;

public class Solution {
    public int sqrt(int x) {
    	long low = 0;
    	long high = x;
    	while(low<high){
    		long mid = low+(high-low)/2;
    		if(square(mid)<=x&&square(mid+1)>x){
    			return (int) mid;
    		}else if(square(mid)>x){
    			high = mid-1;
    		}else{
    			low = mid+1;
    		}
    	}
    	return (int) low;
    }
    public long square(long num){
    	return num*num;
    }
}