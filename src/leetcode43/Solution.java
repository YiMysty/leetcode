package leetcode43;

public class Solution {
    public String multiply(String num1, String num2) {
        if(num1.length()<num2.length())
        	return multiply(num2,num1);
        //length of num1>=num2
        if(num1.equals("0")||num2.equals("0"))
        	return "0";
        int ans[] = new int[num1.length()+num2.length()];
        StringBuilder s1 = new StringBuilder(num1).reverse();
        StringBuilder s2 = new StringBuilder(num2).reverse();
        for(int i=0;i<s1.length();i++)
        	for(int j=0;j<s2.length();j++){
        		ans[i+j]+=(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
        	}
        //build the result
        int zero = 0;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<ans.length;i++){
        	result.append((char)('0'+ans[i]%10));
        	if(i+1<ans.length)
        		ans[i+1]+=ans[i]/10;
        }
        result = result.reverse();
        //trim zero
        while(result.charAt(zero)=='0')
        	zero++;
        return result.substring(zero);
    }
}