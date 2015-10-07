package leetcode234;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import basic.ListNode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//just get the length and find the middle, then reverse the last part...
public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers that's previous permuation
     */
    public ArrayList<Integer> previousPermuation(ArrayList<Integer> nums) {
		// write your code
		for(int i=nums.size()-1;i>=0;i--)
		    for(int j = i-1;j>=0;j--){
		        if(nums.get(j)>nums.get(i)){
		  swap(nums,i,j);
            Collections.sort(nums.subList(i,nums.size()-1),Collections.reverseOrder());
                    }
		            return nums;
		       }
		 Collections.reverse(nums);
		 return nums;
    }
    public void swap(ArrayList<Integer> nums,int i,int j){
        int t = nums.get(i);
        nums.set(i,nums.get(j));
        nums.set(j,t);
    }
}
