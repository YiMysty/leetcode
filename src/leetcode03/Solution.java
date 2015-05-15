package leetcode03;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<10&&x>-10)
            return true;
        if(x<0)
            x = 0-x;
        String s = x+"";
        int length = s.length();
        int i = 0;
        int j = length-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}