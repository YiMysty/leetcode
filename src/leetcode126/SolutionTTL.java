package leetcode126;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SolutionTTL {
	Integer min = Integer.MAX_VALUE;
    List<List<String>> result = new ArrayList<List<String>>();
	public List<List<String>> findLadders(String start, String end, Set<String> dict) {
		ArrayList<String> trace = new ArrayList<String>();
		trace.add(start);
		dict.remove(start);
		findMyLadder(start,end,dict,trace);
		return result;
    }
    public void findMyLadder(String start,String end,Set<String>dict,ArrayList<String> trace){
    	if(trace.size()==min)
    		return;
    	for(int i=0;i<start.length();i++){
    		char []buffer = start.toCharArray();
    		for(int j=0;j<26;j++){
    			buffer[i] = (char)('a'+j);
    			String content = new String(buffer);
    			if(content.equals(end)){
    				List<String> ans = new ArrayList<String>();
    				for(String s:trace)
    					ans.add(s);
    				ans.add(end);
    				if(ans.size()<min){
    					min = ans.size();
    					result.removeAll(result);
    				}
    				result.add(ans);
    				return;
    			}else if(dict.contains(content)){
    				dict.remove(content);
    				trace.add(content);
    				findMyLadder(content,end,dict,trace);
    				trace.remove(trace.size()-1);
    				dict.add(content);
    			}
    		}
    	}
    	return ;
    }
}