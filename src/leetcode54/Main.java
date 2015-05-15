package leetcode54;

public class Main {
	public static void main(String args[]){
		Solution s = new Solution();
		int rows = 1;
		int cols = 2;
		int matrix[][] = new int [rows][cols];
		int count  = 1;
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++){
				matrix[i][j] = count++;
			}
		System.out.println(s.spiralOrder(matrix));
	}
}
