package leetcode213;

public class Solution {
    public int rob(int[] nums) {
        if(nums.length<1)
            return 0;
        else if(nums.length==1)
            return nums[0];
        else if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        int money = nums[0];
        for(int i=0;i<nums.length;i++){
            money = Math.max(money,steal(nums,i));
        }
        return money;
    }
    public int steal(int[] nums,int index){
        int money[] = new int[nums.length];
        money[0] = nums[index]; 
        for(int i=1;i<nums.length-1;i++){
            int ord = (index+i)%nums.length;
            if(i>1){
                money[i] = Math.max(money[i-1],money[i-2]+nums[ord]);
            }else{
                money[i] = Math.max(money[i-1],nums[ord]);
            }
        }
        if(nums.length>2)
            return money[nums.length-2];
        else
            return money[nums.length-1];
    }
}