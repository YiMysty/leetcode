package leetcode223;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	return (C-A)*(D-B)+(G-E)*(H-F)-computeCommonArea(A,B,C,D,E,F,G,H);
    }
    public int computeCommonArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(isCross(A,B,C,D,E,F,G,H)) //then just the area of two rectangle.
        	return 0;
        //judge the contain situation
        if(A>=E&&C<=G&&D<=H&&B>=F){
        	return (C-A)*(D-B);
        }
        if(E>=A&&G<=C&&H<=D&&F>=B){
        	return (G-E)*(H-F);
        }
        return getWidth(A,C,E,G)*getHeight(B,D,F,H);
    }
    public boolean isCross(int A, int B, int C, int D, int E, int F, int G, int H){
    	if(C<=E||A>=G||B>=H||D<=F)
    		return true;
    	return false;
    }
    public int getWidth(int A,int C,int E,int G){
    	if(A<=E){
    		if(C<=G)
    			return C-E;
    		return G-E;
    	}else{
    		if(C>=G)
    			return G-A;
    		return C-A;
    	}
    }
    public int getHeight(int B,int D,int F,int H){
    	if(B<=F){
    		if(D>=H)
    			return H-F;
    		else
    			return D-F;
    	}else{
    		if(D>=H)
    			return H-B;
    		else
    			return D-B;
    	}
    }
}