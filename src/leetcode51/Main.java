package leetcode51;

import java.util.List;

public class Main {
	public static void main(String args[]){
		Solution s= new Solution();
		printQueens(s.solveNQueens(5));
	}
	
	public static void printQueens(List<String[]> list){
		for(String s[]:list){
			System.out.println("=====");
			for(String ss:s)
				System.out.println(ss);
		}
	}
}
