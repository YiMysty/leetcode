package leetcode76;

import java.util.HashMap;

public class Solution {
    public String minWindow(String S, String T) {
    	int low = 0,high = 0;
    	int count = 0;
    	int WindowLen = S.length();
    	int windowL  = 0;
    	int windowR  = 0;
    	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    	HashMap<Character,Integer> hasFind = new HashMap<Character,Integer>();
    	for(int i=0;i<T.length();i++){
    		if(map.containsKey(T.charAt(i)))
    			map.put(T.charAt(i), map.get(T.charAt(i))+1);
    		else
    			map.put(T.charAt(i), 1);
    			hasFind.put(T.charAt(i), 0);
    	}
    	for(;high<S.length();high++){
    		char c = S.charAt(high);
    		if(!map.containsKey(c))
    			continue;
    		if(hasFind.get(c)<map.get(c)){
    			count++;
    		}
    		hasFind.put(c, hasFind.get(c)+1);
    		if(count==T.length()){
    			//this means find the one
    			while(!map.containsKey(S.charAt(low))||map.get(S.charAt(low))<hasFind.get(S.charAt(low))){
    				if(map.containsKey(S.charAt(low))){
    					hasFind.put(S.charAt(low),hasFind.get(S.charAt(low))-1);
    				}
    				low++;
    			}
	    		if(high-low+1<WindowLen){
	    			WindowLen = high-low+1;
	    			windowL = low;
	    			windowR = high+1;
	    		}
    		}
    	}
    	if(windowR<=windowL)
    		return "";
    	return S.substring(windowL,windowR);
    }
 }