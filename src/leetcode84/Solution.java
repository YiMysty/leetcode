package leetcode84;
import java.util.Stack;
public class Solution {
    public int largestRectangleArea(int[] height) {
    	if(height.length==0)
    		return 0;
    	int area = 0;
    	Stack<Integer> stack = new Stack<Integer>();
    	for(int i=0;i<=height.length;i++){
    		int thisHeight = i==height.length?0:height[i];
    		if(stack.isEmpty()||height[stack.peek()]<=thisHeight){
    			stack.push(i);
    		}else{
    			int index = stack.pop();
    			area  =Math.max(area, height[index]*(index-(stack.isEmpty()?i:i-stack.peek()+1)));
    			i--;
    		}
    	}
    	return area;
    }
}