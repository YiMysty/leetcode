package leetcode44;

public class Solution {
    public boolean isMatch(String s, String p) {
    	int i = 0,j=0,pos=-1;
    	s+='\0';p+='\0';
    	boolean star = false;
    	while(s.charAt(i)!='\0'){
    		if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'){
    			i++;j++;
    		}else if(p.charAt(j)=='*'){
    			star = true;
    			while(p.charAt(j)=='*')
    				j++;
    			pos = j;
    		}else if(star&&pos==j){
    			i++;
    		}else if(star&&pos!=j){
    			i = i-(j-pos-1); //reverse back to next match..
    			j = pos;
    		}else{
    			return false;
    		}
    	}
    	while(p.charAt(j)=='*')
    		j++;
    	if(p.charAt(j)=='\0')
    		return true;
    	return false;
    }
}