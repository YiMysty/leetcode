package leetcode68;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fullJustify(String[] words, int L) {
    	ArrayList<String> buffer = new ArrayList<String>();
    	ArrayList<String> result = new ArrayList<String>();
    	int len = 0;
    	for(int i=0;i<words.length;i++){
    		if(buffer.size()+words[i].length()+len>L){
    			//this means the buffer is out here we need to deal the one in the buffer.
    			result.add(turnBufferIntoString(buffer,len,L));
    			buffer = new ArrayList<String>();
    			buffer.add(words[i]);
    			len = words[i].length();
    		}else{
    			//this means the buffer is not full
    			buffer.add(words[i]);
    			len+=words[i].length();
    		}
    	}
    	result.add(turnLastLine(buffer,len,L));
    	return result;
    }
    public String turnLastLine(ArrayList<String>buffer,int len,int L){
    	StringBuilder sb = new StringBuilder();
    	sb.append(buffer.get(0));
    	for(int i=1;i<buffer.size();i++){
    		sb.append(' '+buffer.get(i));
    	}
    	for(int i=0;i<L-(buffer.size()-1+len);i++){
    		sb.append(' ');
    	}
    	return sb.toString();
    }
    public String turnBufferIntoString(ArrayList<String> buffer,int len,int L){
    	int blankSpace = L-len;
    	int splitSize  = buffer.size()-1;
    	StringBuilder sb = new StringBuilder();
    	if(splitSize==0){
    		//only one word here
    		sb.append(buffer.get(0));
    		//fill others blank
    		for(int i=0;i<L-len;i++){
    			sb.append(' ');
    		}
    	}else if(blankSpace%splitSize==0){
    		//the blank can be spliced equally here
    		StringBuilder space = new StringBuilder();
    		for(int i=0;i<blankSpace/splitSize;i++)
    			space.append(' ');
    		sb.append(buffer.get(0));
    		for(int i=1;i<buffer.size();i++){
    			sb.append(space.toString()+buffer.get(i));
    		}
    	}else{
    		//the blank can not be spliced equally here
    		StringBuilder space = new StringBuilder();
    		int rest = blankSpace%splitSize;
    		for(int i=0;i<blankSpace/splitSize;i++)
    			space.append(' ');
    		sb.append(buffer.get(0));
    		for(int i=1;i<buffer.size();i++){
    			sb.append(space.toString()+(rest>0?" ":"")+buffer.get(i));
    			rest--;
    		}
    	}
    	return sb.toString();
    }
}