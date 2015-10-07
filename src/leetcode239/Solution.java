package leetcode239;

import java.util.Deque;
import java.util.LinkedList;
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       if(k==0)
        return nums;
       Myqueue q = new Myqueue(nums,k);
        for(int i=0;i<k-1;i++){
        	q.addElem(i);
        }
        int []result = new int[nums.length-k+1];
        for(int i=k-1;i<nums.length;i++){
        	if(!q.isEmpty()){
	        	int biggest = q.getBiggestOrd();
	        	if(i-biggest>=k){
	        		q.removeFirst();
	        	}
        	}
        	q.addElem(i);
        	result[i+1-k] = nums[q.getBiggestOrd()];
        }
        return result;
    }
}
class Myqueue{
	 Deque<Integer> queue = new LinkedList<Integer>();
	 int []nums;
	 int k;
	 public Myqueue(int[] nums,int k){
		 this.nums = nums;
		 this.k    = k;
	 }
	 public void addElem(int i){
     	if(queue.isEmpty()){
    		queue.add(i);
    		this.showQueue();
    		return;
    	}
    	int firstOrd = queue.peekFirst();
    	int lastOrd  = queue.peekLast();
    	if(nums[firstOrd]<nums[i]){
    		while(!queue.isEmpty()&&nums[firstOrd]<nums[i]){
    			queue.pollFirst();
    			if(!queue.isEmpty())
    				firstOrd = queue.peekFirst();
    		}
    		queue.addFirst(i);
    	}else{
    		while(!queue.isEmpty()&&nums[lastOrd]<=nums[i]){
    			queue.pollLast();
    			if(!queue.isEmpty())
    				lastOrd = queue.peekLast();
    		}
    		queue.addLast(i);
    	}
    	this.showQueue();
	 }
	 public void showQueue(){
		 System.out.println("=====");
		 for(int i:queue)
			 System.out.println(nums[i]);
		 System.out.println("=====");
	 }
	 public boolean isEmpty(){
		 return queue.isEmpty();
	 }
	 public void removeFirst(){
		 queue.pollFirst();
	 }
	 public int getBiggestOrd(){
		 return queue.peekFirst();
	 }
}
