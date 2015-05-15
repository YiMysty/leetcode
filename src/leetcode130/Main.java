package leetcode130;

public class Main {
	public static void main(String args[]){
		Solution s = new Solution();
		char board[][] = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		int row = board.length;
		int col = board[0].length;
		s.solve(board);
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
