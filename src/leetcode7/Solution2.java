package leetcode7;

public class Solution2 {
	 public int reverse(int x) {
		 int overflow = Integer.MAX_VALUE/10;
		 boolean isNeg =x>0?false:true;
		 x = Math.abs(x);
		 int result = 0;
		 while(x>0){
			 if(result>overflow){
				 return 0;
			 }
			 result = result*10+x%10;
			 x/=10;
		 }
		 if(isNeg)
			 return 0-result;
		 return result;
	 }
}
