package leetcode6;

public class Solution {
    public String convert(String s, int nRows) {
    	if(nRows==1)
    		return s;
    	String ss[] = new String[nRows];
    	boolean isAdd = true;
    	int ord = 0;
    	//initialize
    	for(int i=0;i<nRows;i++)
    		ss[i] = "";
    	for(int i=0;i<s.length();i++){
    		ss[ord]+=s.charAt(i);
    		if(isAdd){
    			ord++;
    		}else{
    			ord--;
    		}if(ord==0){
    			isAdd = true;
    		}else if(ord==nRows-1){
    			isAdd = false;
    		}
    	}
    	String result = "";
    	for(String t:ss)
    		if(t!=null)
    			result+=t;
    	return result;
    }
}