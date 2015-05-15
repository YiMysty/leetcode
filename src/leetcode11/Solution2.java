package leetcode11;

public class Solution2 {
    public int maxArea(int[] height) {
    	int result = 0;
    	int low = 0;
    	int high= height.length-1;
    	while(low<=high){
    		result = Math.max((high-low)*Math.min(height[low], height[high]),result);
    		if(height[low]<height[high])
    			low++;
    		else
    			high--;
    	}
    	return result;
    }
}
