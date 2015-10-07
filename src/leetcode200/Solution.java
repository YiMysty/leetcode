package leetcode200;

public class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0)
        	return 0;
        int visit[][] = new int[grid.length][grid[0].length];
        int count = 0;
        for(int i=0;i<grid.length;i++)
        	for(int j=0;j<grid[0].length;j++){
        		if(grid[i][j]=='1'&&visit[i][j]==0){
        			count++;
        			doVisit(grid,i,j,visit);
        			printMatrix(visit);
        		}
        	}
        return count;
    }
    public void doVisit(char grid[][],int i,int j,int visit[][]){
    	if(grid[i][j]=='1'&&visit[i][j]==0){
    		visit[i][j] = 1;
    		if(i>0)
    			doVisit(grid,i-1,j,visit);
    		if(j>0)
    			doVisit(grid,i,j-1,visit);
    		if(i<visit.length-1)
    			doVisit(grid,i+1,j,visit);
    		if(j<visit[0].length-1)
    			doVisit(grid,i,j+1,visit);
    	}
    }
    void printMatrix(int [][]num){
    	System.out.println("======");
    	for(int i=0;i<num.length;i++){
    		for(int j=0;j<num[0].length;j++){
    			System.out.print(" "+num[i][j]);
    		}
    		System.out.println();
    	}
    	System.out.println("======");
    }
    void printMatrix(char [][]num){
    	System.out.println("======");
    	for(int i=0;i<num.length;i++){
    		for(int j=0;j<num[0].length;j++){
    			System.out.print(" "+num[i][j]);
    		}
    		System.out.println();
    	}
    	System.out.println("======");
    }
}