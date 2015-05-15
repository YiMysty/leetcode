package leetcode10;

public class Solution2 {
    public boolean isMatch(String s, String p) {
        return doSearch(s+'\0',p+'\0',0,0);
    }
    public boolean doSearch(String s,String p,int i,int j){
    	if(s.charAt(i)=='\0'){
    		//this is the end of the recursion
    		if(p.charAt(j)=='\0')
    			return true;
    		else if(p.charAt(j+1)=='*')
    			return doSearch(s,p,i,j+2);
    		return false;
    	}
    	if(p.charAt(j)=='\0')
    		return false;
    	if(p.charAt(j+1)!='*'){
    		if(p.charAt(j)==s.charAt(i)||p.charAt(j)=='.')
    			return doSearch(s,p,i+1,j+1);
    		else
    			return false;
    	}while(s.charAt(i)!='\0'){
    		if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'){
    			if(doSearch(s,p,i,j+2))
    				return true;
    			i++;
    		}else{
    			return doSearch(s,p,i,j+2);
    		}
    	}
    	return doSearch(s,p,i,j+2);
    }
}
