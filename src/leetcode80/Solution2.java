package leetcode80;

public class Solution2 {
    public int removeDuplicates(int[] A) {
        if(A.length<=2)
        	return A.length;
        int pos = 0;
        for(int i=2;i<A.length;i++){
        	if(A[i]!=A[i-2]){
        		A[pos++] = A[i];
        	}
        }
        return pos;
    }
}
