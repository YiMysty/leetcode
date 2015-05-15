package leetcode04;

public class Solution {
    public int romanToInt(String s) {
    	int result = 0;
    	int former = getNum(s.charAt(0));
    	for(int i = 0;i<s.length();i++){
    		int current = getNum(s.charAt(i));
    		if(current<=former){
    			result+=current;
    			former = current;
    		}else{
    			result-=2*former;
    			result+=current;
    			former = current;
    		}
    	}
    	return result;
    }
    public int getNum(char c){
    	int num = 0;
    	switch(c){
    		case 'I':
    			num = 1;
    			break;
    		case 'X':
    			num = 10;
    			break;
    		case 'V':
    			num = 5;
    			break;
    		case 'L':
    			num = 50;
    			break;
    		case 'C':
    			num = 100;
    			break;
    		case 'D':
    			num=500;
    			break;
    		case 'M':
    			num = 1000;
    			break;
    		default:
    			break;
    	}
    	return num;
    }
}