package leetcode225;

import java.util.LinkedList;

class MyStack {
    // Push element x onto stack.
	LinkedList<Integer> queue = new LinkedList<Integer>();
    public void push(int x) {
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	queue.pollLast();
    }

    // Get the top element.
    public int top() {
        return queue.peekLast();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}