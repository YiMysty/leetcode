package leetcode60;
import java.util.ArrayList;
public class Solution {
    public String getPermutation(int n, int k) {
    	k = k-1;
    	ArrayList<Integer> sequence  = new ArrayList<Integer>();
    	StringBuilder result = new StringBuilder();
    	for(int i=1;i<=n;i++)
    		sequence.add(i);
    	int fac = factor(n);
    	while(n>0){
    		fac = fac/n;
    		int index = k/fac;
    		result.append(sequence.remove(index));
    		k = k%fac;
    		n--;
    	}
    	return result.toString();
    }
    public int factor(int n){
    	if(n==0)
    		return 1;
    	return n*factor(n-1);
    }
}