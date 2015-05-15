package leetcode08;

public class Solution {
    public String convert(String s, int nRows) {
    	String returnValue = "";
    	for(int i=0;i<nRows;i++){
    		int j=i;
    		int count = 0;
    		while(j<s.length()){
    			System.out.println(j);
    			if(count%2==0){
    				if(j%(2*nRows-2)==0||j%(nRows-1)!=0){
    					returnValue = returnValue+Character.valueOf(s.charAt(j));
    					j=j+(nRows-j%nRows-1)*2;
    				}
    			}else if(count%2==1){
    					if(j%(2*nRows-2)!=0){
    						returnValue = returnValue+Character.valueOf(s.charAt(j));
    						j=j+2*(j%nRows);
    				}
    			}
    			count++;
    		}
    	}
    	return returnValue;
    }
 }
