package leetcode1;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	//230ms
    public int[] twoSum(int[] numbers, int target) {
    	int low = 0;
    	int high = numbers.length-1;
    	int result [] = new int[2];
    	Container c []= new Container[numbers.length];
    	for(int i=0;i<numbers.length;i++)
    		c[i] = new Container(numbers[i],i);
    	Arrays.sort(c,new containerComparator());
    	while(low<high){
    		if(c[low].number+c[high].number<target)
    			low++;
    		else if(c[low].number+c[high].number>target)
    			high--;
    		else{
    			System.out.println(c[low].index);
    			System.out.println(c[high].index);
    			result[0] = c[low].index>c[high].index?c[high].index:c[low].index;
    			result[1] = c[low].index+c[high].index-result[0];
    			result[0]+=1;
    			result[1]+=1;
    			return result;
    		}
    	}
    	return result;
    }
    class Container{
    	public int number;
    	public int index;
		public Container(int number,int index){
			this.number = number;
			this.index = index;
		}
    }
    class containerComparator implements Comparator<Container>{
		@Override
		public int compare(Container o1, Container o2) {
			// TODO Auto-generated method stub
			return o1.number-o2.number;
		}
    }
}
