package leetcode42;
public class Solution_S {
    public int trap(int[] A) {
    	int V = 0;
    	if(A.length==0)
    		return 0;
    	int left [] = new int[A.length];
    	int right[] = new int[A.length];
    	left[0] = 0;
    	int max = 0;
    	for(int i=1;i<A.length;i++){
    		max = Math.max(max, A[i-1]);
    	   left[i] = max; //this record the left panel the biggest
    	}
    	right[A.length-1] = 0;
    	max = 0;
    	for(int i=A.length-2;i>=0;i--){
    		max = Math.max(max, A[i+1]);
    		right[i] = max; //this record the left biggest
    	}
    	for(int i=1;i<A.length-1;i++){ //the left and the right can not contain water
    		int min = Math.min(left[i], right[i]);
    		V+=min-A[i]>=0?min-A[i]:0;
    	}
    	return V;
    }
    
}