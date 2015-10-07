package leetcode200;

public class Main {
	public static void main(String args[]){
		Solution s = new Solution();
		String ss[] = new String[]{"111","010","111"};
		char c[][] = new char [ss.length][ss[0].length()];
		for(int i=0;i<ss.length;i++)
			for(int j=0;j<ss[0].length();j++){
				c[i][j] = ss[i].charAt(j);
			}
		System.out.println(s.numIslands(c));
	}
}
