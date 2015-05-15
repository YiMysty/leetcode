package leetcode126;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
	public class Solution {
		class node{
			public String nodeName;
			public int dist;
			public ArrayList<node> prev;
			public node(String nodeName,int dist){
				this.nodeName = nodeName;
				this.dist = dist;
				prev = new ArrayList<node>();
			}
		}
		HashMap<String,node> map = new HashMap<String,node>();
		List<List<String>> result = new ArrayList<List<String>>();
	    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
	    	Queue<String> queue = new LinkedList<String>();
			String buf;
			buf = end;
			end = start;
			start = buf;
	    	node n = new node(start,1);
	    	queue.add(start);
	    	dict.add(end);
	    	map.put(start, n);
	    	while(!queue.isEmpty()){
	    		String change = "";
	    		String content = queue.poll();
				if(content.equals(end)){
					findAll(map.get(end),new ArrayList<String>());
					return result;
				}
	    		for(int i=0;i<content.length();i++){
	    			change = "";
	    			char buffer[] = content.toCharArray();
	    			for(int j=0;j<26;j++){
	    				buffer[i] = (char)('a'+j);
	    				change = new String(buffer);
	    			if(!map.containsKey(change)&&dict.contains(change)){
	    					//this is the first visit node
	    					node prev = map.get(content);
	    					node cur  =new node(change, prev.dist+1);
	    					cur.prev.add(prev);
	    					map.put(change, cur);
	    					queue.add(change);
	    				}else if(map.containsKey(change)&&dict.contains(change)){
	    					node prev = map.get(content);
	    					node cur = map.get(change);
	    					if(cur.dist==prev.dist+1){
	    						cur.prev.add(prev);
	    					}
	    					map.put(change, cur);
	    				}
	    			}
	    		}
	    	}
	    return result;
	    }
	    public void findAll(node end,List<String> path){
	    	if(end==null){
	    		result.add(path);
	    	}else{
	    		path.add(end.nodeName);
	    		for(node n:end.prev){
	    			findAll(n,new ArrayList<String>(path));
	    		}if(end.prev.size()==0){
	    			findAll(null,path);
	    		}
	    	}
	    }
	}