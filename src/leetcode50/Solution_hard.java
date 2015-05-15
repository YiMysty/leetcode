package leetcode50;

public class Solution_hard {
	public double value[] = new double[33];
	public long    pow  [] = new long[33];
	int len = 1;
    public double pow(double x, int n) {
    	boolean isNeg = true;
    	if(n==0)
    		return 1;
    	if(n<0)
    		x = 1/x;
    	n = Math.abs(n);
    	if(x>0||n%2==0)
    		isNeg = false;
    	x = Math.abs(x);
    	init(x,n);
    	double result = getPow(x,n);
    	return isNeg?0-result:result;
    }
    public void init(double x,int n){
    	double res = x;
    	long m = 1;
    	pow[0] = 0;
    	value[0] = 1;
    	for(int i=1;i<value.length&&m<=n;i++){
    		value[i] = res;
    		pow  [i] = m;
    		res*=res;
    		m+=m;
    		len++;
    	}
    }
    public double getPow(double x,int n){
    	double result = 1;
    	while(n>0){
    		int index = binarySearch(n);
    		result*=value[index];
    		n-=pow[index];
    	}
    	return result;
    }
    public int binarySearch(int n){
    	int low = 0;
    	int high = len-1;
    	while(low<high){
    		int mid = low+(high-low)/2;
    		if(pow[mid]==n)
    			return mid;
    		else if(pow[mid]<n)
    			low = mid+1;
    		else if(pow[mid]>n)
    			high = mid-1;
    	}
    	if(pow[low]>n)
    		return low-1;
    	return low;
    }
}