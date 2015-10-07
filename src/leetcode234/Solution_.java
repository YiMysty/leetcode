package leetcode234;

import java.util.ArrayList;
import java.util.List;

import basic.ListNode;

public class Solution_ {
	int test [] = new int[]{-16557,-8725,-29125,28873,-21702,15483,-28441,-17845,-4317,-10914,-10914,-4317,-17845,-28441,15483,-21702,28873,-29125,-8725,-16557};
    public boolean isPalindrome(ListNode head) {
        ListNode ptr = head;
        ArrayList<Integer> buff = new ArrayList<Integer>();
        while(ptr!=null){
            buff.add(ptr.val);
            ptr = ptr.next;
        }
        return  isTrue(buff);
    }
    public boolean isTrue(List<Integer> buff){
        for(int i=0,j=buff.size()-1;i<=j;i++,j--){
            if(buff.get(i).intValue()!=buff.get(j).intValue()){
                return false;
            }
        }
        return true;
    }
    public boolean test(){
    	List<Integer> buff = new ArrayList<Integer>();
    	for(int t:test)
    		buff.add(t);
    	return isTrue(buff);
    }
}
