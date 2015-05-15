package leetcode44;

public class SolutionR {
    public boolean isMatch(String s, String p) {
    	return Match(s+'\0',p+'\0',0,0,false);
    }
    public boolean Match(String s,String p,int i,int j,boolean mark){
    	if(s.charAt(i)=='\0'){
    		if(p.charAt(j)=='\0')
    			return true;
    		else if(p.charAt(j)=='*'){
    			while(p.charAt(j)=='*')
    				j++;
    			return Match(s,p,i,j,true);
    		}
    		return false;
    	}
    	if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'){
    		return Match(s,p,i+1,j+1,false);
    	}else if(p.charAt(j)!='*'&&!mark){
    		return false;
    	}else if(p.charAt(j)!='*'&&mark)
    		return Match(s,p,i+1,j,mark);
    	else{
    		while(p.charAt(j)=='*') //cut the extreme situation
    			j++;
    		return Match(s,p,i+1,j,true);
    	}
    }
}