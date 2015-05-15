package leetcode56;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import basic.Interval;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Interval> merge(List<Interval> intervals) {
    	List<Interval> result = new ArrayList<Interval>();
    	if(intervals.size()==0)
    		return result;
    	Collections.sort(intervals,new Comparator(){
			public int compare(Object o1, Object o2) {
				return ((Interval)o1).start-((Interval)o2).start;
			}
    	});
    	Interval prev = intervals.get(0);
    	for(int i=1;i<intervals.size();i++){
    		Interval cur = intervals.get(i);
    		if(cur.start>prev.end){
    			result.add(prev);
    			prev = cur;
    		}else if(cur.end<prev.end){
    			continue;
    		}else{
    			prev.end = cur.end;
    		}
    	}
    	result.add(prev);
    	return result;
    }
}