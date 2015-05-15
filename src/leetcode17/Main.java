package leetcode17;

public class Main {
	public static void main(String args[]){
		String s ="23";
		Solution solution = new Solution();
		for(String ss:solution.letterCombinations(s))
			System.out.println(ss);
	}
}
