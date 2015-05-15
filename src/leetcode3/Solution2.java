package leetcode3;
import java.util.HashMap;
public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
    	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    	int totalNum = 0;
    	int max = 0;
    	int splitPos = 0;
    	for(int i=0;i<s.length();i++){
    		char c = s.charAt(i);
    		if(!map.containsKey(c)){
    			map.put(c, i);
    			totalNum++;
    			max = Math.max(max, totalNum);
    		}else{
    			int lastPos = map.get(c);
    			if(lastPos<splitPos){ //split position is the position current start.
    				totalNum++;
    				max =Math.max(max, totalNum);
    			}else{
    				totalNum = i-lastPos;
    				splitPos = lastPos;
    				map.put(c, i);
    			}
    			map.put(c, i);
    		}
    	}
    	return max;
    }
}
