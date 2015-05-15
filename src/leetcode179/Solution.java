package leetcode179;
import java.util.ArrayList;
public class Solution {
    public String largestNumber(int[] num) {
    	ArrayList<Integer> container = new ArrayList<Integer>();
    	container.add(num[0]);
    	for(int i=1;i<num.length;i++){
    		//do sorting related
    		int index = container.size();
    		for(int j=0;j<container.size();j++){
    			if(insert(container.get(j),num[i])){
    				index = j;
    				break;
    			}
    		}
    		container.add(index, num[i]);
    	}
    	String s = "";
    	boolean retrieveZero = false;
    	for(int i:container){
    		if(i!=0||retrieveZero){
    			s+=i;
    			retrieveZero = true;
    		}
    	}
    	if(!retrieveZero)
    		return "0";
    	return s;
    }
    
    public boolean insert(int i,int j){
    	String sb = i+""+j;		//insert front
    	String sf = j+""+i;		//insert back
    	for(int k=0;k<sf.length();k++){
    		if(sf.charAt(k)>sb.charAt(k))
    			return true;
    		else if(sf.charAt(k)<sb.charAt(k))
    			return false;
    	}
    	return false;
    }
}