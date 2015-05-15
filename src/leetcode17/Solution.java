package leetcode17;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    ArrayList<List<Character>> map = new ArrayList<List<Character>>();
	public List<String> letterCombinations(String digits) {
		for(int i=0;i<8;i++){ //from 2 to 9 initialize
			char c = (char)('a'+i*3+i/6);
			ArrayList<Character> list = new ArrayList<Character>();
    		for(int j=0;j<3+(i==5||i==7?1:0);j++)
    			list.add((char)(c+j));
    		map.add(list);
    	}
    	return calculate(digits,0,new StringBuilder());
    }
    public List<String> calculate(String digits,int bit,StringBuilder s){
    	List<String> res = new ArrayList<String>();
    	if(digits.length()==0)
    		return res;
    	int index = digits.charAt(bit)-'2';
    	for(int i=0;i<map.get(index).size();i++){
    		s.append(map.get(index).get(i));
    		if(bit==digits.length()-1){ //the last items
    			res.add(s.toString());
    		}else{
    			res.addAll(calculate(digits,bit+1,s));
    		}s.deleteCharAt(s.length()-1);//remove the last one
    	}
    	return res;
    }
}