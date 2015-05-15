package leetcode57;
import java.util.ArrayList;
import java.util.List;
import basic.Interval;
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<Interval>();
    	if(intervals.size()==0){
    		result.add(newInterval);
    		return result;
    	}
        int index = 0;
        while(index<intervals.size()&&newInterval.start>intervals.get(index).start){
        	result.add(intervals.get(index));
        	index++;
        }
        Interval prev = null;
        if(result.size()==0){
        	prev  = newInterval;
        }else{
        	if(result.get(result.size()-1).end<newInterval.start)
        		prev = newInterval;
        	else{
        		prev = result.remove(result.size()-1);
        		prev.end = Math.max(newInterval.end, prev.end);
        	}
        }
        for(int i=index;i<intervals.size();i++){
        	if(prev.end<intervals.get(i).start){
        		result.add(prev);
        		prev = intervals.get(i);
        	}else{
        		prev.end = Math.max(intervals.get(i).end, prev.end);
        	}
        }
        result.add(prev);
        return result;
    }
}