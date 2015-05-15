package leetcode22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	List<String> result = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
    	doAnswer(n,n,"");
    	return result;
    }
    void doAnswer(int L,int R,String s){
    	if(L==0&&R==0){
    		result.add(s);
    		return;
    	}
    	if(L>0){
    		doAnswer(L-1,R,new String(s+"("));
    	}
    	if(L<R){
    		doAnswer(L,R-1,new String(s+")"));
    	}
    }
}