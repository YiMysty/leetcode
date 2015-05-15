package leetcode97;
//obvious out of time limit
public class SolutionTTL {
    public boolean isInterleave(String s1, String s2, String s3) {
    	if(s1.length()+s2.length()!=s3.length())
    		return false;
    	if(s1.length()==0){
    		return s2.equals(s3);
    	}else if(s2.length()==0){
    		return s1.equals(s3);
    	}
    	return isEqual(s1,s2,s3,0,0,0);
    }
    public boolean isEqual(String s1,String s2,String s3,int a,int b,int c){
    	if(c==s3.length()){
    		return true;
    	}
    	return a<s1.length()&&s1.charAt(a)==s3.charAt(c)&&isEqual(s1,s2,s3,a+1,b,c+1)||
    			b<s2.length()&&s2.charAt(b)==s3.charAt(c)&&isEqual(s1,s2,s3,a,b+1,c+1);
    }
}