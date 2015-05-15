package leetcode12;
public class Solution {
    public String intToRoman(int num) {
        String s = "";
        //judge thousand
        if(num>=1000){
        	int times = num/1000;
        	for(int i=0;i<times;i++){
        		s+="M";
        	}
        	num-=times*1000;
        }if(num>=900){
        	num-=900;
        	s+="CM";
        }if(num>=500){
        	s+="D";
        	num-=500;
        	int times = num/100;
        	for(int i=0;i<times;i++){
        		s+="C";
        	}
        	num-=times*100;
        }if(num>=400){
        	s+="CD";
        	num-=400;
        }if(num>=100){
        	int times = num/100;
        	for(int i=0;i<times;i++){
        		s+="C";
        	}
        	num-=times*100;
        }if(num>=90){
        	num-=90;
        	s+="XC";
        }
        if(num>=50){
        	num-=50;
        	s+="L";
        	int times = num/10;
        	for(int i=0;i<times;i++){
        		s+="X";
        	}
        	num-=times*10;
        }if(num>=40){
        	num-=40;
        	s+="XL";
        }if(num>=10){
        	int times = num/10;
        	for(int i=0;i<times;i++){
        		s+="X";
        	}
        	num-=times*10;
        }if(num>=9){
        	num-=9;
        	s+="IX";
        }if(num>=5){
        	num-=5;
        	s+="V";
        	for(int i=0;i<num;i++)
        		s+="I";
        	num = 0;
        }if(num>=4){
        	num-=4;
        	s+="IV";
        	num = 0;
        }if(num>0){
        	for(int i=0;i<num;i++)
        		s+="I";
        	num = 0;
        }
        return s;
    }
}