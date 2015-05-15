package leetcode37;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	@SuppressWarnings("unchecked")
	HashSet <Character> set[][] = new HashSet[3][9];
	ArrayList<Number> array = new ArrayList<Number>();
	int row = 0;
	int col = 1;
	int ind = 2;
	boolean end = false;
    public void solveSudoku(char[][] board) {
        init(board);
        solver(board,0);
    }
    public boolean solver(char board[][],int pos){
    	if(pos==81)
    		return true;
    	int r = pos/9;
    	int c = pos%9;
    	if(board[r][c]!='.')
    	{
    		if(solver(board,pos+1))
    			return true;
    	}
    	else
    	{
    		Set<Character> mySet = InterSection(set[row][r],InterSection(set[col][c],set[ind][(r/3)*3+c/3]));
    		for(Character cc:mySet)
    		{
    			board[r][c] = cc;
    			set[row][r].remove(cc);
    			set[col][c].remove(cc);
    			set[ind][(r/3)*3+c/3].remove(cc);
    			if(solver(board,pos+1))
    				return true;
    			set[row][r].add(cc);
    			set[col][c].add(cc);
    			set[ind][(r/3)*3+c/3].add(cc);
    			board[r][c] = '.';
    		}
    	}
    	return false;
    }
    public void init(char board[][]){
    	for(int i=0;i<9;i++){
    		for(int j=0;j<3;j++){
    			set[j][i] = new HashSet<Character>();
    			for(int k=0;k<9;k++){
    				set[j][i].add((char)('1'+k));
    			}
    		}
    	}
        for(int i=0;i<9;i++){
        	for(int j=0;j<9;j++){
        		if(board[i][j]!='.'){
        			set[row][i].remove(board[i][j]);
        			set[col][j].remove(board[i][j]);
        			set[ind][(i/3)*3+j/3].remove(board[i][j]);
        		}
        	}
        }
    }
    public Set<Character> InterSection(Set<Character> s1,Set<Character> s2){
    	Set<Character> result = new HashSet<Character>();
    	for(Character c:s1){
    		if(s2.contains(c))
    			result.add(c);
    	}
    	return result;
    }
}