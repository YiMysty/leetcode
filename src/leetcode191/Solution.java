package leetcode191;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int dist = 0;
        for(int i=0;i<32;i++){
            dist += 1&n;
            n = n>>1;
        }
        return dist;
    }
}