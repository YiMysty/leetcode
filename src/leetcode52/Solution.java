package leetcode52;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int totalNQueens(int n) {
		return getSolutionToNQueens(0,n,new ArrayList<String>()).size();
    }
	public List<String[]> getSolutionToNQueens(int level,int total,List<String> trace){
		List<String[]> result = new ArrayList<String[]>();
		if(level==total){//find the result
			String sol [] = new String[trace.size()];
			for(int i=0;i<trace.size();i++)
				sol[i] = trace.get(i);
			result.add(sol);
			return result;
		}
		StringBuilder buffer = new StringBuilder();
		for(int i=0;i<total;i++)
			buffer.append('.');
		for(int i=0;i<total;i++){
			if(valid(trace,i,total)){
				buffer.setCharAt(i, 'Q');
				trace.add(buffer.toString());
				result.addAll(getSolutionToNQueens(level+1,total,new ArrayList<String>(trace)));
				trace.remove(trace.size()-1);
				buffer.setCharAt(i, '.');
			}
		}
		return result;
	}
	public boolean valid(List<String> trace,int pos,int total){
		int row = trace.size();
		for(int i=0;i<row;i++) //check the row
			if(trace.get(i).charAt(pos)=='Q')
				return false;
		for(int i=pos-1,j=row-1;i>=0&&j>=0;i--,j--){ //check the left down
			if(trace.get(j).charAt(i)=='Q')
				return false;
		}
		for(int i=pos+1,j=row-1;i<total&&j>=0;i++,j--){
			if(trace.get(j).charAt(i)=='Q')
				return false;
		}
		return true;
	}
}