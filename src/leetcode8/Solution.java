package leetcode8;

public class Solution {
    public int atoi(String str) {
        long result = 0;
        if(str.length()==0)
        	return (int)result;
        int startIndex = 0;
        while(str.charAt(startIndex)==' ')
        	startIndex++;
        boolean isNeg =( str.charAt(startIndex)=='-'?true:false);
        startIndex += (str.charAt(startIndex)=='+'||str.charAt(startIndex)=='-'?1:0);
        for(int i=startIndex;i<str.length();i++){
        	if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
        		result = result*10+(int)(str.charAt(i)-'0');
        		if(!isNeg&&result>Integer.MAX_VALUE)
        			return Integer.MAX_VALUE;
        		else if(isNeg&&result+Integer.MIN_VALUE>0)
        			return Integer.MIN_VALUE;
        	}else{
        		 return (int) (isNeg?0-result:result);
        	}
        }
        return (int) (isNeg?0-result:result);
    }
}