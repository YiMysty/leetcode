package leetcode284;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> iterator;
	Integer Next ;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
		this.iterator = iterator;
		Next = null;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(Next==null){
        	Next = iterator.next();
        }
        return Next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if(Next!=null){
			int number = Next;
			Next = null;
			return number;
		}
		return iterator.next();
	}

	@Override
	public boolean hasNext() {
		return this.iterator.hasNext()||Next!=null;
	}
}