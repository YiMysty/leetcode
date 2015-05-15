package leetcode16;
import java.util.Arrays;
public class Solution {
	public int threeSumClosest(int[] num, int target) {
		//the length of num here is longer than 3
		int closest = num[0]+num[1]+num[2];
		Arrays.sort(num);
		int prev = num[0]-1; //this part is possible overflow
		for(int i=0;i<num.length-2;i++){
			if(prev==num[i]) //remove the duplicate part
				continue;
			int low = i+1;
			int high = num.length-1;
			int goal = target-num[i];
			while(low<high){
				if(Math.abs(target-num[low]-num[i]-num[high])<Math.abs(target-closest))
					closest = num[low]+num[i]+num[high];
				if(num[low]+num[high]<goal){
					low++;
				}else if(num[low]+num[high]>goal){
					high--;
				}else{
					return target;
				}
			}
		}
		return closest;
	}
}