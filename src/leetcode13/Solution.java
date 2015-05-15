package leetcode13;

import java.util.List;
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int result[][] = new int[2][row+1];
        for(int i=0;i<=row;i++){
            result[0][i] = 0;
            result[1][i] = 0;
        }
        for(int i=0;i<row;i++)
            for(int j=0;j<=i;j++){
                if(j-1<0)
                    result[i%2][j] = triangle.get(i).get(j)+result[(i+1)%2][j];
                else if(j==i)
                    result[i%2][j] = triangle.get(i).get(j)+result[(i+1)%2][j-1];
                else
                    result[i%2][j] = triangle.get(i).get(j)+minium(result[(i+1)%2][j-1],result[(i+1)%2][j]);
            }
        int min = 999999;
        int order = (row-1)%2;
        for(int i=0;i<row;i++){
            if(result[order][i]<min)
                min = result[order][i];
        }
        return min;
    }
    public int minium(int a,int b){
    	if(a<b)
    		return a;
    	return b;
    }
}