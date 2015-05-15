package leetcode26;

public class Solution {
    public int removeDuplicates(int[] A) {
    	if(A.length==0)
    		return 0;
    	int pos = 0;
    	int prev = A[0]-1; //this is perhaps overflow?
    	for(int i=0;i<A.length;i++){
    		if(A[i]==prev)
    			continue;
    		prev = A[i];
    		A[pos++] = A[i];
    	}
    	return pos;
    }
}
