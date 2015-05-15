package leetcode164;

import java.util.ArrayList;
import java.util.List;
public class Solution {
    @SuppressWarnings("unchecked")
	public int maximumGap(int[] num) {
        if(num.length<2)
            return 0;
        if(num.length==2)
        	return Math.abs(num[0]-num[1]);
        int max = num[0];
        int min = num[0];
        for(int i=0;i<num.length;i++){
            max = Math.max(num[i],max);
            min = Math.min(num[i],min);
        }
        float range = (float)(max-min)/(float)(num.length-1);
        List<Integer> bucket[] = new List[num.length-1];
        for(int i=0;i<bucket.length;i++)
        	bucket[i] = new ArrayList<Integer>();
        for(int i=0;i<num.length;i++){
        	int no = (int) Math.floor((float)(num[i]-min)/range);
        	if(no>=num.length-1)
        		no=num.length-2;
        	bucket[no].add(num[i]);
        }
        ArrayList<Gap> result = new ArrayList<Gap>();
        for(List<Integer> b:bucket){
        	Gap Temp = findGap(b);
        	if(Temp!=null)
        		result.add(Temp);
        }
        if(result.size()==0)
        	return max-min;
        int MaxiumGap = 0;
        int past = min;
        for(Gap g:result){
        	MaxiumGap = Math.max(MaxiumGap, g.min-past);
        	past = g.max;
        }
        return MaxiumGap;
    }
    public Gap findGap(List<Integer> bucket){
    	if(bucket.size()==0)
    		return null;
    	Gap returnValue = new Gap();
    	returnValue.min = bucket.get(0);
    	returnValue.max = bucket.get(0);
    	for(Integer i:bucket)
    	{
    		returnValue.min = Math.min(returnValue.min, i);
    		returnValue.max = Math.max(returnValue.max, i);
    	}
    	return returnValue;
    }
    class Gap
    {
    	public int min;
    	public int max;
    }
}