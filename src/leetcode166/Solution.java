package leetcode166;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {
    public String fractionToDecimal(int numerator1, int denominator1) {
    	long numerator = numerator1;
    	long denominator = denominator1;
    	String result = "0.";
        if(numerator%denominator==0)
        	return numerator/denominator+"";
        boolean flag = (numerator<0)^(denominator<0);
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        if(numerator>denominator){
        	result = numerator/denominator+".";
        	numerator = numerator-(numerator/denominator)*denominator;
        }
        numerator*=10;  
        Set  <Long> set = new HashSet<Long>();
        Stack<Long> stack = new Stack<Long>();
        while(!set.contains(numerator)&&numerator!=0){
        	set.add(numerator);
        	stack.add(numerator);
        	if(numerator<denominator){
        		numerator*=10;
        	}
        	else{
        		numerator = (numerator-denominator*(numerator/denominator))*10;
        	}
        }
        if(numerator==0){
        	String tmp = "";
        	while(!stack.isEmpty()){
        		tmp = stack.pop()/denominator+tmp;
        	}
        	result = result+tmp;
        }else{
        	String iteration = "";
        	while(!stack.isEmpty()){
        		long num = stack.pop();
        		iteration = num/denominator+iteration;
        		if(num==numerator)
        			break;
        	}iteration = "("+iteration+")";
        	String non_iteration = "";
        	while(!stack.isEmpty()){
        		non_iteration = stack.pop()/denominator + non_iteration;
        	}result = result+non_iteration+iteration;
        }
        if(flag)
        	result = "-"+result;
        return result;
    }
}