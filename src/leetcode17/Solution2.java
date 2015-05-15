package leetcode17;
import java.util.LinkedList;
import java.util.List;
public class Solution2 {
    public List<String> letterCombinations(String digits) {
    	LinkedList<String> list = new LinkedList<String>();
    	if(digits.length()==0)
    		return list;
    	list.add("");
    	String map[] = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    	for(int i=0;i<digits.length();i++){
    		int index = digits.charAt(i)-'0'; //this is the index
    		while(list.peek().length()<i+1){
    			String s = list.pop();
    			for(char c:map[index].toCharArray())
    				list.add(s+c);
    		}
    	}
    	return list;
    }
}
