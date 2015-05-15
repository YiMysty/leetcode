package leetcode10;
public class Solution {
    public boolean isMatch(String s, String p) {
        return findMatch(s+'\0',p+'\0',0,0);
    }
    public boolean findMatch(String s,String p,int s1,int s2){
    	if(s.charAt(s1)=='\0'){
    		if(p.charAt(s2)=='\0')
    			return true;
    		if(s2+1<p.length()&&p.charAt(s2+1)=='*')
    			return findMatch(s,p,s1,s2+2);
    		else
    			return false;
    	}
    	if(p.charAt(s2)=='\0')
    		return false;
    	if(p.charAt(s2+1)!='*'){
    		return (s.charAt(s1)==p.charAt(s2)||(p.charAt(s2)=='.'&&s.charAt(s1)!='\0'))&&findMatch(s,p,s1+1,s2+1);
    	}
    	while(s.charAt(s1)==p.charAt(s2)||(s.charAt(s1)!='\0'&&p.charAt(s2)=='.')){
    		if(findMatch(s,p,s1,s2+2))
    			return true;
    		s1+=1;
    	}
    	return findMatch(s,p,s1,s2+2);
    }
}