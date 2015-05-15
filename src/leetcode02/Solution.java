package leetcode02;

public class Solution {
    public int atoi(String str) {
        boolean positive = true;
        if(str.length()==0)
            return 0;
        int count = 0;
        int length = str.length();
        while((str.charAt(count)==' '||str.charAt(count)=='\t'||str.charAt(count)=='\n')&&count<=length-1) //split
            count++;
        if(count==length)
            return 0;
        if(str.charAt(count)=='-'){
            count++;
            positive = false;
        }else if(str.charAt(count)=='+'){
            count++;
        }
        long num = 0;
        for(int i=count;i<length;i++){
              if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                  if(i==count&&str.charAt(i)=='0'){
                        count++;
                  }else{
                      num=num*10+Long.parseLong(str.charAt(i)+"");
                      if(num>Integer.MAX_VALUE){
                    	  if(!positive)
                    		  return  Integer.MIN_VALUE;
                    	  else
                    		  return Integer.MAX_VALUE;
                      }
                  }
              }else{
                break;
              }
        }
        if(!positive)
            return 0-(int)num;
        else
            return (int)num;
    }
}