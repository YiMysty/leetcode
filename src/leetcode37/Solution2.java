package leetcode37;

import java.util.HashSet;
@SuppressWarnings("rawtypes")
public class Solution2 {
	HashSet[] Row = new HashSet[9];

	HashSet[] Col = new HashSet[9];
	HashSet[] Con = new HashSet[9];
	@SuppressWarnings("unchecked")
	public void solveSudoku(char[][] board) {
    	for(int i=0;i<board.length;i++){
    		Row[i] = new HashSet<Character>();
    		Col[i] = new HashSet<Character>();
    		Con[i] = new HashSet<Character>();
    	}
    	for(int i=0;i<9;i++)
    		for(int j=0;j<9;j++){
    			if(board[i][j]!='.'){
    				Row[i].add(board[i][j]);
    				Col[j].add(board[i][j]);
    				Con[(i/3)*3+(j/3)%3].add(board[i][j]);
    			}
    		}
    	fillBlank(board,0);
    }
    @SuppressWarnings("unchecked")
	public boolean fillBlank(char board[][],int pos){
    	if(pos==81)
    		return true;
    	int row = pos/9;
    	int col = pos%9;
    	if(board[row][col]!='.'){
    		if(fillBlank(board,pos+1))
    			return true;
    	}
    	else{
    		for(int i=0;i<9;i++){
    			if(valid(pos,board,i)){
    				char val = (char)(i+'1');
    				board[row][col] =val;
    				Row[row].add(val);
    				Col[col].add(val);
    				Con[(row/3)*3+(col/3)%3].add(val);
    				if(fillBlank(board,pos+1))
    					return true;
    				Row[row].remove(val);
    				Col[col].remove(val);
    				Con[(row/3)*3+(col/3)%3].remove(val);
    				board[row][col] ='.';
    			}
    		}
    	}
    	return false;
    }
    public boolean valid(int pos,char board[][],int num){
    	int row = pos/9;
    	int col = pos%9;
    	int no = (row/3)*3+(col/3)%3;
    	char val = (char)('1'+num-0);
    	if(!Row[row].contains(val)&&!Col[col].contains(val)&&!Con[no].contains(val))
    		return true;
    	return false;
    }
}
