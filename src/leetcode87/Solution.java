package leetcode87;

public class Solution {
    /**
     * @param s1 A string
     * @param s2 Another string
     * @return whether s2 is a scrambled string of s1
     */
    public boolean isScramble(String s1, String s2) {
        // Write your code here
        if(s1.length()!=s2.length())
            return false;
        if(s1.equals(s2))
            return true;
        char hash [] = new char[26];
        for(int i=0;i<s1.length();i++){
            hash[s1.charAt(i)-'a']++;
            hash[s2.charAt(i)-'a']--;
        }
        
        for(int i=0;i<hash.length;i++){
            if(hash[i]!=0){
                return false;
            }
        }
        
        for(int i=1;i<s1.length();i++){
            String S1L = s1.substring(0,i);
            String S2L = s2.substring(0,i);
            String S1R = s1.substring(i,s1.length());
            String S2R = s2.substring(i,s2.length());
            if(isScramble(S1L,S2L)&&isScramble(S1R,S2R))
                return true;
            S2R = s2.substring(s1.length()-i,s1.length());
            S2L = s2.substring(0,s1.length()-i);
            if(isScramble(S1L,S2R)&&isScramble(S2L,S1R))
                return true;
        }
        return false;
    }
}
