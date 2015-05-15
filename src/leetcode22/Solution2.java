package leetcode22;

import java.util.ArrayList;
import java.util.List;
public class Solution2 {
    public List<String> generateParenthesis(int n) {
        return generateParenthesis(2*n,0,0,new StringBuilder());
    }
    public List<String> generateParenthesis(int n,int L,int R,StringBuilder builder){
    	List<String> result = new ArrayList<String>();
    	if(L+R==n)
    		result.add(builder.toString());
    	if(L<n/2){
    		result.addAll(generateParenthesis(n,L+1,R,new StringBuilder(builder).append('(')));
    	}
    	if(R<L){
    		result.addAll(generateParenthesis(n,L,R+1,new StringBuilder(builder).append(')')));
    	}
    	return result;
    }
}
