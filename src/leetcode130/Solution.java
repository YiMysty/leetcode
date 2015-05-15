package leetcode130;

public class Solution {
	char board[][];
	public void solve(char[][] board1) {
    	int row = board1.length;
    	if(row==0)
    		return;
    	int col = board1[0].length;
    	if(row<=2||col<=2)
    		return;
    	this.board = board1;
    	for(int j=0;j<col;j++)//the first row and the last row
    	{
    		if(board[0][j]=='O')
    		{
    			board[0][j] = '#';
    			dfs(1,j);
    		}
    		if(board[row-1][j]=='O')
    		{
    			board[row-1][j] ='#';
    			dfs(row-2,j);
    		}
    	}
    	for(int i=0;i<row;i++)
    	{
    		if(board[i][0]=='O')
    		{
    			board[i][0] = '#';
    			dfs(i,1);
    		}
    		if(board[i][col-1]=='O')
    		{
    			board[i][col-1]='#';
    			dfs(i,col-2);
    		}
    	}
    	for(int i=0;i<row;i++)
    		for(int j=0;j<col;j++){
    			if(board[i][j]=='#')
    				board[i][j] = 'O';
    			else
    				board[i][j] = 'X';
    	}
    	return;
    }
    public void dfs(int i,int j)
    {
    	if(board[i][j]=='X'||board[i][j]=='#')
    	{
    		return;
    	}
    	else
    	{
    		board[i][j] = '#';
    		if(i>0&&board[i-1][j]=='O')
    			dfs(i-1,j);
    		if(j>0&&board[i][j-1]=='O')
    			dfs(i,j-1);
    		if(i<board.length-1&&board[i+1][j]=='O')
    			dfs(i+1,j);
    		if(j<board[0].length-1&&board[i][j+1]=='O')
    			dfs(i,j+1);
    		return;
    	}
    }
}