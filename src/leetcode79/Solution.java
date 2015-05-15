package leetcode79;

public class Solution {
    public boolean exist(char[][] board, String word) {
    	for(int i=0;i<board.length;i++)
    		for(int j=0;j<board[0].length;j++){
    			if(board[i][j]==word.charAt(0)){
	    			if(searchForCombination(board,i,j,word,0))
	    				return true;
    			}
    	}
    	return false;
    }
    public boolean searchForCombination(char [][] board,int row,int col,String word,int pos){
    	if(pos==word.length())
    		return true;		//find one
    	if(board[row][col]!=word.charAt(pos))
    		return false;
    	char buff = board[row][col];
    	board[row][col] = '.'; //invalid this point
    	if(row>0){
    		if(searchForCombination(board,row-1,col,word,pos+1))
    			return true;
    	}if(col>0){
    		if(searchForCombination(board,row,col-1,word,pos+1))
    			return true;
    	}if(row<board.length-1){
    		if(searchForCombination(board,row+1,col,word,pos+1))
    			return true;
    	}if(col<board[0].length-1){
    		if(searchForCombination(board,row,col+1,word,pos+1))
    			return true;
    	}
    	if((row==0||col==0||row==board.length-1||col==board[0].length-1)&&pos+1==word.length())
    		return true;
    	board[row][col] = buff;
    	return false;
    }
}