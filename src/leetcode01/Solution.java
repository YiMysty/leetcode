package leetcode01;

public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        String num = "1";
        if(n==1)
            return s;
        else{
            for(int i=0;i<n-1;i++){
               num = calculate(num);
            }
        }
        Integer.parseInt(s.charAt(0)+"");
       
        return num;
        
    }
    
    public String calculate(String num){
        String s = "";
        int count = 0;
        char previous = num.charAt(0); 
        for(int i=0;i<num.length();i++){
            if(previous==num.charAt(i)){
                count++;
            }else{
                s+=count;
                s+=Character.valueOf(previous);
                previous=num.charAt(i);
                count = 1;
            }
        }
        s=s+count+Character.valueOf(num.charAt(num.length()-1));
        return s;
    }
    
}