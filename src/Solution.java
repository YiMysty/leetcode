
public class Solution {
    public void gameOfLife(int[][] board) {
        if(board.length==0)
            return;
         
         // define 0->0:0  1->1:1  1->0:2 0->1:3 
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int neighbor = count(board,i,j);
                System.out.println(neighbor);
                if(board[i][j]==1){ //means the cell is alive..
                    if(neighbor<2){
                        board[i][j] = 2;
                    }else if(neighbor==2||neighbor==3){
                        board[i][j] = 1;
                    }else{
                        board[i][j] = 2;
                    }
                }else{
                    if(neighbor==3)
                        board[i][j] = 3;
                }
            }
        }
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==2)
                    board[i][j] = 0;
                else if(board[i][j]==3)
                    board[i][j] = 1;
            }
        
    }
    
    public int count(int board[][], int i, int j){
        int count = 0;
        if(i>=1){
            if(j>=1){
                count += (board[i-1][j-1] ==2 ||board[i-1][j-1]==1)?1:0;
            }
            // totally above..
            count += (board[i-1][j] ==2 ||board[i-1][j]==1)?1:0;
            if(j<board[i].length-1)
                count +=(board[i-1][j+1] ==2 ||board[i-1][j+1]==1)?1:0;
        }
        if(j>=1)
            count += (board[i][j-1] ==2 ||board[i][j-1]==1)?1:0;
        if(j+1<board[i].length)
            count += (board[i][j+1] ==2 ||board[i][j+1]==1)?1:0;
        
        if(i<board.length-1){
            if(j>=1){
                count += (board[i+1][j-1] ==2 ||board[i+1][j-1]==1)?1:0;
            }
            // totally above..
            count += (board[i+1][j] ==2 ||board[i+1][j]==1)?1:0;
            if(j+1<board[i].length)
                count +=(board[i+1][j+1] ==2 ||board[i+1][j+1]==1)?1:0;
        }
        return count;
    }
    
    public static void main(String args[]){
    	Solution s = new Solution();
    	int board[][] = new int[][]{{1,1},{1,0}};
    	s.gameOfLife(board);
    }
}