package leetcode210;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int result [] =new int[numCourses];
        if(prerequisites==null||prerequisites.length==0){
            result = new int[0];
            return result;
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Map<Integer,List<Integer>> graph = new HashMap<Integer,List<Integer>>(); 
        for(int i=0;i<numCourses;i++){
        	graph.put(i, new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++){
            if(map.containsKey(prerequisites[i][1])){
                map.put(prerequisites[i][1],map.get(prerequisites[i][1])+1);
            }else{
                map.put(prerequisites[i][1],1);
            }
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        //find the node indegree is 0.
        for(int i=0;i<prerequisites.length;i++){
            if(!map.containsKey(prerequisites[i][0])&&!stack.contains(prerequisites[i][0])){
                stack.add(prerequisites[i][0]);
            }
        }
        //map is used to store the indegree.
        int index = 0;
        while(!stack.isEmpty()){
            result[index] = stack.pop();
            Integer ord       = result[index++];
            for(Integer node:graph.get(ord)){
                map.put(node,map.get(node)-1);
                if(map.get(node)==0){
                    stack.add(node);
                    map.remove(node);
                }
            }
            graph.remove(ord);
        }
       
        if(graph.isEmpty())
            return result;
         result = new int[0];
        return result;
    }
    
}