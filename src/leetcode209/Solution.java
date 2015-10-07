package leetcode209;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int low  = 0;
        int high = 0;
        int min_len = Integer.MAX_VALUE;
        int sum = 0;
        while(low<=high&&high<nums.length){
            sum+=nums[high];
            if(sum<s){
                high++;
                continue;
            }
            else{
                while(low<high&&sum>=s){
                    min_len = Math.min(min_len,high-low+1);
                    sum-=nums[low];
                    low++;
                }
                high++;
                if(min_len==1)
                    return 1;
            }
        }
        if(min_len==Integer.MAX_VALUE)
            return 0;
        return min_len;
    }
}