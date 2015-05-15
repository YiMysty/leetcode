package leetcode84;

import java.util.Stack;

public class Solution2 {
    public int largestRectangleArea(int[] height) {
    	int area = 0;
    	Stack<Integer> stack = new Stack<Integer>();
    	for(int i=0;i<height.length;i++){
    		if(stack.isEmpty()||height[i]>=height[stack.peek()]){
    			stack.push(i);
    		}else{
    			int index = stack.pop();
    			int myHeight = height[index];
    			int myWidth  = i-(stack.isEmpty()?-1:stack.peek())-1;
    			area = Math.max(area, myHeight*myWidth);
    			i-=1;
    		}
    	}
    	while(!stack.isEmpty()){
    		int index = stack.pop();
    		int myHeight = height[index];
    		int myWidth  =height.length -(stack.isEmpty()?-1:stack.peek())-1;
    		area = Math.max(area, myHeight*myWidth);
    	}
    	return area;
    }
}