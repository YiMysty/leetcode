package leetcode36;
import java.util.HashSet;
public class Solution {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean isValidSudoku(char[][] board) {
    	//Actually not hash map here.
    	HashSet set[] = new HashSet[board.length];
    	for(int i=0;i<board.length;i++)
    		set[i] = new HashSet<Character>();
    	for(int i=0;i<board.length;i++){
    		HashSet<Character> Row = new HashSet<Character>();
    		HashSet<Character> Col = new HashSet<Character>();
    		for(int j=0;j<board[0].length;j++){
    			int setNum = 3*(i/3)+(j/3)%3;
    			if(Row.contains(board[i][j])||Col.contains(board[j][i])||set[setNum].contains(board[i][j]))
    				return false;
    			if(board[i][j]!='.'){
    				Row.add(board[i][j]);
    				set[setNum].add(board[i][j]);
    			}
    			if(board[j][i]!='.')
    				Col.add(board[j][i]);
    		}
    	}
    	
    	return true;
    }
}