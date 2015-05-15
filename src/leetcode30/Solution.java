package leetcode30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//You are given a string, S, and a list of words, L, that are all of the same length. 
//Find all starting indices of substring(s) in S 
//that is a concatenation of each word in L exactly once and without any intervening characters.
public class Solution {
    public List<Integer> findSubstring(String S, String[] L) {
    	List<Integer> result = new ArrayList<Integer>();
    	if(L.length==0)
    		return result;
    	HashMap<String,Integer> dict = new HashMap<String,Integer>();
    	for(String word:L){
    		if(dict.containsKey(word))
    			dict.put(word, dict.get(word)+1);
    		else
    			dict.put(word, 1);
    	}
    	int len = L[0].length();
    	for(int i=0;i<=S.length()-len*L.length;i++){
    		String word = S.substring(i,i+len);
    		if(dict.containsKey(word)){
    			HashMap<String,Integer> map = new HashMap<String,Integer>();
    			for(int j=0;j<L.length&&i+j*len+len<=S.length();j++){
    				word = S.substring(i+j*len,i+j*len+len);
    				map.put(word, map.containsKey(word)?map.get(word)+1:1);
    				if(!dict.containsKey(word)){
    					break;
    					
    				}
    			}
    			if(map.equals(dict))
    				result.add(i);
    		}
    	}
    	return result;
    }
}