package leetcode80;

public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length<2)
            return A.length;
        int index = 0;
        int insertionPosition = 0;
        while(index<A.length){
            if(index+1<A.length){
                if(A[index]==A[index+1]){ //this number equals to his next.
                    int num = A[index];
                    A[insertionPosition++] = A[index];
                    A[insertionPosition++] = A[index];
                    index+=2;//jump to the next element and find is any same elements
                    while(index<A.length&&A[index]==num){
                        index++;
                    }
                    //the first index that is not duplicate.
                }else{ //this number is not equal to its next.
                    A[insertionPosition++] = A[index];
                    index++;
                }
            }else{
                A[insertionPosition++] = A[index];
                index++;
            }
        }
        return insertionPosition;
    }
}