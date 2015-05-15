package leetcode6;

public class Solution2 {
    public String convert(String s, int nRows) {
    	StringBuilder result = new StringBuilder();
    	//minus 2 is the key point
    	for(int i=0;i<nRows;i++){
    		//i is the start point for each row
    		int startPos = i;
    		int steps = nRows*2-(2*i)-2;
    		if(steps==0)
    			steps = nRows*2-2;
    		while(startPos<s.length()){
    			result.append(s.charAt(startPos));
    			startPos = startPos+steps;
    			steps = nRows*2-steps-2;
    			if(steps==0)
    				steps = nRows*2-2; //special case here
    		}
    	}
    	return result.toString();
    }
}
