package leetcode85;
import java.util.Stack;
public class Solution {
    public int maximalRectangle(char[][] matrix) {
    	if(matrix.length==0)
    		return 0;
    	int area = 0;
    	int dp[][] = new int[matrix.length][matrix[0].length];
    	for(int i=0;i<matrix.length;i++){
    		for(int j=0;j<matrix[0].length;j++){
    			if(matrix[i][j]=='0'){
    				dp[i][j] = 0;
    			}else if(matrix[i][j]=='1'&&i>0){
    				dp[i][j] = dp[i-1][j]+1;
    			}else{
    				dp[i][j] = 1;
    			}
    		}
    		area = Math.max(area, largestRectangleArea(dp[i]));
    	}
    	return area;
    }
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