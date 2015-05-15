package leetcode49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class Solution {
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public List<String> anagrams(String[] strs) {
        HashMap<String,List> map = new HashMap<String,List> ();
        for(String s:strs){
        	String change = changeOrder(s.replace(" ",""));
        	if(map.containsKey(change)){
        		List list = map.get(change);
        		list.add(s);
        	}else{
        		List mySet = new ArrayList<String>();
        		mySet.add(s);
        		map.put(change, mySet);
        	}
        }
        List<String> result = new ArrayList<String>();
        Iterator iter = map.entrySet().iterator(); 
        while(iter.hasNext()){
        	Map.Entry entry = (Map.Entry) iter.next(); 
        	List <String> s = (List<String>) entry.getValue();
        	if(s.size()>=2){
	        	for(String ss:s){
	        		result.add(ss);
	        	}
        	}
        }
        return result;
    }
    public String changeOrder(String s){
    	char c[] = s.toCharArray();
    	Arrays.sort(c);
    	return new String(c);
    }
}